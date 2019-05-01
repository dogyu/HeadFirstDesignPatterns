
public class MallardDuck extends Duck implements Flyable, Quackable {
	
	@Override
	public void display() {
		System.out.println("천둥오리가 화면에 표시 되다");
	}

	@Override
	public void fly() {
		System.out.println("하늘을 날고 있다");		
	}

	@Override
	public void quack() {
		System.out.println("꽥 거리다");		
	}
}
