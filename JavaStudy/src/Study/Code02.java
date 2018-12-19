// 입력, 출력

package Study;

import java.util.Scanner;

public class Code02 {
	public static void main(String[] args) {
		
		int number = 123;
		Scanner kb = new Scanner(System.in);
		System.out.print("Please enter an integer: ");
		
		int input = kb.nextInt();
		
		
		if ( input == number ) {
			System.out.println("Number match! :-)");
	
		}else {
			
			System.out.println("Number do not match! :-(");
		}
		
		kb.close(); // 파일을 쓰고 닫아주는것, 안닫아도 실행은됨
	}
}
