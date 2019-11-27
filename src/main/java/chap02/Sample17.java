package chap02;

import java.util.function.Function;

public class Sample17 {

	public static void main(String[] args) {
//		var _ = "underscore"; '_' should not be used as an identifier, since it is a reserved keyword from source level 1.8 on
//		System.out.println();
//		test("underscore");
		Function<String, String> f = a -> a;	   //a라는 값을 받아서 a를 출력해라
		Function<String, String> g = a_ -> a_;
		
		/*
		Internet of thing
		Text box
		find keyword
		
		//1. 카멜 표기법(Camel Case)  실무에서 가장 많이 쓰는 표기법
		internetOfThing
		textBox
		findKeyword
		
		//2. 파스칼 표기법(Pascal Case)
		InternetOfThing
		TextBox
		FindKeyword
		
		//3. 스네이크 표기법(Snake Case)
		internet_of_thing
		text_box
		find_keyword 
		
		//4. 케밥 표기법(Kebab Case)
		Internet-of-thing
		Text-box
		find-keyword
		*/
//		String Internet-of-thing = ""; -을 연산자로 인식을 해버려서 케밥 표기법은 프로그래밍에서 쓰기 힘들다.
	}
	
//	public static void test(String _) {
//		System.out.println(_);
//	}
	
}
