package phoneExtraCredit;

public abstract class PhoneCall {
	protected String phoneNumber;
	protected double price;
	
	public PhoneCall(String passedPhoneNumber){
		phoneNumber = passedPhoneNumber;
		price=0.0;
	}
	
	public void setPrice(double newPrice){
		price=newPrice;
	}
	
	public abstract String getPhoneNumber();
	public abstract double getPrice();
	public abstract void display();
}
