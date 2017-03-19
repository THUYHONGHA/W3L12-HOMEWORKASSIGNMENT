package problem2;

public class UserExceptions extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String message = "";

	public UserExceptions(double b) {
		this.message = "Your balance is: " + b + " below 100$!";
	}

	public UserExceptions(String e) {
		this.message="Withdraw amount exceeds your balance!";
	}

	public String getMessage() {
		return this.message;
	}

}
