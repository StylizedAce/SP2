public class Main {

    public static void main(String[] args) {
        FleetOfCars fleetOfCars = new FleetOfCars();

        fleetOfCars.addCar(new GasolineCar("AB 12 345", "Ford", "Focus", 5, 20));
        fleetOfCars.addCar(new GasolineCar("CD 34 567", "Ford", "Mustang", 5, 10));
        fleetOfCars.addCar(new GasolineCar("EF 56 789", "Ford", "Mondeo", 5, 42));

        fleetOfCars.addCar(new DieselCar("GH 78 901", "VW", "Golf GTI", 5, 39, true));
        fleetOfCars.addCar(new DieselCar("IJ 90 123", "Volvo", "383", 5, 50, false));
        fleetOfCars.addCar(new DieselCar("KL 12 345", "Toyota", "Land Cruiser", 7, 29, true));

        fleetOfCars.addCar(new ElectricCar("MN 34 567", "Tesla", "Model S", 5, 100, 502));
        fleetOfCars.addCar(new ElectricCar("OP 56 789", "Tesla", "Model X", 5, 105, 543));
        fleetOfCars.addCar(new ElectricCar("QR 78 901", "BMW", "i3", 3, 38, 203));

        System.out.println("**************************************");
        System.out.println("Fleet of cars:\n");
        System.out.println(fleetOfCars);
        System.out.println("**************************************");
        System.out.println();
        System.out.println("**************************************");
        System.out.println("Total registration fee for fleet: " + fleetOfCars.getTotalRegistrationFeeForFleet() + " kr.");
        System.out.println("**************************************");
    }
}