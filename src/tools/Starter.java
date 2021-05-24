package tools;

import search.Finder;
import search.Liste;

public class Starter {
	
	public void start() {
		Finder finder = new Finder();
		Input input = new Input();
		Liste liste = new Liste();
		
		int zahl= input.getZahl();
		if (input.useList()) {
			System.out.println("Liste: "+liste.list(zahl));
		}
		else {
			System.out.println("Ist "+zahl+" Harshad-Zahl?: "+finder.isHarshad(zahl));
		}		
	}
}
