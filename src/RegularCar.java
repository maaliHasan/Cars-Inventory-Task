/**
 * Created by mhasan on 4/6/2017.
 */
public class RegularCar extends Car {
    public RegularCar() {
        description = "Regular Car with ";
    }

    @Override
    public double cost() {
        return 100000;
    }

    public String getDescription() {
        return description;
    }
}
