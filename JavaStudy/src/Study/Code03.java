// �Է� ���ڿ� ��

package Study;

import java.util.Scanner;

public class Code03 {
	
	public static void main(String[] args) {
		
		String str = "Hello, world";
		String input = null;
		Scanner kb = new Scanner(System.in);
		System.out.print("Please type a string: ");
		
//		input = kb.next(); // next�� ���⸦ �������� �տ� �ϳ��� �ܾ �ν�
		
		input = kb.nextLine();
		
		
//		if(str == input) { // ������Ƽ�� Ÿ���� �ƴ� String�� == ���� ������ Ȯ���� �� ����
//			System.out.println("String match! :-)");
//		} else {
//			System.out.println("String do not match! :-(");
//		}

		if(str.equals(input)) { // ������Ƽ�� Ÿ���� �ƴ� String�� == ���� ������ Ȯ���� �� ����
			System.out.println("String match! :-)");
		} else {
			System.out.println("String do not match! :-(");
		}

		
		
		
		kb.close();
	}
}
