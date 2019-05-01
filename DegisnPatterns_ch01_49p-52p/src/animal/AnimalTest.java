package animal;

public class AnimalTest {

	public static void main(String[] args) {
		
		Dog d = new Dog();
		d.bark();
		
		System.out.println();
		
		Animal animal1 = new Dog();
		animal1.makeSound();
		
		System.out.println();
		
		Animal animal2 = new Cat();
		animal2.makeSound();

	}

}
