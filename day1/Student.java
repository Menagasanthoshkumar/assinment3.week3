package week3.day1;

public class Student {
	public void getStudentInfo(int id) {
		System.out.println("My id number is :"+id);
		
	}
	public void getStudentInfo(int id , String name) {
		System.out.println("My id and name is:"+ id+ name);
		
		
	}
	public void getStudentInfo(String Email , double phoneNumber) {
		System.out.println("My Email id and Phone Number : "+Email+phoneNumber);
		
	}

	public static void main(String[] args) {
		Student info = new Student();
		info.getStudentInfo(15);
		info.getStudentInfo(10,"Anidra");
		info.getStudentInfo("luckyshalu7272@gamil.com",8668122208d);
		
		
		

	}

}
