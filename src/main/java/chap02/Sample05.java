package chap02;

public class Sample05 {

	public static void main(String[] args) {
		//문자열은 상수로 생성 되어 변경 할 수 없습니다. 불변. (메모리에 등록한 것을 변경 할 수 없다.)
		//디버그로 찍어 보자
		String str1 = "안녕하세요";
		String str2 = "안녕하세요";
		str1 = "안녕히 계세요";
		System.out.println(str1 + " " + str2);

	}

}
