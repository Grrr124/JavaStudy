package chap02;

public class Sample06 {

	public static void main(String[] args) {
		int a = 32767; // short 최대값
		short b = 40;
		
//		b = a; 에러
		b = (short) a; //명시적 형 변환
		System.out.println(b);
		
		int c = 32768; // short 최대값 + 1
		b = (short) c; // 명시적 형 변환
		System.out.println(b);
	}

}
