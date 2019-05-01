
public class RubberDuck extends Duck implements Quackable{
	@Override
	public void display() {
		System.out.println("고무로된 오리가 화면에 표시 되다");
	}	

	@Override
	public void quack() {
		System.out.println("꽥 거리다");		
	}
}
