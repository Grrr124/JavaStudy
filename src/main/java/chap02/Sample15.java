package chap02;

import java.util.Random;

public class Sample15 {

	public static void main(String[] args) {
//		jdk 1.0 버전 방법!
		
		var random = new Random();
		var num = random.nextInt(3) + 1;  //0~ 2 -> 1 ~ 3
		System.out.printf("난수 : %d", num);
		
	}

}
