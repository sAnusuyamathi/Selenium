package stringManipulation;

import java.util.Iterator;

public class SumOfDigitsString {

	public static void main(String[] args) {
		/*
		 * Method 1
		 * Pseudo Code
		 
		 * Declare a String text with the following value
			String text = "Tes12Le79af65";
		   Declare a int variable sum
			int sum = 0;
		 * a) using replaceAll(), replace all the non-digits into ""
		 * b) Now, convert the String into array
		 * c) Iterate over the array and get each character
		 * d) Using Character.getNumericValue(), Change the char into int
		 * e) Add the values to sum & print
		 * 
		 */
		String text = "Tes12Le79af65";
		int sum=0;
		
//		System.out.println(text.replaceAll("\\D+", ""));
		String strNew = text.replaceAll("\\D+", "");
		System.out.println("Numeric values in the string: "+strNew);
		char[] ch = strNew.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			sum = sum + Character.getNumericValue(ch[i]);
//			System.out.println(ch[i]);
			}
		System.out.println("Sum of Digits-Method1 :"+sum);
		/*
		 * Method 2
		 * Pseudo Code
		 * Declare a String text with the following value
			String text = "Tes12Le79af65";
		   Declare a int variable sum
			int sum = 0;
		 * a) Iterate an  array over the String
		 * b) Get each character and check if it is a number using Character.isDigit()
		 * c) Now covert char to int using Character.getNumericValue() and add it to sum
		 * d) Now Print the value
		 */
			sum=0;
			for (int i = 0; i < ch.length; i++) {
				if(Character.isDigit(ch[i])) {
					sum = sum + Character.getNumericValue(ch[i]);
				}
			}
			System.out.println("Sum of Digits by Method2 :" +sum);
	}

}
