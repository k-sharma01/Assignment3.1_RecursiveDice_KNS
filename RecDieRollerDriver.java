/**
 * This class is a driver to test the RecDieRoller class
 * @author Kirin Sharma
 * @version 1.0
 * CS 215
 *
 */

public class RecDieRollerDriver 
{

	public static void main(String[] args) 
	{

		// Initiates a new RecDieRoller and calls the roll method
		RecDieRoller roller = new RecDieRoller();
		roller.roll();
		
		// Calls the roll method 1000 times, counting how many rolls it takes to get to 2 each time
		int totalRolls = 0;
		for(int i = 0; i < 1000; i++)
			totalRolls += roller.roll();
		
		// Calculates and prints the average number of rolls it took to get a two over 1000 iterations
		double averageNumberOfRolls = totalRolls / 1000.0;
		System.out.println("On average, a 2 was rolled after " + averageNumberOfRolls + " rolls.");
		
	} //end main

} // end class
