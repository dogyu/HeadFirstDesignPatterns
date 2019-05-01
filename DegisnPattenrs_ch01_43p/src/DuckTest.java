
public class DuckTest {

	public static void main(String[] args) {
		
		MallardDuck mDuck = new MallardDuck();	// 청둥오리
		mDuck.display();
		mDuck.swim();
		mDuck.quack();
		mDuck.fly();
		
		System.out.println("\n");
		
		RedheadDuck rhDuck = new RedheadDuck();	// 붉은머리오리
		rhDuck.display();
		rhDuck.swim();
		rhDuck.quack();
		rhDuck.fly();
		
		System.out.println("\n");
		
		RubberDuck rDuck = new RubberDuck();	// 고무오리
		rDuck.display();	
		rDuck.swim();			
		rDuck.quack();		
		rDuck.fly();		// 날지못한다
		
		System.out.println("\n");
		
		new DecoyDuck();	// 나무오리
		//dDuck.display();	
		//dDuck.swim();			
		//dDuck.quack();	// 꽥꽥소리지 나지 않는다	
		//dDuck.fly();		// 날지못한다
	}
}