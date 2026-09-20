// 1. Product (Интерфейс продукта)
public interface Storage {
    void upload(String fileName);
}

// 2. Concrete Products (Конкретные продукты)
public class S3Storage implements Storage {
    @Override
    public void upload(String fileName) {
        System.out.println("Uploading " + fileName + " to AWS S3...");
    }
}

public class GCSStorage implements Storage {
    @Override
    public void upload(String fileName) {
        System.out.println("Uploading " + fileName + " to Google Cloud Storage...");
    }
}

// 3. Creator (Абстрактная фабрика для одного продукта)
public abstract class StorageFactory {
    public abstract Storage createStorage();

    // Фабричный метод позволяет добавить общую логику здесь, если нужно
    public void deployStorage(String fileName) {
        Storage storage = createStorage();
        storage.upload(fileName);
    }
}

// 4. Concrete Creators (Конкретные создатели)
public class AwsStorageFactory extends StorageFactory {
    @Override
    public Storage createStorage() {
        return new S3Storage();
    }
}

public class GcpStorageFactory extends StorageFactory {
    @Override
    public Storage createStorage() {
        return new GCSStorage();
    }
}