package chap02;

public class Sample10 {

	public static void main(String[] args) {
		String a1 = "abcd";
		char[] a2 = a1.toCharArray(); //문자열을 문자배열로 전환
		
		char b1 = 'a'; 
		String b2 = String.valueOf(b1);  //문자를 문자열로 변환
		String b3 = "" + b1; //편한 방법

	}

}
