package problem2;

public class CustomerAccount {

	final double LOW_BALANCE=100;
	String Cus_name;
	String Acc_No;
	double Balance;

	public String getCus_name() {
		return Cus_name;
	}

	public String getAcc_No() {
		return Acc_No;
	}

	public double getBalance() {
		return Balance;
	}

	public CustomerAccount(String Cus_name, String Acc_No, double Balance) {
		this.Cus_name = Cus_name;
		this.Acc_No = Acc_No;
		this.Balance = Balance;
	}

	public void deposite(double depositeMoney) {
		this.Balance += depositeMoney;
	}

	public void withDraw(double withDrawMoney) throws UserExceptions {
		if (this.Balance < withDrawMoney) 
			throw new UserExceptions("Exceed");
		else{
			this.Balance -= withDrawMoney;
			if(this.Balance<LOW_BALANCE)
				throw new UserExceptions(this.Balance);				
		}		
	}

	public void printBalance() {
		System.out.println("Your balance is " + this.Balance);
	}
}
