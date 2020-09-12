
public class CalabashBrother implements  Cloneable{
    
    String name;
    String color;

    Calabash calabash = new Calabash();

    public CalabashBrother(String name,String color){
        System.out.println("---Construct obj---");
        this.name = name;
        this.color = color;
    }

    @Override
    public String toString(){
        return "ID:"+hashCode()+" My name is "+this.name+" my skin is " + this.color;
    }

    @Override
    protected Object clone(){
        CalabashBrother brother = null;

        try {
            brother = (CalabashBrother) super.clone();
            brother.calabash = (Calabash) calabash.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return brother;
    }
}