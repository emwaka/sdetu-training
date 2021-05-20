package oop;


class Person {
	String name;
	String email;
	String phone;
	
	void walk() {
		System.out.println(name + " is walking");
	}
	
	void eat() {
		System.out.println(name + " is eating");
	}
	
	void sleep() {
		System.out.println(name + " is sleeping");
	}
}

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//person
		
		Person person1 = new Person();
		
		//properties
		person1.name = "Joe";
		person1.email = "joe@siktrrbah.com";
		person1.phone = "1234567789";
		
		//abstraction
		person1.walk();
		person1.sleep();
		person1.eat();
		

		Person person2 = new Person();
		person2.name ="Sarah";
		person2.sleep();
		

		
	}

}
