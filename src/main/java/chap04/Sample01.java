package chap04;

public class Sample01 {

	public static void main(String[] args) {
			// 사과 10개가 있습니다.
			var apples = 10;
		
			// 2명의 친구가 있습니다.(본인도 있으니 총 3명입니다.)
			var people = 2 + 1;
			
			// 사과를 나눠먹으면
			// var remainder = apples / people;
			var remainder = apples % people;
			
			//몇개의 사과가 남을까요?
			System.out.println("나머지 : " + remainder);
	}

}
