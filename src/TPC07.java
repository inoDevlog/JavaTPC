
public class TPC07 {
	public static void main(String[] args) {

		int a = 20;
		float b = 56.7f;
		// a+b=?
		float v = sum(a, b);
		System.out.println(v);
	}

	public static float sum(int a, float b) {
		float v = a + b;
		return v;
	}

}
