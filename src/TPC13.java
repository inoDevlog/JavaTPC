import kr.tpc.BookDTO;

public class TPC13 {
	public static void main(String[] args) {
		// 책 ->class(BookDTO) -> 객체 -> 인스턴스
		String title = "스프링";
		int price = 25000;
		String company = "제이펍";
		int page = 890;

		BookDTO dto;
		dto = new BookDTO(title, price, company, page);

		bookPrint(dto);

	}

	public static void bookPrint(BookDTO dto) {
		System.out.println(dto.title);
		System.out.println(dto.price);
		System.out.println(dto.company);
		System.out.println(dto.page);
	}

}
