package stringManipulation;

public class CharOcuurrence {

	public static void main(String[] args) {
		String str = "welcome to chennai";

		// declare and initialize a variable count to store the number of occurrences
		int nCount =0;
		// convert the string into char array
			char[] ch = str.toCharArray();
		//get the length of the array
			System.out.println("Length of String:" + ch.length);
		// traverse from 0 till the array length 
			for (int i = 0; i < ch.length; i++) {
				if(ch[i]=='n') {
					nCount = nCount+1;
				}
			}
			// Check the char array has the particular char in it 
		
			// if is has increment the count
				 
			
			// print the count out of the loop
				System.out.println("No. of 'e' present in the String:"+nCount);
	}

}
