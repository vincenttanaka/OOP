public class OAuthLogin implements ILogin {
	private String password;
	
	
	public OAuthLogin(String password) {
		this.password=password;
	}


	@Override
	public boolean authenticate(String username, String password) {
		return this.password.equals(password) ;	
		
	}

}
