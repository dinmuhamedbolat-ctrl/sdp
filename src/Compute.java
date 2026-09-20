// 1. Abstract Products
// Storage уже есть из кода выше
public interface Compute {
    void runServer();
}

// 2. Concrete Products для нового типа
public class EC2Compute implements Compute {
    @Override
    public void runServer() {
        System.out.println("Running server on AWS EC2...");
    }
}

public class GCECompute implements Compute {
    @Override
    public void runServer() {
        System.out.println("Running server on Google Compute Engine...");
    }
}

// 3. Abstract Factory (Интерфейс фабрики для СЕМЕЙСТВА)
public interface CloudFactory {
    Storage createStorage();
    Compute createCompute();
}

// 4. Concrete Factories (Гарантируют совместимость семейства)
public class AwsCloudFactory implements CloudFactory {
    @Override
    public Storage createStorage() { return new S3Storage(); }

    @Override
    public Compute createCompute() { return new EC2Compute(); }
}

public class GcpCloudFactory implements CloudFactory {
    @Override
    public Storage createStorage() { return new GCSStorage(); }

    @Override
    public Compute createCompute() { return new GCECompute(); }
}