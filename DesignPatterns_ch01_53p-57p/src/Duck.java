import fly.FlyBehavior;
import quack.QuackBehavior;

// �߻�Ŭ������ ����
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
		System.out.println("������ ������ �մϴ�");
	}
}