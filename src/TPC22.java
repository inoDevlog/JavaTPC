import kr.poly.Animal;
import kr.poly.Cat;
import kr.poly.Dog;

public class TPC22 {
	public static void main(String[] args) {

		// upcasting
		Animal ani = new Cat();
		ani.eat(); // 컴파일시점 -> Animal, 실행시점 -> Cat

		// Cat c = (Cat) ani; // downcasting
		// c.night();
		((Cat) ani).night();

		ani = new Dog();
		ani.eat();
		// 다형성
		// 상위 클래스가 하위 클래스에게 동일한 메세지로서로 다르게 동작시키는 원리

		Object o = new Dog();
		((Dog) o).eat();

	}
}
