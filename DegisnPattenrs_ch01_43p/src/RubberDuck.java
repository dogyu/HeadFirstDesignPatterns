// 고무오리
public class RubberDuck extends Duck{
	
	public void quack() {
		System.out.println("삑삑 거리다");
	};
	
	@Override
	public void display() {
		System.out.println("고무로된 오리가 화면에 표시 되다");
	}

	@Override
	public void fly() {
		// 아무것도 하지 않도록 한다
	}
}
