// ��¹� ����

package Study;

public class Code01 {
	
	static int num; // ��������, �Լ��ۿ� ���� Ŭ�����ۿ��� ���� �Ұ���, static�� �ƴϰ� ����Ǹ� ����������
	//�������� Ŭ����, �޼��� ������ �� ��밡��
	
	public static void main(String[] args) {
		
		int anotherNum = 5; // �������� �޼ҵ�ȿ��� �� ��밡��
		
		num = 2;
		
		System.out.println(num + anotherNum);
		
		System.out.println("Num" + num); // + �����ڴ� �������� �ϳ��� ���ڿ��̸� ���ڿ��� ��ġ�� �����̵�
		
		System.out.println("AnotherNum:"  + anotherNum);
		
		System.out.println("Sum: " + num + anotherNum); // left associativity
		// ���ʺ��� ���������� ����ǹǷ� ���ڿ�  + num�� ���ڿ��� �ǰ� + anotherNum ���� ������ ���ڿ��� ���
		
		System.out.println("Sum: " + (num + anotherNum)); // left associativity
		// �̰��� ��ȣ������ ���� �ǹǷ� �������� num�� another Num ���� ������ ���ڰ� + ���ڿ��� ��µ�
		
		
		// �ڹ��� ����Ÿ�� ������Ƽ�� Ÿ�� 
		
		// byte, short, int, long ����Ÿ��
		// float, doubl �Ҽ�Ÿ��
		// char �����ϳ�
		// boolean �� �Ǵ� ���� TRUE, FALSE, 0, 1�� ǥ�õ� ����
		
		
		// String�� �ڹ� �⺻Ÿ���� �ƴ�,
	}
	
}
