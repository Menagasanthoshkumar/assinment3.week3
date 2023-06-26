package week3.day2;

public class RemoveDuplicates {

	public static void main(String[] args) {
		
		String text = "we learn java basics as part of java sessions in java week1";
		String replace = " ";
		String[] splitWords = text.split(" ");
		

		for (int i = 0; i < splitWords.length-1; i++) {
			int count = 0;
			for (int j = i+1; j < splitWords.length; j++) {

				if ((splitWords[i]).equals(splitWords[j])) {				
					count = count + 1;
				}

			}
			if (count>0) {
				System.out.print(replace);				
			}

			else {
				System.out.print(splitWords[i] + " ");
			}


		}


	}

}
