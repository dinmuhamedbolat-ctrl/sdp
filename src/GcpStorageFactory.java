public class GcpStorageFactory extends StorageFactory {
    @Override
    public Storage createStorage() {
        return new GCSStorage();
    }
}
