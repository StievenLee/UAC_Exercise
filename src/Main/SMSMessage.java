package Main;

public class SMSMessage extends Message {

	public SMSMessage(ILogin login, String sender, String recipient, String message) {
		super(login, sender, recipient, message);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void send(String username, String password) {
		// TODO Auto-generated method stub
		if(this.login.authenticate(username,password)) {
			System.out.println("SMS Sent from " + this.sender + " to " + this.recipient + ":" + this.message);
		} else {
			System.out.println("SMS Authentication failed for user: " + username);
		}
	}

}
