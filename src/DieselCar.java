public class DieselCar extends AFuelCar {

    protected boolean particleFilter;
    protected int registrationFee = 0;

    public DieselCar(String registrationsNumber, String make, String model, int numberOfDoors, int kmPrLitre, boolean particleFilter) {
        super(registrationsNumber, make, model, numberOfDoors, kmPrLitre);
        this.particleFilter = particleFilter;
    }

    @Override
    public String getFuelType() {
        return "Diesel";
    }

    @Override
    public int KmPrLitre() {
        return kmPrLitre;
    }

    @Override
    public String getRegistrationsNumber() {
        return registrationsNumber;
    }

    @Override
    public String getMake() {
        return make;
    }

    @Override
    public String getModel() {
        return model;
    }

    @Override
    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public boolean hasParticleFilter() {
        if (particleFilter) return true;

        else
            registrationFee += 1000;
        return false;
    }

    @Override
    public int getRegistrationFee() {

        if (KmPrLitre() < 5) {
            registrationFee += 15260;
        } else if (KmPrLitre() < 10) {
            registrationFee += 2770;
        } else if (KmPrLitre() < 15) {
            registrationFee += 1850;
        } else if (KmPrLitre() < 20) {
            registrationFee += 1390;
        } else {
            registrationFee += 130;
        }
        return registrationFee;
    }

    @Override
    public String toString() {
        return "DieselCar{" +
                "registrationFee=" + registrationFee +
                ", kmPrLitre=" + kmPrLitre +
                ", registrationsNumber='" + registrationsNumber + '\'' +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", numberOfDoors=" + numberOfDoors +
                '}';
    }
}