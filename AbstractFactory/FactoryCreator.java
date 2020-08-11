
public class FactoryCreator {

    public AbstractFactory  getFactory(String type) {
        if(type == null){
            return null;
        }        
        if(type.equalsIgnoreCase("Tranportation")){
            return new TransportationFactory();
        } 

        return new DegreeFactory();
    }


}