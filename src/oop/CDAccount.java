package oop;

public class CDAccount extends BankAccount implements IRate {
	
	String interestRate;
	
	void compunt() {
		System.out.println("Compounding interest");
	}

}
