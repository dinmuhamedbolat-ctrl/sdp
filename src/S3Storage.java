// 2. Concrete Products (Конкретные продукты)
public class S3Storage implements Storage {
    @Override
    public void upload(String fileName) {
        System.out.println("Uploading " + fileName + " to AWS S3...");
    }
}
