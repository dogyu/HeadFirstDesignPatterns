import fly.FlyBehavior;
import quack.QuackBehavior;

// 추상클래스로 변경
public abstract class Duck {	 	
	
	FlyBehavior flyBehavior;	
	QuackBehavior quackBehavior;	
	
	public abstract void display();
	
	public void performFly() {
		flyBehavior.fly();
	}
	
	public void performQuack() {
		quackBehavior.quack();
	}	
	
	public void swim() {
		System.out.println("오리가 수영을 합니다");
	}
}