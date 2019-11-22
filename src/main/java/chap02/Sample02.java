package chap02;

public class Sample02 {

	public static void main(String[] args) {
		
		//아스키코드를 이용해서 Java 출력
		
		//첫번째, 직접 입력
		System.out.println("Incoding : " + (char)74 + (char)97 + (char)118 + (char)97);
		
		
		//두번째, 변수를 지정하여 입력
		char J = 74;
		char a = 97;
		char v = 118;
		
		System.out.printf("%c%c%c%c", J, a, v, a);
	}

}
