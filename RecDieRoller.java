/**
 * This class contains a method to roll a die recursively
 * @author Kirin Sharma
 * @version 1.0
 * CS 215
 *
 */

public class RecDieRoller 
{
	
	/**
	 * This method represents rolling a die, printing what number it landed on until it lands on two.
	 * This is a recursive function, where the base case is where the current roll is 2.
	 * @return the number of rolls it took to get a two
	 */
	public int roll()
	{
		int currentRoll = (int) (Math.random() * 6) + 1;	
		System.out.println("You rolled a: " + currentRoll + "!");

		if(currentRoll == 2)
			return 1;
		
		return 1 + roll();
		
	} // end roll
	
} // end class
