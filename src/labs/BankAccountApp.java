package labs;

public class BankAccountApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BankAccount acc1 = new BankAccount("8909293030", 1000);
		BankAccount acc2 = new BankAccount("8709151010", 2000);
		BankAccount acc3 = new BankAccount("8811050550", 2500);
		
		acc1.setName("Emmanuel Mwaka");
		System.out.println(acc1.getName());
		acc1.makeDeposit(500);
		acc1.makeDeposit(600);
		acc1.payBill(1000);
		acc1.accrue();
		System.out.println(acc1.toString());

	}

}

class BankAccount implements IInterest {

//properties of bank account
//static is same for all instances

	private static int iD = 1000; // internal ID
	private String accountNumber; // iD + random 2-digitnumber + first 2 of SSN
	private static final String routingNumber = "00540067";
	private String name;
	private String SSN;
	private double balance;

//Constructor
	public BankAccount(String SSN, double initDeposit) {
		this.SSN = SSN;
		iD++;
		setAccountNumber();
		balance = initDeposit;

	}

	private void setAccountNumber() {
		int random = (int) (Math.random() * 100);
		accountNumber = iD + "" + random + SSN.substring(0, 2);
		System.out.println("Your Account Number : " + accountNumber);

	}
	
	public void setName(String name ) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void payBill(double amount) {
		balance = balance - amount;
		System.out.println("Paying bill: $" + amount);
		showBalance();
	}
	
	public void makeDeposit(double amount) {
		balance = balance + amount;
		System.out.println("Depositing: $" + amount);
		showBalance();
	}
	
	public void showBalance() {
		System.out.println("Balance is: $" + balance);
	}

	@Override
	public void accrue() {
		balance = balance * (1+ rate/100);
		showBalance();
	}
	
	@Override
	public String toString() {
		return "[Name: " + name + " ] \n[Account Number: " + accountNumber + "\n" + "[Routing Number: " + routingNumber + "]\n" + "[Balance: " + balance +" ]";
				
	}
	
}
