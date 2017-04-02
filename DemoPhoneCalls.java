package phoneExtraCredit;

public class DemoPhoneCalls {

	public static void main(String[] args){
		PhoneCall a = new OutgoingPhoneCall("1",1);
		a.display();
		PhoneCall b = new IncomingPhoneCall("2");
		b.display();
		
		PhoneCallArray c = new PhoneCallArray();
		c.display();
	}
}
