package kr.poly;

public class Radio implements RemoCon {

	int currVol = 70;

	@Override
	public void chUp() {
		if (currVol < RemoCon.MAXCH) {
			currVol++;
			System.out.println("레디오 볼륨이 올라간다.:" + currVol);
		} else {
			currVol = 1;
			System.out.println("레디오 볼륨이 올라간다.:" + currVol);
		}
	}

	@Override
	public void chdown() {
		if (currVol > RemoCon.MINCH) {
			currVol--;
			System.out.println("레디오 볼륨이 내려간다.:" + currVol);
		} else {
			currVol = 100;
			System.out.println("레디오 볼륨이 내려간다.:" + currVol);
		}

	}

	@Override
	public void internet() {
		System.out.println("인터넷이 안된다");
	}

}
