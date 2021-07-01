package calculator;

public class calculator {
	
	public void addInt(int x,int y) {
	System.out.println("Addition of two numbers:" +(x+y));
	}
	public void addInt(int x,int y,int z) {
		System.out.println("Addition of three numbers:" +(x+y+z));
		}
	public void mutiply(int x,int y) {
		System.out.println("Multiplication of two numbers:" +(x*y));
		}
	public void mutiply(int x,double y) {
		System.out.println("Multiplication of two numbers:" +(x*y));
		}
	public void subtract(int x,int y) {
		System.out.println("Subtraction of two numbers:" +(x-y));
		}
	public void subtract(int x,double y) {
		System.out.println("Subtraction of two numbers:" +(x-y));
		}
	public void divide(int x,int y) {
		System.out.println("Division of two numbers:" +(x/y));
		}
	public void divide(int x,double y) {
		System.out.println("Division of two numbers:" +(x/y));
		}
	public static void main(String[] args) {
		calculator cal =new calculator();
		cal.addInt(50, 60);
		cal.addInt(50, 60,90);
		cal.mutiply(4, 1020);
		cal.mutiply(18, 52);
		cal.subtract(50, 6.75);
		cal.subtract(50, 17);
		cal.divide(90, 15);
		cal.divide(1500, 435.25);
		
//		String nwStr="TestLeaf Selenium";
//		nwStr.
		
	}
}


