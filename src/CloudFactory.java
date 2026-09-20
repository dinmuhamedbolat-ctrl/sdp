// 3. Abstract Factory (Интерфейс фабрики для СЕМЕЙСТВА)
public interface CloudFactory {
    Storage createStorage();
    Compute createCompute();
}
