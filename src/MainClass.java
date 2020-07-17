// 메인 클래스
import java.util.*;

public class MainClass {

	public static void main(String[] args) {
		// 클래스 선언
		MyClass mc = new MyClass();
		MyClass2 mc2 = new MyClass2();
		MyClass3 mc3 = new MyClass3();
		MyClass4 mc4 = new MyClass4();
//		System.out.println(mc2);
//		mc.bab();
//		mc.food();
//		mc.nono();
//		
//		mc2.m1();
//		mc2.m2();
		
		// 외부 클래스에서 값 받아오기
//		int i = mc3.r1();
//		System.out.println("r1에서 받은 int 데이터: " + i);
//		String k = mc3.r2();
//		System.out.println("r2에서 받은 String 데이터: " + k);
		
		// 클래스 만들고 메소드 만들기
		// thedal의 기능을 별도로 만들어서
		// 더하기를 출력해주는 메소드
		// 더하기의 답을 전달해주는 메소드
		// 메인에서 메소드만 이용해서 출력 또는 답을 비교
		
//		int q = mc4.k2();
//		
//
//		for (;;) {
//			int input = mc4.userDab();
//			if (input == q) {
//				System.out.println("정답입니다.");
//				break;
//			} else {
//				System.out.println("틀렸습니다.");
//			}
//		}
		
		// 오버로딩
		ArrayList<Integer> list = mc4.rnd2NumList();
		System.out.println("랜덤의 수의 리스트 갯수: " + list.size());
		System.out.println("첫번째 수 : " + list.get(0));
		System.out.println("두번째 수 : " + list.get(1));
		int dab = mc4.k2(list.get(0), list.get(1));
		System.out.println(dab);
		
	}
}
