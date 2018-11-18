package chapter01;

import java.util.Scanner;

public class InfiniteLoop {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int sum = 0;

		for (;;) {
			System.out.print("숫자입력[0 이면 중지] : ");

			int value = scanner.nextInt();

			if (value == 0) {
				break;
			}

			sum = sum + value;
		}

		System.out.println(sum);

		scanner.close();

	}

}
