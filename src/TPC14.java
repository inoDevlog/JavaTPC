import kr.tpc.MemberVO;

public class TPC14 {
	public static void main(String[] args) {

		MemberVO m = new MemberVO();

		m.setName("DaYoon");
		m.setAge(7);
		m.setTel("010-1111-1111");
		m.setAddr("SEOUL");

		System.out.println(m.getName());
		System.out.println(m.getAge());
		System.out.println(m.getTel());
		System.out.println(m.getAddr());
	}

}
