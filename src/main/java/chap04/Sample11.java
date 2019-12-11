package chap04;

public class Sample11 {

	public static void main(String[] args) {
		int a = 60;  //0000 0000 0000 0000 0000 0000 0011 1100
		int b = -10;  //1111 1111 1111 1111 1111 1111 1111 0110
		System.out.println("* NOT");
		System.out.printf("[%32s] ~ [%32s] = %d ~ %d \n"
				, Lpad(Integer.toBinaryString(a), 32, "0")
				, Lpad(Integer.toBinaryString(~a), 32, "0")
				, a
				, ~a);
		System.out.printf("[%32s] ~ [%32s] = %d ~ %d \n"
				, Lpad(Integer.toBinaryString(b), 32, "0")
				, Lpad(Integer.toBinaryString(~b), 32, "0")
				, b
				, ~b);
	}
	
	//왼쪽 문자열 0으로 채움
	public static String Lpad(String context, int len, String ch) {
		String str = context;
		if(context.length() < len) {
			for(int i = 0; i < len - context.length(); i++) {
				str = ch + str;
			}
		}
		return str;
		//(1 + 4 + 16 + 32 + 1) * -1
	}

}
