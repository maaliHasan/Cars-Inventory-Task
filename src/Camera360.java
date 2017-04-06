/**
 * Created by mhasan on 4/6/2017.
 */
public class Camera360 extends FeatureDecorator {
    Car car;

    public Camera360(Car car) {
        this.car = car;
    }

    @Override
    public String getDescription() {
        return car.getDescription() + "360 Camera ,";
    }

    @Override
    public double cost() {
        double cost = car.cost();
        return cost + 200;
    }
}
