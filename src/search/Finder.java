package search;

public class Finder {

	public boolean isHarshad(int x) {	
		int ziffer=0;
		int quersumme=0;
		int zahl=x;
		int divisor=1;
		
		// Ausrechnen, wie viele Ziffern die Zahl hat
		while((x/divisor)>0) {
			divisor*=10;	
		}		

		while(divisor!=0) {			
			ziffer=zahl/divisor;
			zahl-=(ziffer*divisor);
			divisor/=10;
			quersumme+=ziffer;
		}
		
		if (x%quersumme==0) {
			return true;
		}		
		return false;
	}
}
