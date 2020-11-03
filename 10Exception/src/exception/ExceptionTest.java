package exception;

/* Exception 과 Error(해결 못함-컵퓨터다운,,,)
 * Exception(예외)
 * 컴파일 예외 - 코딩시 나타나는 Error, 이클립스에서 알려줌
 * 런타임 예외 - 실행할떄 나타나는 예외상황
 */

public class ExceptionTest {
	public static void main(String[] args) {
		//컴파일 예외
		try {
			Class.forName("java.lang.String2");
		} catch (ClassNotFoundException e) {			
			System.out.println("안녕하세요");
		}
		

	}

}
