package java_fundamentals;

public class GalToLit {

	public static void main(String[] args) {
		double gallons;
		double liters;
		
		gallons = 10;
		liters = gallons * 3.7854;
		
		System.out.println(gallons + "gallons is " + liters + " liters.");
		System.out.println();
		
		double gallon, liter;
		int counter;
		
		counter = 0;
		for (gallon = 1; gallon <= 100; gallon++) {
			liter = gallon * 3.7854;
			System.out.println(gallon + " galon is " + liter + " liter.");
			
			counter++;
			if (counter ==10) {
				System.out.println();
				counter = 0; // reset the line counter
				
			}
		}
		

	}

}
