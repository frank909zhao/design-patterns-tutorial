
public class Product {

    public int level;
    public String color;
    public String text;
    public String fruit;

    public Product(){}

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "A cake with " + level + " level,"+" a great "+color+" cream,"+" some "+fruit+" and the drawing  text is :"+text;
    }

}