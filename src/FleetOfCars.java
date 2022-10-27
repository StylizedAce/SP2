import java.util.ArrayList;

public class FleetOfCars {

    private final ArrayList<Car> cars = new ArrayList<>();

    public FleetOfCars() { }

    public void addCar(Car car) {
        cars.add(car);
    }

    public int getTotalRegistrationFeeForFleet() {
        int totalRegistrationFee = 0;
        for (Car car : cars) {
            totalRegistrationFee += car.getRegistrationFee();
        }
        return totalRegistrationFee;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Car car : cars) {
            sb.append(car).append("\n");
        }
        return sb.toString();
    }
}