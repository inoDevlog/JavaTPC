
public class TPC04 {
	public static void main(String[] args) {
		// 4. 데이터를 동하라(변수 VS 배열)
		int a, b, c;
		a = 10;
		b = 20;
		c = 30;
		// a+b+c=? 메서드 처리 -> hap()
		hap(a, b, c);
	}

	public static void hap(int x, int y, int z) {
		int sum = x + y + z;
		System.out.println(sum);
	}

}
