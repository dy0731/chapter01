package chapter01;

import java.util.Scanner;

public class SumToInput {

	public static void main(String[] args) {
		
		//자원생성
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("숫자를 입력해주세요. \t");
		
		//입력
		int input = scanner.nextInt();
		
		//처리 0 ~ input 까지 합
		int sum = 0;
		for(int i=0; i<=input; i++) {
			sum += i;
		}
		
		//출력
		System.out.println(sum);
		
		//자원해제
		scanner.close();

	}

}
