package Main;

public abstract class Message {
	protected ILogin login;
	protected String sender;
	protected String recipient;
	protected String message;
	
	public Message(ILogin login, String sender, String recipient, String message) {
		this.login = login;
		this.message = message;
		this.sender = sender;
		this.recipient = recipient;
	}
	
	public abstract void send(String username, String password);
	
	
}
