
public class TransportationFactory  extends AbstractFactory {

    @Override
    public Transportation getTransportation(String type){
        if(type == null){
            return null;
        }        
        if(type.equalsIgnoreCase("TRAIN")){
            return new Train();
        } else if(type.equalsIgnoreCase("BUS")){
            return new Bus();
        } else if(type.equalsIgnoreCase("PLANE")){
            return new Plane();
        }
        return null;
    }

    @Override
    public Degree getDegree(int type) {
        // TODO Auto-generated method stub
        return null;
    }
    
}