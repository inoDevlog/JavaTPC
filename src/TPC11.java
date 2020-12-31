import kr.tpc.BookVO;

public class TPC11 {
	public static void main(String[] args) {
		// 책 1권을 저장하기 위해 [객체를 생성]하시오.
		BookVO b = new BookVO();
		b.title = "python";
		b.price = 16000;
		b.company = "hanbit";
		b.page = 700;

		System.out.println(b.title);
		System.out.println(b.price);
		System.out.println(b.company);
		System.out.println(b.page);

		BookVO b1 = new BookVO();
		b1.title = "oracle";
		b1.price = 16000;
		b1.company = "hanbit";
		b1.page = 700;

		System.out.println(b1.title);
		System.out.println(b1.price);
		System.out.println(b1.company);
		System.out.println(b1.page);
	}

}
