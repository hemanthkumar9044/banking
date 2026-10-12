package bankTransaction;

public class CreditCard implements Payment{
	private String CardNo = "1234 5678 9012 3456";
	@Override
	public void pay(double amt) {
		System.out.println("Validating Credit Card...");
		System.out.println("Credit Card payment initiated...");
		System.out.println("Paid Rs. " + amt + " successfully using xxxx xxxx xxxx " + CardNo.substring(CardNo.length()-4));
	}

}
