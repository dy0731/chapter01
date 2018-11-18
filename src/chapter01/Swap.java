package chapter01;

public class Swap {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		

		System.out.println("a = " + a);
		System.out.println("b = " + b);
		
		
		// Swap Algorithm
		int tmp = a;
		a = b;
		b = tmp;
		
		
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);

	}

}
