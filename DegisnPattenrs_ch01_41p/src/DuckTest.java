
public class DuckTest {

	public static void main(String[] args) {
		
		MallardDuck mDuck = new MallardDuck();	// 청둥오리
		mDuck.display();
		mDuck.swim();
		mDuck.quack();
		mDuck.fly();	// 날수 있는 기능
		
		System.out.println("\n");
		
		RedheadDuck rhDuck = new RedheadDuck();	// 붉은머리오리
		rhDuck.display();
		rhDuck.swim();
		rhDuck.quack();
		rhDuck.fly();	// 날수 있는 기능		
	}
}