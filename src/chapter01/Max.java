package chapter01;

public class Max {

	public static void main(String[] args) {
		
		int a1 = 20;
		int a2 = 15;
		int a3 = 8;
		
		//최대값 판별 조건
		if(a1 >= a2) {
			if(a1 >= a3) {
				System.out.println("최대값은 " + a1 + "입니다.");
			} else {
				System.out.println("최대값은 " + a3 + "입니다.");
			}
		} else {
			if(a2 >= a3) {
				System.out.println("최대값은 " + a2 + "입니다.");
			} else {
				System.out.println("최대값은 " + a3 + "입니다.");
			}
		}
	}

}
