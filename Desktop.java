package org.system;

public class Desktop extends Computer{

	public void desktopSize() {
		System.out.println("Desktop size from Desktop Class");
	}
	public static void main(String[] args) {
		Desktop objDesk = new Desktop();
		objDesk.computerMode();
		objDesk.desktopSize();

	}
}

