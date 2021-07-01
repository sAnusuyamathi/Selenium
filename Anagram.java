package stringManipulation;

import java.util.Arrays;


public class Anagram {

	public static void main(String[] args) {
		 /* Pseudo Code
		  
		 *Declare a String 
			String text1 = "stops";
		 *Declare another String
			String text2 = "potss"; 
		 * a) Check length of the strings are same then (Use A Condition)
		 * b) Convert both Strings in to characters
		 * c) Sort Both the arrays
		 * d) Check both the arrays has same value
		 * 
		 */
		String text1 ="stops";
		String text2 = "potss";
		String newStr = "";
		boolean flag=false;
		if(text1.length()==text2.length()) {
			char[] ch1 = text1.toCharArray();
			char[] ch2 = text2.toCharArray();
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			for (int i = 0; i < ch2.length; i++) {
				if(ch2[i]==ch1[i]) {
						newStr = newStr + ch2[i];
						flag = true;
					}
					
				}
				
			}
			if(flag) {
			System.out.println("Anagram: "+newStr);
			}
		}


	}

