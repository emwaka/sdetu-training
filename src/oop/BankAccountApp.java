package oop;

public class BankAccountApp {
	
public static void main (String [] args) {
	
	
	BankAccount acc1 = new BankAccount();
	acc1.accountNumber = "8909293030";
	
	//acc1.name = "Emmanuel Mwaka";
	
	acc1.setName("Emmanuel Mwaka");
	acc1.setSsn("198909293030");
	System.out.println(acc1.getName());
	System.out.println(acc1.getSsn());
	acc1.setRate();
	acc1.increaseRate();
	acc1.balance = 10000;
	
	
	acc1.deposit(1000);
	
	//polymorphism through overriding
	System.out.println(acc1.toString());
	
//	/*
//	
//	polymorphism through overloading
	BankAccount acc2 = new BankAccount("Checking Account");
	acc2.accountNumber = "8909293030";
	BankAccount acc3 = new BankAccount("Savings Account",5000);
	acc3.accountNumber ="8909293030";
	acc3.checkBalance();
//	
//	
//	
//	//demo for inheritance
//	
//	CDAccount cd1 = new CDAccount();
//	cd1.balance = 3000;
//	cd1.interestRate = "4,5";
//	cd1.name ="Juan";
//	cd1.accountType = "CD Account";
//	System.out.println(cd1.toString());
//	
//	*/
	
	
	}

}
