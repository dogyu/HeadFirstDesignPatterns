
public class DuckTest {

	public static void main(String[] args) {
		
		MallardDuck mDuck = new MallardDuck();	// 没嫡坷府
		mDuck.display();
		mDuck.swim();
		mDuck.quack();
		mDuck.fly();
		
		System.out.println("\n");
		
		RedheadDuck rhDuck = new RedheadDuck();	// 河篮赣府坷府
		rhDuck.display();
		rhDuck.swim();
		rhDuck.quack();
		rhDuck.fly();
		
		System.out.println("\n");
		
		RubberDuck rDuck = new RubberDuck();	// 绊公坷府
		rDuck.display();
		rDuck.swim();
		rDuck.quack();
		//rDuck.fly();
		
		System.out.println("\n");
		
		DecoyDuck dDuck = new DecoyDuck();		// 唱公坷府
		dDuck.display();
	}

}
