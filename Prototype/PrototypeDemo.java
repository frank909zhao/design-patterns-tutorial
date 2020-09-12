
public class PrototypeDemo {

    public static void main(String[] args) {
        
        String colorlist[] = {"red","green","yellow","crown","pink","blue","purple"};

        CalabashBrother brother1 = new CalabashBrother("brother1",colorlist[0]);
        System.out.println(brother1);

        for (int i = 1;i < 7;i++) {
            CalabashBrother brother = (CalabashBrother)brother1.clone();
            brother.name = "brother"+(i+1);
            brother.color = colorlist[i];
            System.out.println(brother);
        }

    }
}