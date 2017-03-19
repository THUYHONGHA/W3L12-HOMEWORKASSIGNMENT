package problem2;

public class Main {

	public static void main(String[] args) {
		CustomerAccount ca= new CustomerAccount("Hong Ha", "10987456", 1000);
		try {			
			ca.deposite(500);
			ca.printBalance();
			ca.withDraw(2000);			
		} catch (UserExceptions e) {
			System.err.println(e.getMessage());
		}
		
		try {
			ca.withDraw(1450);
		} catch (UserExceptions e) {
			System.err.println(e.getMessage());
		}
		
		

	}

}
