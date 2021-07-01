package stringManipulation;

public class FindTypes {

	public static void main(String[] args) {
		// // Here is the input
		String test = "$$ Welcome to 2nd Class of Automation $$ ";
		int testLen = test.length();
		System.out.println("Length of the given String: "+testLen);
		// Here is what the count you need to find
		int  letter = 0, space = 0, num = 0, specialChar = 0;

		// Build the logic to find the count of each
		/* Pseudo Code:
			a) Convert the String to character array
			b) Traverse through each character (using loop)
			c) Find if the given character is what type using (if)
					i)  Character.isLetter
					ii) Character.isDigit
					iii)Character.isSpaceChar
					iv) else -> consider as special character
		*/
		char ch[]=test.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if(Character.isLetter(ch[i])){
				letter = letter + 1;
			}
			else if(Character.isDigit(ch[i])) {
				num = num+1;
			}else if(Character.isSpaceChar(ch[i])) {
				space= space + 1;
				
			}else {
				specialChar = specialChar +1;
			}
		}
			
		
		// Print the count here
		System.out.println("letter: " + letter);
		System.out.println("space: " + space);
		System.out.println("number: " + num);
		System.out.println("specialCharcter: " + specialChar);
		
		//using Replace All
		
		String strLetter = test.replaceAll("[a-zA-Z]", "");
		int strLetterRepLen = strLetter.length();
		System.out.println(strLetter);
		System.out.println("Length of Letters: "+ (testLen-strLetterRepLen));
		
		String strDigit = test.replaceAll("\\d+", "");
		int strDigitRepLen = strDigit.length();
		System.out.println(strDigit);
		System.out.println("Length of Number: "+ (testLen-strDigitRepLen));
		
		//not working, must try with inserting "-" and then split and do the count
		String strSpace = test.replaceAll("\\s+", "");
		int strSpaceRepLen = strDigit.length();
		System.out.println(strSpace);
		System.out.println("Length of Space: "+ (testLen-strSpaceRepLen));
		
		String strSplChar = test.replaceAll("[a-zA-Z0-9]\\s+", "");
		int strSplCharLen = strDigit.length();
		System.out.println("Length of Letters: "+ (testLen-strSplCharLen));
		System.out.println(strSplChar);
		
		//Reg Ex
		
		
	}
}
