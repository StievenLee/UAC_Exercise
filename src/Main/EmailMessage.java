package Main;

public class EmailMessage extends Message {
	
	
	public EmailMessage(ILogin login, String sender, String recipient, String message) {
		super(login, sender, recipient, message);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void send(String username, String password) {
		// TODO Auto-generated method stub
		if (this.login.authenticate(username, password)) {
			System.out.println("Email Sent from " + this.sender+ " to " + this.recipient + ": " + this.message);
		} else {
			System.out.println("Email authentication failed for user: " + username);
		}
	}

}
