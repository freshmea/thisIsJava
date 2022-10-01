package exam02;

public class VariableScopeExample {
	public static void main(String[] args) {
		int v1 = 15;
		if(v1 > 10) {
			int v2 = v1 - 10;
		}
//		int v3 = v1 + v2 + 5; 에러가 생김. v2 의 선언 범위가 넘어 갔다. 
		int v3 = v1 + 5;
		System.out.println(v3);
	}
}
