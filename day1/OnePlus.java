package week3.day1;

public class OnePlus extends AndroidTv implements Android1{
	public void PlayVideo() {
		System.out.println("Video from Android");
			
		}
	
    public static void main(String[] args) {
	OnePlus mobile = new OnePlus();
	mobile.OpenApp();
	mobile.PlayVideo();
		
		
	

	}

}
