package methodOverriding;

public class AxisBank extends BankInfo{
	public void deposit() {
		System.out.println("Deposit Limit: 4,00,000");
	}
	public static void main(String[] args) {
		AxisBank ab = new AxisBank();
		ab.deposit();

	}

}
