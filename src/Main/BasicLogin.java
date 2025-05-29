package Main;

public class BasicLogin implements ILogin {
	private String correctUsername;
	private String correctPassword;
	
	public BasicLogin(String name, String password) {
		this.correctUsername = name;
		this.correctPassword = password;
	}
	
	@Override
	public boolean authenticate(String username, String password) {
		// TODO Auto-generated method stub
		return correctUsername.equals(username) && correctPassword.equals(password);
	}

	public String getName() {
		return correctUsername;
	}

	public void setName(String name) {
		this.correctUsername = name;
	}

	public String getPassword() {
		return correctPassword;
	}

	public void setPassword(String password) {
		this.correctPassword = password;
	}

}
