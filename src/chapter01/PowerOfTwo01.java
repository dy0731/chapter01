package chapter01;

import java.util.Scanner;

public class PowerOfTwo01 {

	public static void main(String[] args) {
		
		//자원생성
		Scanner scanner = new Scanner(System.in);
		
		//입력받기
		System.out.print("승수 : ");
		int power = scanner.nextInt();
		
		//System.out.println(power);
		
		//2의 power 승을 해서 출력
		int result = 1;
		
		//처리하기
		int i = 0;
		while(i < power) {
			result = result * 2;
			
			i++;
		}
		
		//출력하기
		System.out.println(result);
		
		//자원해제
		scanner.close();

	}

}
