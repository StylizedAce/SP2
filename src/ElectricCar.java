public class ElectricCar extends ACar {

   public int batteryCapacity;
   public int maxRange;



   public ElectricCar(String registrationsNumber, String make, String model, int numberOfDoors, int batteryCapacity, int maxRange) {
        super(registrationsNumber, make, model, numberOfDoors);
        this.batteryCapacity = batteryCapacity;
        this.maxRange = maxRange;
    }


    public int getBatteryCapacity () {
       return batteryCapacity;
    }

    public int getMaxRangeKm() {
       return maxRange;
    }

    public int getWhPrKm() {
       return ((getBatteryCapacity() * 1000) / getMaxRangeKm());
    }

    @Override
    public int getRegistrationFee() {
        int kmPrLitre = Math.round(100 / (getWhPrKm() / 91.25f));
        if (kmPrLitre < 5) {
            return 10470;
        } else if (kmPrLitre < 10) {
            return 5500;
        } else if (kmPrLitre < 15) {
            return 2340;
        } else if (kmPrLitre < 20) {
            return 1050;
        } else {
            return 330;
        }
    }

    @Override
    public String toString() {
        return "ElectricCar{" +
                "batteryCapacity=" + batteryCapacity +
                ", maxRange=" + maxRange +
                ", registrationsNumber='" + registrationsNumber + '\'' +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", numberOfDoors=" + numberOfDoors +
                '}';
    }
}
