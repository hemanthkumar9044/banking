package bankTransaction;

import java.util.Scanner;

public class User {
    static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter the amount to be paid: ");
        double amt = sc.nextDouble();
        sc.nextLine();

        if (amt <= 0) {
            System.out.println("Amount must be greater than 0.");
            return;
        }

        while (true) {
            System.out.println("Choose an option to pay:");
            System.out.println("1. Credit Card");
            System.out.println("2. Debit Card");
            System.out.println("3. UPI");
            System.out.print("Enter your choice: ");

            String input = sc.nextLine();
            int ch;
            try {
                ch = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("Invalid choice. Please enter a number from 1 to 3.");
                continue;
            }

            Bank b = new Bank();
            switch (ch) {
                case 1:
                    b.makePayment(amt, 1);
                    return;
                case 2:
                    b.makePayment(amt, 2);
                    return;
                case 3:
                    b.makePayment(amt, 3);
                    return;
                default:
                    System.out.println("Invalid choice. Please enter 1, 2, or 3.");
            }
        }
    }
}
