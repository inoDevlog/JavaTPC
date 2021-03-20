public class TPC34 {

	public static void main(String[] args) {

		// String
		String str = new String("APPLE");

		String v = str.toLowerCase();

		System.out.println(v);
		System.out.println(str.charAt(3));
		System.out.println(str.length());
		System.out.println(str.indexOf("PL"));
		System.out.println(str.indexOf("PX")); // -1 대개는 실패의 느낌
		System.out.println(str.replaceAll("P", "X"));

	}
}
