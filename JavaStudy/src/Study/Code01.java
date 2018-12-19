// 출력문 연습

package Study;

public class Code01 {
	
	static int num; // 전역변수, 함수밖에 선언 클래스밖에는 선언 불가능, static이 아니게 선언되면 문법적오류
	//전역변수 클래스, 메서드 내에서 다 사용가능
	
	public static void main(String[] args) {
		
		int anotherNum = 5; // 지역변수 메소드안에서 만 사용가능
		
		num = 2;
		
		System.out.println(num + anotherNum);
		
		System.out.println("Num" + num); // + 연산자는 변수들중 하나가 문자열이면 문자열을 합치는 연산이됨
		
		System.out.println("AnotherNum:"  + anotherNum);
		
		System.out.println("Sum: " + num + anotherNum); // left associativity
		// 왼쪽부터 순서적으로 연산되므로 문자열  + num이 문자열이 되고 + anotherNum 까지 더해진 문자열이 출력
		
		System.out.println("Sum: " + (num + anotherNum)); // left associativity
		// 이것은 괄호연산이 먼저 되므로 정수값인 num과 another Num 값이 더해져 숫자값 + 문자열로 출력됨
		
		
		// 자바의 변수타입 프리미티브 타입 
		
		// byte, short, int, long 정수타입
		// float, doubl 소수타입
		// char 문자하나
		// boolean 참 또는 거짓 TRUE, FALSE, 0, 1로 표시도 가능
		
		
		// String은 자바 기본타입이 아님,
	}
	
}
