// 3. Creator (Абстрактная фабрика для одного продукта)
public abstract class StorageFactory {
    public abstract Storage createStorage();

    // Фабричный метод позволяет добавить общую логику здесь, если нужно
    public void deployStorage(String fileName) {
        Storage storage = createStorage();
        storage.upload(fileName);
    }
}
