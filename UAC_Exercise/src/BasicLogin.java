public class BasicLogin implements ILogin {

	private String username;
	private String password;
	
	public BasicLogin(String username, String password) {
		this.username = username;
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}


	public boolean authenticate(String username, String password) {
		return this.username.equals(username) && this.password.equals(password) ;	
		
	}
	
}

