package chap02;

public class Sample16 {

	public static void main(String[] args) {
//		var num = random.nextInt(3) + 1;  //0~ 2 -> 1 ~ 3 	jdk 1.0
		var num = (int)(Math.random() * 3 + 1);  //jdk 1.8
		System.out.printf("난수 : %d", num);
	}

}
