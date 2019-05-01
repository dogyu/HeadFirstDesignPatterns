import fly.FlyWithWings;
import quack.Quack;

// 청둥오리
public class MallardDuck extends Duck {

	public MallardDuck() {
		quackBehavior = new Quack();
		flyBehavior = new FlyWithWings();
	}
	
	public void display() {
		System.out.println("저는 물오리 입니다");
	}
}
