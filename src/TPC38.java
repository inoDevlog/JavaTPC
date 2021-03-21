import java.util.ArrayList;
import java.util.List;

import kr.tpc.BookDTO;

public class TPC38 {
	public static void main(String[] args) {

		// Object[] --> BookDTO[]
		List<BookDTO> list = new ArrayList<BookDTO>(1);

		list.add(new BookDTO("자바", 12000, "이지스", 600));
		list.add(new BookDTO("C언어", 12000, "이지스", 600));
		list.add(new BookDTO("파이썬", 12000, "이지스", 600));

		for (int i = 0; i < list.size(); i++) {
			// Object o = list.get(i);
			BookDTO vo = list.get(i);
			System.out.println(vo.title + "\t" + vo.price);

		}
	}

}
