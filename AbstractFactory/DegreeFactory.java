
public class DegreeFactory extends   AbstractFactory {

   @Override
   public Transportation getTransportation(String type){return  null;}

   @Override
    public Degree getDegree(int  type){
        switch(type)
        {
            case 0:
                return new  Economical();
            
            case 1:
                return  new Comfortable();

            case 2:
                return new Luxurious();
         
            default:
                break;
        }
        return null;
    }
    
}