package CarRentalManagementSystem;

public class Sedan extends RentalItem implements Rentable {
    double fuelEfficiency;
    String customer;

    public Sedan(String model, String brand, int vehicleID, double fuelEfficiency) {
        super(model, brand, vehicleID);
        this.fuelEfficiency = fuelEfficiency;
        this.customer = null;
    }

    public double getFuelEfficiency() {
        return fuelEfficiency;
    }

    public void setFuelEfficiency(double fuelEfficiency) {
        this.fuelEfficiency = fuelEfficiency;
    }

    @Override
    public void displayInfo() {
        System.out.println("Please find below the Vehicle Information,");
        System.out.println("Model: " + getModel());
        System.out.println("Brand: " + getBrand());
        System.out.println("Rental ID: " + getVehicleID());
        System.out.println("Fuel Efficiency: " + fuelEfficiency);
    }

    @Override
    public void rentSedan(String customerName) throws RentalException {
        if (this.customer != null) {
            throw new RentalException("The Vehicle is allready rented.");
        }
        this.customer = customerName;
        System.out.println("The vehicle, " + getModel() + "has been rented to Customer: " + customer);
    }

    @Override
    public void returnSedan() throws RentalException {
        if (this.customer == null) {
            throw new RentalException("The Vehicle is not rented.");
        }
        this.customer = null;
        System.out.println("The vehicle " + getModel() + ", has been returned");
    }


}
