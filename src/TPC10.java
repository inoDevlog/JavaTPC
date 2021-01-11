import kr.tpc.BookDTO;

public class TPC10 {

	public static void main(String[] args) {
		// int, float, char, boolean -> PDT
		int a;
		a = 10;

		// 책(BookDTO)이라는 자료형을 만들자. --> class
		BookDTO b = new BookDTO();
		b.title = "Java";
		b.company = "cupist";
		b.price = 10000;
		b.page = 670;
		System.out.println(b.toString());
		System.out.println(b.title);
		System.out.println(b.company);
		System.out.println(b.price);
		System.out.println(b.page);

	}

}