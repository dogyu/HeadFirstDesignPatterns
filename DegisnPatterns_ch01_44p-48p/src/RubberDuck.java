
public class RubberDuck extends Duck implements Quackable{
	@Override
	public void display() {
		System.out.println("���ε� ������ ȭ�鿡 ǥ�� �Ǵ�");
	}	

	@Override
	public void quack() {
		System.out.println("�� �Ÿ���");		
	}
}
