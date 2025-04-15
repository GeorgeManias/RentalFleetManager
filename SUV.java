package CarRentalManagementSystem;

public class SUV extends RentalItem {
    private int seatingCapacity;

    public SUV(String model, String brand, int rentalID, int seatingCapacity) {
        super(model, brand, rentalID);
        this.seatingCapacity = seatingCapacity;
    }

    public int getSeatingCapacity() {
        return seatingCapacity;
    }

    public void setSeatingCapacity(int seatingCapacity) {
        this.seatingCapacity = seatingCapacity;
    }


    @Override
    public void displayInfo() {
        System.out.println("Please find below the Vehicle Information,");
        System.out.println("Model: " + getModel());
        System.out.println("Brand: " + getBrand());
        System.out.println("Rental ID: " + getVehicleID());
        System.out.println("Seating Capacity: " + seatingCapacity);
    }


}
