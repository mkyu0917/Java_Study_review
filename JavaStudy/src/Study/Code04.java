// 다수의 입력 문자열 비교

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
		
		if (gender.equals("male"))  // "" 따옴표로 쌓여진 문자열 자체를 String literal 이라 한다.
			
			System.out.println(name + ", you're " + age + "years old man.");
		
		else if (gender.equals("female"))
			
			System.out.println(name + ", you're" + age + "years old woman.");
		
		else 
			System.out.println("Hmm.. interesting");
		
		kb.close();
		}
		
	}

