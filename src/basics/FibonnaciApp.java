package basics;

public class FibonnaciApp {

	public static void main(String [] args) {
		
	//fibonacci number is defined by the sum of the 2 previous fibonacci numbers.
	//fib(0) = 0
	//fib(1) = 1
	//fib(2) = fib(1)+fib(2) = 0 + 1 = 1
	//fib(3) = fib(2)+fib(1) = 1 + 1 = 2
	//fib(4) = fib(3)+fib(2) = 2 + 1 = 3
	//fib(5) = fib(4)+fib(3) = 3 + 2 = 5
	
		int fibonacci = fib(41);
	System.out.println(fibonacci);
}
	
	public static int fib(int n) {
		if (n == 0) {
			return 0;
		}
		else if(n == 1) {
			return 1;
		}
		else return (fib(n-1)+fib(n-2));
	
	}
}