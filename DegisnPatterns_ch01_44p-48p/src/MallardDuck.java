
public class MallardDuck extends Duck implements Flyable, Quackable {
	
	@Override
	public void display() {
		System.out.println("õ�տ����� ȭ�鿡 ǥ�� �Ǵ�");
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
