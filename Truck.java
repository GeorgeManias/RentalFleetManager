package CarRentalManagementSystem;

public class Truck extends RentalItem {
    private double loadCapacity;

    public Truck(String model, String brand, int rentalID, double loadCapacity) {
        super(model, brand, rentalID);
        this.loadCapacity=loadCapacity;
    }

    public double getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(double loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    @Override
    public void displayInfo() {
        System.out.println("Please find below the Vehicle Information,");
        System.out.println("Model: " + getModel());
        System.out.println("Brand: " + getBrand());
        System.out.println("Rental ID: " + getVehicleID());
        System.out.println("Load Capacity: " + loadCapacity);
    }


}
