/**
 * Created by mhasan on 4/6/2017.
 */
public class Led extends FeatureDecorator {
    Car car;

    public Led(Car car) {
        this.car = car;
    }

    @Override
    public double cost() {
        double cost = car.cost();
        return cost + 350;
    }

    @Override
    public String getDescription() {
        return car.getDescription() + "Led ,";
    }
}
