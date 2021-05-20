package oop;

public class LoanAccount implements IRate {

	@Override
	public void setRate() {
		System.out.println("Rate");
	}

	@Override
	public void increaseRate() {
		//System.out.println("Increase rate");
		
	}
	
	public void setTerm (int terms) {
		System.out.println("Setting the term to: " + terms + " years");
	}
	
	public void setAmmortSchedule() {
		System.out.println("Amortization schedule");
	}
	
	

}
