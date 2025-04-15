package CarRentalManagementSystem;

public abstract class RentalItem {
    private String model;
    private String brand;
    private int vehicleID;

    public RentalItem(String model, String brand, int vehicleID) {
        this.model = model;
        this.brand = brand;
        this.vehicleID = vehicleID;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getVehicleID() {
        return vehicleID;
    }

    public void setVehicleID(int vehicleID) {
        this.vehicleID = vehicleID;
    }

    public abstract void displayInfo();
}










