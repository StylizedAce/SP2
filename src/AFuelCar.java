public abstract class AFuelCar extends ACar {

   protected int kmPrLitre;

    public AFuelCar(String registrationsNumber, String make, String model, int numberOfDoors, int kmPrLitre) {
        super(registrationsNumber, make, model, numberOfDoors);
        this.kmPrLitre = kmPrLitre;
    }


    public abstract String getFuelType();

    public int KmPrLitre() {
        return kmPrLitre;
    }

    @Override
    public String toString() {
        return "AFuelCar{" +
                "kmPrLitre=" + kmPrLitre +
                ", registrationsNumber='" + registrationsNumber + '\'' +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", numberOfDoors=" + numberOfDoors +
                '}';
    }
}
