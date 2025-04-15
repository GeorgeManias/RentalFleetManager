package CarRentalManagementSystem;

public interface Rentable {
    public abstract void rentSedan(String customerName) throws RentalException;

    public abstract void returnSedan() throws RentalException;

}