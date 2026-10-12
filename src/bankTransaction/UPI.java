package bankTransaction;

public class UPI implements Payment {
    private final String upi_id;
    private int pin = 1234;

    public UPI(String upi_id) {
        this.upi_id = upi_id;
    }

    public void PIN(int pin) {
        this.pin = pin;
    }

    @Override
    public void pay(double amt) {
        System.out.print("Enter UPI pin: ");
        int enteredPin = Integer.parseInt(User.sc.nextLine());

        if (pin == enteredPin) {
            System.out.println("UPI payment is initiated...");
            System.out.println("Paid Rs. " + amt + " successfully using UPI to " + upi_id);
        } else {
            System.out.println("Incorrect pin. Please try again.");
        }
    }
}
