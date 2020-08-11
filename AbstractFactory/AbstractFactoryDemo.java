
public class AbstractFactoryDemo {

    public static void main(String[] args) {

        FactoryCreator creator = new FactoryCreator();

        TransportationFactory factory = (TransportationFactory)creator.getFactory("Tranportation");

  
         Transportation transportation = factory.getTransportation("train");
        transportation.move("深圳");

        DegreeFactory factory1 = (DegreeFactory)creator.getFactory("Degree");
         Degree degree = factory1.getDegree(2);
        degree.move(2);

    }

}