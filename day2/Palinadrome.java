package week3.day2;

public class Palinadrome {

	public static void main(String[] args) {
		
		String name = "madam";
		String rname = "";
		for(int i=name.length()-1 ; i >=0 ; i--) {
			rname=rname+name.charAt(i);
		}
		System.out.println(rname);
		if(name.equals(rname)) {
			System.out.println("It is a palindrome");
		}
		else {
			System.out.println("It is not not palindrome");
		}

	}

}
