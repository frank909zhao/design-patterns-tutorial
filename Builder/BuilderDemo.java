
public class BuilderDemo {

    public static void main(String[] args) {
        Director director = new Director();
        ConcreteCakeBuilder builder = new ConcreteCakeBuilder();
        director.makeCake(builder);

        Product cake = builder.getCake();

        System.out.println(cake.toString());
    }
}