
public class ConcreteCakeBuilder  extends CakeBuilder {

    private Product cake = new Product();

    public ConcreteCakeBuilder(){};

    public  void buildCake(int level){
        cake.level = level;
    }
    public void buildCream(String color){
        cake.color = color;
    }
    public void buildText(String text){
        cake.text = text;
    }
    public void buildFruit(String type){
        cake.fruit = type;
    }
    public Product getCake(){
        return cake;
    }
}