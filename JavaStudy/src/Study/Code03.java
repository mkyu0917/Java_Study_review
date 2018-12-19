// 입력 문자열 비교

package Study;

import java.util.Scanner;

public class Code03 {
	
	public static void main(String[] args) {
		
		String str = "Hello, world";
		String input = null;
		Scanner kb = new Scanner(System.in);
		System.out.print("Please type a string: ");
		
//		input = kb.next(); // next는 띄어쓰기를 기준으로 앞에 하나의 단어만 인식
		
		input = kb.nextLine();
		
		
//		if(str == input) { // 프리미티브 타입이 아닌 String은 == 으로 같은지 확인할 수 없음
//			System.out.println("String match! :-)");
//		} else {
//			System.out.println("String do not match! :-(");
//		}

		if(str.equals(input)) { // 프리미티브 타입이 아닌 String은 == 으로 같은지 확인할 수 없음
			System.out.println("String match! :-)");
		} else {
			System.out.println("String do not match! :-(");
		}

		
		
		
		kb.close();
	}
}
