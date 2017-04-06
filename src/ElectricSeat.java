/**
 * Created by mhasan on 4/6/2017.
 */
public class ElectricSeat extends FeatureDecorator {
    Car car;

    public ElectricSeat(Car car) {
        this.car = car;
    }

    @Override
    public double cost() {
        double cost = car.cost();
        return cost + 600;
    }

    @Override
    public String getDescription() {
        return car.getDescription() + " Electric Seat , ";
    }
}
