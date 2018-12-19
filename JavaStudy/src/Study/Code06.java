package Study;

public class Code06 {
	public static void main(String[] args) {
		
//		int [] grades; // 배열변수 선언
//		grades = new int[5]; // 배열변수의 크기 선언
//		
		
//		배열의 이름과 크기를 한번에 선언
//		int [] grades = new int[5];

//		배열의 크기를 꼭 상수로 줄필요는 없음
		int n = 5;
		int []grades = new int [n];
		
		
		grades[0] = 100;
		grades[1] = 76;
		grades[2] = 92;
		grades[3] = 95;
		grades[4] = 14;
		
//		for (int i = 0 ; i<grades.length; i++ ) {
//			System.out.println("Grade " + (i+1) +": "+ grades[i] );
//		}
//		
		int i =0;
		while (i<grades.length) {
			System.out.println("Grades"+(i+1)+": "+grades[i]);
			i++;
		}
	}
}
