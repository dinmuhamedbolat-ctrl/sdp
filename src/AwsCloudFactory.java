// 4. Concrete Factories (Гарантируют совместимость семейства)
public class AwsCloudFactory implements CloudFactory {
    @Override
    public Storage createStorage() { return new S3Storage(); }

    @Override
    public Compute createCompute() { return new EC2Compute(); }
}
