// 2. Concrete Products для нового типа
public class EC2Compute implements Compute {
    @Override
    public void runServer() {
        System.out.println("Running server on AWS EC2...");
    }
}
