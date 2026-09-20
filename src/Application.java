public class Application {
    private final Storage storage;
    private final Compute compute;

    // Клиенту вообще неважно, AWS это или GCP. Он принимает абстракцию.
    public Application(CloudFactory factory) {
        this.storage = factory.createStorage();
        this.compute = factory.createCompute();
    }

    public void startApp() {
        compute.runServer();
        storage.upload("app-data.json");
    }

    public static void main(String[] args) {
        // Конфигурация происходит только ОДИН раз при запуске.
        // Никаких огромных switch-case внутри бизнес-логики!
        String platform = "AWS"; // В реальности берется из конфига/переменных окружения

        CloudFactory factory;
        if ("AWS".equalsIgnoreCase(platform)) {
            factory = new AwsCloudFactory();
        } else {
            factory = new GcpCloudFactory();
        }

        Application app = new Application(factory);
        app.startApp();
    }
}