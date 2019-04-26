// 테스트 클래스
public class DuckTest {

	public static void main(String[] args) {
		
		MallardDuck mDuck = new MallardDuck();	// 청둥오리
		mDuck.display();
		mDuck.swim();
		mDuck.quack();		
		
		System.out.println("\n");
		
		RedheadDuck rhDuck = new RedheadDuck();	// 붉은머리오리
		rhDuck.display();
		rhDuck.swim();
		rhDuck.quack();		
	}
}