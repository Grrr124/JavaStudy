package chap02;

import java.util.Scanner;

public class Sample11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		String in = new String("입력값");
//		String in = sc.next();  //문자 입력
//		String in2 = sc.next(); // next는 띄워쓰기 단위로 입력을 받는다.
//		
//		System.out.printf("입력한 값 : %s\n글자 수 : %d\n", in.toUpperCase(), in.length());
//		System.out.printf("입력한 값 : %s\n글자 수 : %d\n", in2.toUpperCase(), in2.length());
		
		String in = sc.nextLine();
		System.out.printf("입력한 값 : [%s]\n글자 수 : %d\n", in.toUpperCase().trim(), in.toUpperCase().trim().length());
		
		
		int inNum = sc.nextInt();
		long inLong = sc.nextLong();
		char inChar = sc.next().charAt(0);

		sc.close();
	}
	
}
