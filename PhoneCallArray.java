package phoneExtraCredit;

public class PhoneCallArray {
		PhoneCall[] phoneCalls = new PhoneCall[]{new IncomingPhoneCall("0000000"), new OutgoingPhoneCall("1111111",11), 
			new IncomingPhoneCall("2222222"), new OutgoingPhoneCall("3333333",33), 
			new IncomingPhoneCall("4444444"),new OutgoingPhoneCall("5555555",55),
			new IncomingPhoneCall("6666666"), new OutgoingPhoneCall("7777777",77), 
			new IncomingPhoneCall("8888888"), new OutgoingPhoneCall("9999999",99)};
		
		public void display(){
			for(int i = 0; phoneCalls.length >i; i++){
				phoneCalls[i].display();
			}
		}
	
}