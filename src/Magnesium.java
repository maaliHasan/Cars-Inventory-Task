/**
 * Created by mhasan on 4/6/2017.
 */
public class Magnesium extends FeatureDecorator {
    Car car;

    public Magnesium(Car car) {
        this.car = car;
    }

    @Override
    public double cost() {
        double cost = car.cost();
        return cost + 400;
    }

    @Override
    public String getDescription() {
        return car.getDescription() + "Magnesium ,";
    }
}
