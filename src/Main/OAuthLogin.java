package Main;

public class OAuthLogin implements ILogin {
	private String validToken;
	
	public OAuthLogin(String validToken) {
		this.validToken = validToken;
	}
	
	@Override
	public boolean authenticate(String username, String password) {
		// TODO Auto-generated method stub
		return validToken.equals(password);
	}

	public String getValidToken() {
		return validToken;
	}

	public void setValidToken(String validToken) {
		this.validToken = validToken;
	}

}
