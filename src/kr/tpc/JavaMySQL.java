package kr.tpc;

public class JavaMySQL implements DbConnect {

	@Override
	public void getConnection(String url, String user, String password) {
		System.out.println("MySQL Started..");

	}

}
