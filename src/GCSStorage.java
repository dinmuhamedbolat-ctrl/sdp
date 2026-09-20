public class GCSStorage implements Storage {
    @Override
    public void upload(String fileName) {
        System.out.println("Uploading " + fileName + " to Google Cloud Storage...");
    }
}
