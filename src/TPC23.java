import kr.poly.Animal;
import kr.poly.Cat;
import kr.poly.Dog;

public class TPC23 {
	public static void main(String[] args) {
		// 1. 다형성 인수
		Dog d = new Dog();
		dispoay(d);
		Cat c = new Cat();
		dispoay(c);
	}

	private static void dispoay(Animal r) { // 다형성 인수
		r.eat();
		// r.night();
		if (r instanceof Cat) {
			((Cat) r).night(); // downcasting
		}
	}

}
