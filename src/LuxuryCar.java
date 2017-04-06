/**
 * Created by mhasan on 4/6/2017.
 */
public class LuxuryCar extends Car {
    public LuxuryCar() {
        description = "Luxury Car with ";
    }

    @Override
    public double cost() {
        return 160000;
    }
}
