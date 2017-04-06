/**
 * Created by mhasan on 4/6/2017.
 */
public class Sensors extends FeatureDecorator {
    Car car;

    public Sensors(Car car) {
        this.car = car;
    }

    @Override
    public double cost() {
        double cost = car.cost();
        return cost + 150;
    }

    @Override
    public String getDescription() {
        return car.getDescription() + "Sensors ,";
    }
}
