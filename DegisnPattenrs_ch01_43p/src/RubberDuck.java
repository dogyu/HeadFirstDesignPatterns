// ������
public class RubberDuck extends Duck{
	
	public void quack() {
		System.out.println("��� �Ÿ���");
	};
	
	@Override
	public void display() {
		System.out.println("���ε� ������ ȭ�鿡 ǥ�� �Ǵ�");
	}

	@Override
	public void fly() {
		// �ƹ��͵� ���� �ʵ��� �Ѵ�
	}
}
