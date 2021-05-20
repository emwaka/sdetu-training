package oop;

public class BankAccount implements IRate{
	
	String accountNumber;
	
	//static >> belongs to the class not the instance
	//final is constant, not change'able
	private static final String ROUTINGNUMBER = "1234";
	private String name;
	private String ssn;
	String accountType;
	double balance = 0;
	
	//Constructor definitions
		//1. They are used to deifne/setup/initialize properties of an object
		//2. Constructors are IMPLICITLY called upon INSTANTIATION
		//3. The same name as thje class itself.
		//4. Constructors have NO return type
	
	BankAccount() {
		System.out.println("NEW ACCOUNT CREATED");
	}
	
	//overloading: call same method name with different arguments
	
	BankAccount(String accountType) {
		System.out.println("NEW ACCOUNT CREATED: " + accountType);
	}
	
	BankAccount(String accountType, double initDeposit) {
		System.out.println("NEW ACCOUNT CREATED: " + accountType);
		System.out.println("INITIAL DEPOSIT OF: $" + initDeposit);
		String msg ="";
		if (initDeposit < 1000) {
			msg = "ERROR: Deposit must be at least 1000$";
			System.out.println(msg);
			
		} else {
			msg = "Thanks for your deposit of: $ " + initDeposit;
		}
		System.out.println(msg);
		balance = initDeposit;
	}
	
	//define methods/functions
	void deposit(double amount) {
		balance = balance+amount;
		showActivity("DEPOSIT");
		
	}
	
	void withdraw(double amount) {
		balance= balance-amount;
		showActivity("WITHDRAW");
	}
	
	void checkBalance() {
		System.out.println("Balance: " + balance);
		
	}
	
	void getStatus() {
		
	}
	
	protected void showActivity(String activity) {
		System.out.println("YOUR RECENT TRANSACTION: " + activity);
		System.out.println("YOUR NEW BALANCE IS: $" + balance);
	}
	
	@Override
	public String toString() {
		return "[ NAME: " + name + ", " + "ACCOUNT#" + accountNumber + ", ROUTING#" + ROUTINGNUMBER+ ", BALANCE: $" + balance + " ]";
		
	}
	
	public void setName (String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	
	
	//Interface methods
	public void setRate() {
		System.out.println("SETTING RATE");
	}

	@Override
	public void increaseRate() {
		// TODO Auto-generated method stub
		
	}
	

}
