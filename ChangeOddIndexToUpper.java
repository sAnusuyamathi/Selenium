package stringManipulation;

import java.util.Arrays;

public class ChangeOddIndexToUpper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 Pseudo Code
		 
		 * Declare String Input as Follow
		  String str= "changeme"
		 * String test = "changeme";
		 
		 * a) Convert the String to character array
		 
		 * b) Traverse through each character (using loop)
		 
		 * c)find the odd index within the loop (use mod operator)
		 
		 * d)within the loop, change the character to uppercase, if the index is odd else don't change
		  
		 */
		String str= "changeme";
		String newStr="";
		String snewStr="";
//		str.charAt(0)
		char[] ch = str.toCharArray();
		
//		Arrays.sort(ch);
		for(int i=0;i<ch.length;i++) {
			 
			if(i%2!=0) {
				newStr = ""+ch[i];
				newStr = newStr.toUpperCase();
				snewStr = snewStr + newStr;
					}
			else {
				snewStr = snewStr + ch[i];
			}
	
			
		
		}
		String str2 = new String(ch);
		System.out.println(str2);
		System.out.println("convert to Upper case for odd index:" + snewStr);
	}

}
