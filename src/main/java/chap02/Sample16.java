package chap02;

public class Sample16 {

	/**
	 * 실행 메서드입니다.
	 * @param args 난수값
	 */
	
	public static void main(String[] args) {
//		var num = random.nextInt(3) + 1;  //0~ 2 -> 1 ~ 3 	jdk 1.0
		var num = (int)(Math.random() * 3 + 1);  //jdk 1.8
		System.out.printf("난수 : %d", num);
	}
	
	/**
	 * 코드 템플릿을 연습합니다.
	 * @param in 입력값
	 * @return 	   출력값
	 */
	public int getValue(int in) {
		return in;
	}
	
	/**
	 * 연습
	 * @param in 입력
	 * @return     출력
	 * @since 1.0
	 * 2019. 12. 01.
	 * -locale ko_KR -encoding UTF-8 -charset UTF-8 -docencoding UTF-8
	 */
	public int getValue2(int in) {
		return in;
	}
}
