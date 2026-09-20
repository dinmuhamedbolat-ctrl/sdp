// 4. Concrete Creators (Конкретные создатели)
public class AwsStorageFactory extends StorageFactory {
    @Override
    public Storage createStorage() {
        return new S3Storage();
    }
}
