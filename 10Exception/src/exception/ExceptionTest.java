package exception;

/* Exception �� Error(�ذ� ����-��ǻ�ʹٿ�,,,)
 * Exception(����)
 * ������ ���� - �ڵ��� ��Ÿ���� Error, ��Ŭ�������� �˷���
 * ��Ÿ�� ���� - �����ҋ� ��Ÿ���� ���ܻ�Ȳ
 */

public class ExceptionTest {
	public static void main(String[] args) {
		//������ ����
		try {
			Class.forName("java.lang.String2");
		} catch (ClassNotFoundException e) {			
			System.out.println("�ȳ��ϼ���");
		}
		

	}

}
