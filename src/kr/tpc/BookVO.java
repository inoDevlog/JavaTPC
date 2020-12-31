package kr.tpc;

// 책(Object)-> 제목, 가격, 출판사, 페이지수......
public class BookVO {
	public String title;
	public int price;
	public String company;
	public int page;

	// 디폴트 생성자메서드(생략)
	public BookVO() {
		// init
		this.title = "Java";
		this.price = 14000;
		this.company = "ESYS";
		this.page = 780;
	}

	// 생성자 메서드의 중복정의(Overloading)
	public BookVO(String title, int price, String company, int page) {
		this.title = title;
		this.price = price;
		this.company = company;
		this.page = page;
	}
}
