public abstract class Message {
	private String sender;
	protected ILogin login;
	private String receiver;
	private String text;
	
	
	public Message(ILogin login, String sender , String receiver, String text) {
		this.sender = sender;
		this.login = login;
		this.receiver = receiver;
		this.text = text;
	}

	public String getSender() {
		return sender;
	}

	public ILogin getLogin() {
		return login;
	}
	
	public String getReceiver() {
		return receiver;
	}
	
	public String getText() {
		return text;
	}

	protected abstract void send(String string, String string2);
	
	
}