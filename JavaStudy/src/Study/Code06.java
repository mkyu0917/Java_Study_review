package Study;

public class Code06 {
	public static void main(String[] args) {
		
//		int [] grades; // �迭���� ����
//		grades = new int[5]; // �迭������ ũ�� ����
//		
		
//		�迭�� �̸��� ũ�⸦ �ѹ��� ����
//		int [] grades = new int[5];

//		�迭�� ũ�⸦ �� ����� ���ʿ�� ����
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
