package chapter01;

public class VariableTest {

	public static void main(String[] args) {
		
		// 정수
		byte b = 1;
		short s = 10;
		int i = 2000;
		long l = 1234567;
		long i2 = 1231231231231L;
		
		// 실수
		float f = 3.14f;
		double d = 3.14;
		
		// 문자
		char c = 'A';
		
		// 불린
		boolean bool = true;
		
		// 문자열은 기본 타입이 아니다.
		// 문자열은 기본 타입 char가 모여있는 String 클래스의 객체다.
		String str = "Hello";
		//String str = new String("Hello");
		
		//String str2 = str + " World";
		//String str3 = new StringBuffer(str).append(" World").toString();
		
		System.out.println(str.length());
		
		
		
		System.out.println(b);
		System.out.println(s);
		System.out.println(i);
		System.out.println(l);
		System.out.println(i2);
		
		System.out.println(f);
		System.out.println(d);
		
		System.out.println(c);
		
		System.out.println(bool);
		
		System.out.println(str);
		
		// (지역)변수는 초기화가 되어야 한다.
		// 안되어 있는 상태로 사용하면 오류
		// int j;
		// System.out.println(j);
		
		// 상수 (관례로 상수는 대문자로 표시한다.)
		final int NUMBER = 12345;
		// 오류: 초기화시 final이 붙어있는 변수는 다음에 값을 대입할 수 없다.
		// number = 54321;
		System.out.println(NUMBER);
		
		//Math.PI
		System.out.println(Math.PI);
		
		//
		
	}

}
