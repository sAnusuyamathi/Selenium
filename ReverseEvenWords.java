package stringManipulation;

public class ReverseEvenWords {

	public static void main(String[] args) {
		/* Pseudo Code:
		 
		 * Declare the input as Follow
	    a) split the words and have it in an array
		b) Traverse through each word (using loop)
		c) find the odd index within the loop (use mod operator)
		
		d)split the words and have it in an array
		
		e)print the even position words in reverse order using another loop (nested loop)
		f) Convert words to character array if the position is even else print the word as it is(concatenate space at the end).
	}

}*/
		String test = "I want become a software tester"; 
		String testRev ="";
		String testNew = "";
		String[] splitStr = test.split("\\s+");
		for (int i= 0; i < splitStr.length; i++) {
			if(i%2==0) {
				char[] ch = splitStr[i].toCharArray();
				testRev ="";
				for (int j = ch.length-1 ; j >=0 ; j--) {
					
					testRev = testRev + String.valueOf(ch[j]);
//					System.out.println(testRev + "  " + String.valueOf(ch[j]));
				}
				splitStr[i] = testRev;
			}
			
				testNew = 	testNew +" " + splitStr[i]; 
			
		}
		System.out.println(testNew);
	}
}
