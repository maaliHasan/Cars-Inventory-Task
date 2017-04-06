/**
 * Created by mhasan on 4/6/2017.
 */
public class CarInventory {
    public  static void main(String args[]){

        Car car =new RegularCar();
        FeatureDecorator featureDecorator = new Led(car);
        FeatureDecorator featureDecorator1= new ElectricSeat(featureDecorator);
        FeatureDecorator featureDecorator2= new Camera360(featureDecorator1);

        System.out.println(featureDecorator2.getDescription());
        System.out.print("The total cost is "+ featureDecorator2.cost()+"$");
    }
}
