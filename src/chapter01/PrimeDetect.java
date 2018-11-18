package chapter01;

import java.util.Scanner;

public class PrimeDetect {

	public static void main(String[] args) {
		
		//자원생성
		Scanner scanner = new Scanner(System.in);
		
		//입력
		System.out.print("판별할 숫자 : ");
		int number = scanner.nextInt();
		
		//처리(소수인지 판별)
		boolean isPrime = true;
		
		//2부터 입력받은 수보다 1 작은 수까지 반복한다.
		int i=2;
		while(i < number) {
			
			//1과 자신의 수가 아닌 다른 수로 나누어지면 소수가 아니다.
			if(number % i == 0) {
				isPrime = false;
				break;
			}
			
			//다음 확인할 수로 1증가
			i++;
		}
		
		
		//출력
		if(isPrime) {
			System.out.println("소수입니다.");
		} else {
			System.out.println("소수가 아닙니다.");
		}
		
		//자원해제
		scanner.close();
	}

}
