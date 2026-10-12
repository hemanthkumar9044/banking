package bankTransaction;

public class DebitCard implements Payment {
    private String CardNo = "0987 6543 2109 8765";
    private String Name = "CHINTHAKUNTLA HEMANTH KUMAR";
    private int CVV = 567;
    private int pin = 1234;

    public DebitCard(String CardNo) {
        this.CardNo = CardNo;
    }

    public void CardHolderName(String Name) {
        this.Name = Name;
    }

    public void CVV(int CVV) {
        this.CVV = CVV;
    }

    public void PIN(int pin) {
        this.pin = pin;
    }

    @Override
    public void pay(double amt) {
        System.out.println("Enter Debit card details");

        System.out.print("Card number: ");
        String enteredCardNo = User.sc.nextLine();

        System.out.print("Card holder name: ");
        String enteredName = User.sc.nextLine();

        System.out.print("CVV: ");
        int enteredCvv = Integer.parseInt(User.sc.nextLine());

        System.out.print("PIN: ");
        int enteredPin = Integer.parseInt(User.sc.nextLine());

        if (enteredCardNo.equals(CardNo)
                && enteredName.equalsIgnoreCase(Name)
                && enteredCvv == CVV
                && enteredPin == pin) {
            System.out.println("Validating Debit card...");
            System.out.println("Debit card payment initiated...");
            String lastfour = CardNo.substring(CardNo.length() - 4);
            System.out.println("Paid Rs. " + amt + " successfully using xxxx xxxx xxxx " + lastfour);
        } else {
            System.out.println("Please try again....");
        }
    }
}
