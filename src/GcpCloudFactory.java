public class GcpCloudFactory implements CloudFactory {
    @Override
    public Storage createStorage() { return new GCSStorage(); }

    @Override
    public Compute createCompute() { return new GCECompute(); }
}
