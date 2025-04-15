package CarRentalManagementSystem;

import java.util.ArrayList;

public class RentalManager {
    private ArrayList<RentalItem> vehicleLists = new ArrayList<>();

    public ArrayList<RentalItem> getVehicleLists() {
        return vehicleLists;
    }

    public void setVehicleLists(ArrayList<RentalItem> vehicleLists) {
        this.vehicleLists = vehicleLists;
    }

    public void addSedan(Sedan sedan) {
        vehicleLists.add(sedan);
        System.out.println("The Sedan vehicle has been added with the following details.");
        sedan.displayInfo();
    }

    public void addSUV(SUV suv) {
        vehicleLists.add(suv);
        System.out.println("The SUV vehicle has been added with thw following details.");
        suv.displayInfo();
    }

    public void addTruck(Truck truck) {
        vehicleLists.add(truck);
        System.out.println("The Truck vehicle has been added with the following details.");
        truck.displayInfo();
    }

    public boolean removeVehicle(int vehicleID) {
        for (int i = 0; i < vehicleLists.size(); i++) {
            if (vehicleLists.get(i).getVehicleID() == vehicleID) {
                vehicleLists.remove(i);
                return true; // In case that the vehicle exist
            }

        }
        return false; // In case that the vehicle does not exist
    }

    public void SearchByModel(String model) {
        boolean modelExist = false;
        for (int i = 0; i < vehicleLists.size(); i++) {
            if (vehicleLists.get(i).getModel().equalsIgnoreCase(model)) {
                vehicleLists.get(i).displayInfo();
                System.out.println();
                modelExist = true;
            }
        }
        if (!modelExist) {
            System.out.println("There is no vehicle with that model in our System.");
        }
    }

    public void returnSedan(int vehicleID) {
        for (int i = 0; i < vehicleLists.size(); i++) {
            if ((vehicleLists.get(i) instanceof Sedan) && (vehicleLists.get(i).getVehicleID() == vehicleID)) {
                try {
                    ((Sedan) vehicleLists.get(i)).returnSedan();
                } catch (RentalException e) {
                    System.out.println(e.getMessage());
                }
                return;
            }
        }
        System.out.println("The sedan was not borrowed");
    }

    public void rentSedan(int vehicleID, String customer) {
        for (int i = 0; i < vehicleLists.size(); i++) {
            if ((vehicleLists.get(i) instanceof Sedan) && (vehicleLists.get(i).getVehicleID() == vehicleID)) {
                try {
                    ((Sedan) vehicleLists.get(i)).rentSedan(customer);
                } catch (RentalException e) {
                    System.out.println(e.getMessage());
                }
                return;
            }
        }
        System.out.println("The vehicle is already rented");
    }


}
