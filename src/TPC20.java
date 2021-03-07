import kr.tpc.Animal;
import kr.tpc.Cat;
import kr.tpc.Dog;

public class TPC20 {
	public static void main(String[] args) {
		// Animal 부모 클래스를 사용하지 않음
		Dog d = new Dog(); // 자동 형변환 (Object Casting - upcasting)
		d.eat();

		Cat c = new Cat();
		c.eat();
		c.night();

		// Dog.class, Cat.class ?
		Animal ani = new Dog(); // upcasting
		ani.eat();

		ani = new Cat();
		ani.eat();
		((Cat)ani).night(); // 밤에 눈에서 빛이 난다. --> downcasting(강제형변환)
	}

}