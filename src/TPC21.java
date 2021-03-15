import kr.poly.Animal;
import kr.poly.Cat;
import kr.poly.Dog;

public class TPC21 {
	public static void main(String[] args) {

		Dog d = new Dog();
		d.eat();

		Cat c = new Cat();
		c.eat();
		c.night();

		Animal ani = new Dog(); // upcasting
		ani.eat();

		ani = new Cat();
		ani.eat();
		// Cat cc = (Cat)ani;
		// cc.night();
		((Cat) ani).night(); //downcasting
	}
}
