package week3.day1;

public class Samsung extends AndroidTv implements Android1 {
	public void playVideo() {
		System.out.println("Open Application from Android");
		
	}


	public static void main(String[] args) {
		Samsung mobile = new Samsung();
		mobile.OpenApp();
		mobile.playVideo();
		

	}

}
