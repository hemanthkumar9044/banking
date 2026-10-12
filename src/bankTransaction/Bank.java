package bankTransaction;

public class Bank {
    public void makePayment(double amt, int type) {
        Payment payment;

        switch (type) {
            case 1:
                payment = new CreditCard();
                break;
            case 2:
                System.out.print("Enter Debit Card number: ");
                String debitCardNo = User.sc.nextLine();
                payment = new DebitCard(debitCardNo);
                break;
            case 3:
                System.out.print("Enter UPI ID: ");
                String upiId = User.sc.nextLine();
                payment = new UPI(upiId);
                break;
            default:
                throw new IllegalArgumentException("Invalid payment type: " + type);
        }

        payment.pay(amt);
    }
}
