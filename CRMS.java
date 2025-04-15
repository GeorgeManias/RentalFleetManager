package CarRentalManagementSystem;

import java.util.Scanner;

public class CRMS {
    public static void main(String[] args) {
        RentalManager rentalManager = new RentalManager();
        Scanner mySc = new Scanner(System.in);
        int toolOption = -1;
        System.out.println("Welcome to CRMS!");
        System.out.println("For adding a Sedan press 1.");
        System.out.println("For adding a SUV press 2.");
        System.out.println("For adding a Truck press 3.");
        System.out.println("For removing a Vehicle press 4.");
        System.out.println("For searching a Vehicle by Model press 5.");
        System.out.println("For returning a Sedan from a Customer press 6.");
        System.out.println("For renting a Sedan to a Customer press 7.");
        System.out.println("In case you want to close the CRMS, press 8.");

        while (true) {
            System.out.println();
            System.out.println("Please enter your option.");
            toolOption = mySc.nextInt();

            switch (toolOption) {
                case 1: //Add a Sedan
                    mySc.nextLine(); //Consume Previous
                    System.out.println("Please type the Model.");
                    String modelSedan = mySc.next();

                    System.out.println("Please type the Brand.");
                    String brandSedan = mySc.next();

                    System.out.println("Please type the Vehicle ID.");
                    int vehicleIDSedan = mySc.nextInt();

                    System.out.println("Please type the Fuel Efficiency.");
                    double vehicleEf = mySc.nextDouble();

                    Sedan sedan = new Sedan(modelSedan, brandSedan, vehicleIDSedan, vehicleEf);
                    rentalManager.addSedan(sedan);
                    break;


                case 2: //Add a SUV
                    mySc.nextLine(); //Consume Previous
                    System.out.println("Please type the Model.");
                    String modelSUV = mySc.next();

                    System.out.println("Please type the Brand.");
                    String brandSUV = mySc.next();

                    System.out.println("Please type the Vehicle ID.");
                    int vehicleIDSUV = mySc.nextInt();

                    System.out.println("Please type the Seating Capacity.");
                    int seatingCapacity = mySc.nextInt();

                    SUV suv = new SUV(modelSUV, brandSUV, vehicleIDSUV, seatingCapacity);
                    rentalManager.addSUV(suv);
                    break;


                case 3: //Add a Truck
                    mySc.nextLine(); //Consume Previous
                    System.out.println("Please type the Model.");
                    String modelTruck = mySc.next();

                    System.out.println("Please type the Brand.");
                    String brandTruck = mySc.next();

                    System.out.println("Please type the Vehicle ID.");
                    int vehicleIDTruck = mySc.nextInt();

                    System.out.println("Please type the Fuel Load Capacity.");
                    double loadCapacity = mySc.nextDouble();

                    Truck truck = new Truck(modelTruck, brandTruck, vehicleIDTruck, loadCapacity);
                    rentalManager.addTruck(truck);
                    break;


                case 4: //Remove a Vehicle
                    mySc.nextLine(); //Consume Previous
                    System.out.println("Please type the vehicle ID to be removed.");
                    int vehicleIDRem = mySc.nextInt();
                    rentalManager.removeVehicle(vehicleIDRem);
                    break;


                case 5: //Searching a Vehicle
                    mySc.nextLine(); //Consume Previous
                    System.out.println("Please type the Model to be searched.");
                    String vehicleIDSearch = mySc.next();
                    rentalManager.SearchByModel(vehicleIDSearch);
                    break;


                case 6:
                    mySc.nextLine(); //Consume Previous
                    System.out.println("Please type the vehicle ID to be returned.");
                    int vehicleIDReturn = mySc.nextInt();
                    rentalManager.returnSedan(vehicleIDReturn);
                    break;


                case 7:
                    mySc.nextLine(); //Consume Previous
                    System.out.println("Please type the vehicle ID to be rented.");
                    int vehicleIDRent = mySc.nextInt();
                    System.out.println("Please type the Customer Name");
                    String customer = mySc.next();
                    rentalManager.rentSedan(vehicleIDRent, customer);
                    break;


                case 8: // Exit CRMS
                    System.out.println("Thank you for using CRMS. Goodbye!");
                    mySc.close();
                    return;


                default:
                    System.out.println("Invalid option. Please try again.");
                    break;
            }
        }


    }


}



