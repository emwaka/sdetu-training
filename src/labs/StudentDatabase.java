package labs;

public class StudentDatabase {

	public static void main(String[] args) {

		Student student1 = new Student("Emmanuel", "8909293030");
		Student student2 = new Student("Tompalän", "8909293031");
		Student student3 = new Student("Elisabet", "8909293032");
		
		
		student1.enroll("Math 101");
		student1.enroll("English 255");
		student1.enroll("Physics 103");
		
		//student1.checkBalance();
		//System.out.println(student1.showCourses());
		student1.payTuition(600);
		student1.checkBalance();
		System.out.println(student1.toString());
	}
}

class Student {
	
	private static int iD = 0;
	private String userId;
	private String name;
	private String ssn;
	private String email;
	public String courses = "";
	private static final int costOfCourse = 800;
	private int balance = 0;
	
	
	public Student(String name, String ssn) {
		iD++;
		this.name = name;
		this.ssn = ssn;
		setEmail();
		setUserId(); 
		
	}

	
	
	private void setEmail() {
		email = name.toLowerCase() +"."+ iD + "@siktrruniversity.com";
		System.out.println("Your email is: " + email);
	}
	
	
	private void setUserId() {
		int max = 9000;
		int min = 1000;
		
		int randNum = (int) (Math.random() * (max - min));
		randNum = randNum+min;
		
		userId = iD +""+ randNum + ssn.substring(6);
		System.out.println("Your userID " + userId);
	}
	
	
	
	public void enroll (String course) {
		this.courses = this.courses + "\n" + course;
		System.out.println(this.courses);
		balance = balance + costOfCourse;
		
	}
	
	public void payTuition(int amount) {
		System.out.println("Payment: $" + amount);
		balance = balance - amount;
		
	}
	
	public void checkBalance() {
		System.out.println("Balance: $" + balance);
		
	}
	
	public String showCourses() {
		return this.courses;
	}
	
	@Override
	public String toString() {
		return "[NAME: " + name + "]\n[COURSES: " + courses + "]\n[BALANCE: " + balance + "]";
	}
	
}