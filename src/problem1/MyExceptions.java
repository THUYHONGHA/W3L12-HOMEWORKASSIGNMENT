package problem1;

public class MyExceptions extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String message = "";
	
	public MyExceptions(int n){
		this.message = n + " out of range [0:100]";
	}

	public String getMessage(){
		return this.message;
	}
}
