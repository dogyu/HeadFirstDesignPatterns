// 나무오리
public class DecoyDuck extends Duck {
	
	public DecoyDuck() {
		display();	
		swim();			
		quack();
		fly();
	}

	@Override
	public void quack() {
		// 아무것도 하지 않도록 한다
	}
	
	@Override
	public void display() {
		System.out.println("나무오리가 화면에 표시 되다");
	}			

	@Override
	public void fly() {
		// 아무것도 하지 않도록 한다
	}
}
