public class EmailMessage extends Message {

	public EmailMessage(ILogin login, String sender, String receiver, String text) {
		super(login, sender, receiver, text);
	
	}

	@Override
	protected void send(String username, String password) {
		if(login.authenticate(username, password)) {
			System.out.println("=========================================================================");
			System.out.println("Email sent from "+ getSender() +" to "+ getReceiver() +" : "+ getText() );
		}
		else {
			System.out.println("=========================================================================");
			System.out.println("Email authentication failed for user : "+ username);
		}
	}
		
	
	
}
