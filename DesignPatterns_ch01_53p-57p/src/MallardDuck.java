import fly.FlyWithWings;
import quack.Quack;

// û�տ���
public class MallardDuck extends Duck {

	public MallardDuck() {
		quackBehavior = new Quack();
		flyBehavior = new FlyWithWings();
	}
	
	public void display() {
		System.out.println("���� ������ �Դϴ�");
	}
}
