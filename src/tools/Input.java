package tools;

import java.util.Scanner;

public class Input {	
	public int getZahl() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Bitte eine Zahl eingeben: ");
		int zahl = Integer.parseInt(scan.nextLine());
		return zahl;
	}
	
	public boolean useList() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Liste ausdrucken? Y / N: ");
		String input = scan.nextLine();
		if (input.equals("y")) {
			return true;
		}
		return false;
	}
}

