
public class DuckTest {

	public static void main(String[] args) {
		
		MallardDuck mDuck = new MallardDuck();	// û�տ���
		mDuck.display();
		mDuck.swim();
		mDuck.quack();
		mDuck.fly();	// ���� �ִ� ���
		
		System.out.println("\n");
		
		RedheadDuck rhDuck = new RedheadDuck();	// �����Ӹ�����
		rhDuck.display();
		rhDuck.swim();
		rhDuck.quack();
		rhDuck.fly();	// ���� �ִ� ���		
	}
}