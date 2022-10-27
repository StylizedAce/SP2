public abstract class ACar implements Car {

    protected String registrationsNumber;
    protected String make;
    protected String model;
    protected int numberOfDoors;

    public ACar(String registrationsNumber, String make, String model, int numberOfDoors) {
        this.registrationsNumber = registrationsNumber;
        this.make = make;
        this.model = model;
        this.numberOfDoors = numberOfDoors;
    }

    public String getRegistrationsNumber() {
        return registrationsNumber;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }
}
