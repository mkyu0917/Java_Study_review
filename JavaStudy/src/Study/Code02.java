// �Է�, ���

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
		
		kb.close(); // ������ ���� �ݾ��ִ°�, �ȴݾƵ� ��������
	}
}
