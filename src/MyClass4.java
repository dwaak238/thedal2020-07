import java.util.*;
import java.util.Random;
import java.util.Scanner;

public class MyClass4 {

	public int userDab() {
		Scanner scan = new Scanner(System.in);
		return scan.nextInt();
	}
	public int[] rnd2Num() {
		Random rnd = new Random();
		int[] nums = new int [2]; 
		nums[0] = rnd.nextInt(100);
		nums[1] = rnd.nextInt(100);
		return nums;
	}
	
	public ArrayList<Integer> rnd2NumList() {
		ArrayList<Integer> list = new ArrayList<Integer>();
		Random rnd = new Random();
		list.add(rnd.nextInt(100));
		list.add(rnd.nextInt(100));
		return list;
	}

	public int k2() {
		Random rnd = new Random();
		int a = rnd.nextInt(100);
		int b = rnd.nextInt(100);

		System.out.print(a + " + " + b + " =");
		int c = a + b;

		return c;
	}
	//매개 변수로 두개를 받아서 더하기 값을 전달 하는 매소드
	//매소드 이름은 그대로 k2 사용 
	//메인 매소드에서
	//위에 만든 랜덤 숫자 2개를 전달 매소드를 활용
	//메인 매소드에서 k2() 의 결과만 출력 해보자
	//rnd2NumList() 매소드를 호출하고
	//받은 데이터를 k2()에 넣고 k2()에서 결과값을 외부로 전달하여
	//화면에 결과값만 출력
	public int k2(int a, int b) {
		return a + b;
	}
	

}
