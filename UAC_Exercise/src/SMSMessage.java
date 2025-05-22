public class SMSMessage extends Message {

	public SMSMessage(ILogin login, String sender, String receiver, String text) {
		super(login, sender, receiver, text);

	}

	@Override
	protected void send(String username, String password) {
		if(login.authenticate(username, password)) {
			
			System.out.println("SMS sent from "+ getSender() +" to "+ getReceiver() +" : "+ getText() );
			System.out.println("=========================================================================");
		}
		else {
			
			System.out.println("SMS authentication failed for user : "+ username);
			System.out.println("=========================================================================");
		}
		
	}
	
	

}