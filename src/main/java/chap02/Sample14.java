package chap02;

public class Sample14 {

	public static void main(String[] args) {
		final float PI; 		//초기값을 정하지 않고 PI를 상수로 선언
		PI = 3.14f;	 		//최초값을 선선한다. 이후 PI값을 변경하면 오류가 발생한다.
//		PI = 3.141592F;  //The final local variable PI may already have been assigned
		
		var radius = 10;
		var area = radius * radius * PI;
		
		System.out.printf("원의 넓이 : %f", area);
	}

}