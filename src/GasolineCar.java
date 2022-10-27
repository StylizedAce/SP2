public class GasolineCar extends AFuelCar {


    public GasolineCar(String registrationsNumber, String make, String model, int numberOfDoors, int kmPrLitre) {
        super(registrationsNumber, make, model, numberOfDoors, kmPrLitre);
    }

    @Override
    public String getFuelType() {
        return "Gasoline";
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
    public int KmPrLitre() {
        return kmPrLitre;
    }

    @Override
    public String getRegistrationsNumber() {
        return registrationsNumber;
    }


    @Override
    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    @Override
    public int getRegistrationFee() {
        if (KmPrLitre() >= 20 && KmPrLitre() < 50)
            return 330;
        else if (KmPrLitre() >= 15 && KmPrLitre() < 20)
            return 1050;
        else if (KmPrLitre() >= 10 && KmPrLitre() < 15)
            return 2340;
        else if (KmPrLitre() >= 5 && KmPrLitre() < 10)
            return 5500;
        else if (KmPrLitre() < 5)
            return 10470;
        else
            return 0;
    }

    @Override
    public String toString() {
        return "GasolineCar{" +
                "kmPrLitre=" + kmPrLitre +
                ", registrationsNumber='" + registrationsNumber + '\'' +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", numberOfDoors=" + numberOfDoors +
                '}';
    }
}
