package search;

import java.util.ArrayList;

public class Liste {
	public ArrayList list(int zahl) {
		Finder finder = new Finder();
		ArrayList<Integer> numbers = new ArrayList<>();
		
		for(int i=1; i<=zahl; i++) {
			if(finder.isHarshad(i)) {
				numbers.add(i);
			}			
		}	
		return numbers;
	}
}
