// ��������
public class DecoyDuck extends Duck {
	
	public DecoyDuck() {
		display();	
		swim();			
		quack();
		fly();
	}

	@Override
	public void quack() {
		// �ƹ��͵� ���� �ʵ��� �Ѵ�
	}
	
	@Override
	public void display() {
		System.out.println("���������� ȭ�鿡 ǥ�� �Ǵ�");
	}			

	@Override
	public void fly() {
		// �ƹ��͵� ���� �ʵ��� �Ѵ�
	}
}
