
public class DuckTest {

	public static void main(String[] args) {
		
		MallardDuck mDuck = new MallardDuck();	// û�տ���
		mDuck.display();
		mDuck.swim();
		mDuck.quack();
		mDuck.fly();
		
		System.out.println("\n");
		
		RedheadDuck rhDuck = new RedheadDuck();	// �����Ӹ�����
		rhDuck.display();
		rhDuck.swim();
		rhDuck.quack();
		rhDuck.fly();
		
		System.out.println("\n");
		
		RubberDuck rDuck = new RubberDuck();	// ������
		rDuck.display();
		rDuck.swim();
		rDuck.quack();
		//rDuck.fly();
		
		System.out.println("\n");
		
		DecoyDuck dDuck = new DecoyDuck();		// ��������
		dDuck.display();
	}

}
