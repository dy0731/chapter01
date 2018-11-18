package chapter01;

import java.util.Scanner;

public class DoWihleTest {

	public static void main(String[] args) {

		int sum = 0;
		int value = 0;
		

		Scanner scanner = new Scanner(System.in);
		
		do {
			
			System.out.print("숫자입력[0 이면 중지] : ");
			
			value = scanner.nextInt();
			
			sum = sum + value;
			
		} while (value != 0);
		
		System.out.println(sum);
		
		scanner.close();
	}

}
