// �ټ��� �Է� ���ڿ� ��

package Study;

import java.util.Scanner;

public class Code04 {
	
	public static void main(String[] args) {
		
		String name = null;
		int age;
		String gender ;
		
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Please type your name and age your gender: ");
		
		name = kb.next();
		age = kb.nextInt();
		gender = kb.next();
		
		if (gender.equals("male"))  // "" ����ǥ�� �׿��� ���ڿ� ��ü�� String literal �̶� �Ѵ�.
			
			System.out.println(name + ", you're " + age + "years old man.");
		
		else if (gender.equals("female"))
			
			System.out.println(name + ", you're" + age + "years old woman.");
		
		else 
			System.out.println("Hmm.. interesting");
		
		kb.close();
		}
		
	}
