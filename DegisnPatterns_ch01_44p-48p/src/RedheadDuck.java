
public class RedheadDuck extends Duck implements Flyable, Quackable {

	@Override
	public void display() {
		System.out.println("�����Ӹ������� ȭ�鿡 ǥ�� �Ǵ�");
	}
	
	@Override
	public void fly() {
		System.out.println("�ϴ��� ���� �ִ�");		
	}

	@Override
	public void quack() {
		System.out.println("�� �Ÿ���");		
	}
}
