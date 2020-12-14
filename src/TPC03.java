import kr.bit.Book;
import kr.bit.PersonVO;

public class TPC03 {
	public static void main(String[] args) {

		// 관계를 이해하라. PDT VS UDDT
		// 정수 1개를 저장하기 위한 변수를 선언하시오.
		int a;
		a = 10;

		// 책 1권을 저장하기 위한 변수를 선언하시오.
		Book b = new Book();
		b.title = "Java";
		b.price = 15000;
		b.company = "한빛미디어";
		b.page = 700;

		System.out.println(b.title);
		System.out.println(b.price);
		System.out.println(b.company);
		System.out.println(b.page);

		PersonVO p = new PersonVO();
		p.name = "CHOI";
		p.age = 38;
		p.weight = 82.1f;
		p.height = 182.7f;

		System.out.println(p.name);
		System.out.println(p.age);
		System.out.println(p.weight);
		System.out.println(p.height);

	}

}
