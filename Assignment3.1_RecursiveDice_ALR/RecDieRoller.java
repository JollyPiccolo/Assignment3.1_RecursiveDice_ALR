/**
 * 
 */

/**
 * @author AdelineLR
 *
 */
public class RecDieRoller {
	/**
	 * Variable Instantiation
	 */
	int count = 1;
	int countdown = 1000;
	int totalCount;
	
	/**
	 * Constructor
	 */
	public RecDieRoller(){
		
	}
	
	/**
	 * Method
	 * roll() - rolls a die and prints its result until a 2 is rolled
	 */
	public void roll() {
		//rolling of the die
		int result = (int)((Math.random() * 6) + 1);
		
		//printing of results
		System.out.println("Roll: " + count + "; Result: " + result);
		
		//base case - ends the method once a two has been found
		//adds the total number of counts to the totalCount, and clears the count for the next invocation of Roll()
		if(result == 2) {
			totalCount += count;
			count = 1;
			return;
		}
		//recursive case - adds to the count and activates the roll() again
		    count++;
			this.roll();
		
	}
	
	/**
	 * Method
	 * roll1000() - rolls a die 1000 times, and prints both the number of rolls that return a 2, and the mean number of rolls that got a 2
	 */
	public void roll1000() {
		//resets the total count for the current round of roll1000()
		if(totalCount != 0 && countdown == 1000) {
			totalCount = 0;
		}
		
		//recursive case - repeats roll() 1000 times
		while(countdown != 0) {
			this.roll();
			countdown--;
		}
			
		//base case - once roll() has been summoned 1000 times, prints out the total and the average rolls needed to get a 2
		System.out.println("Total Rolls Taken: " + totalCount);
		System.out.println("Average Rolls Needed for a 2: " + ((double)1000/totalCount));
		
		//resets countdown for the next invocation of roll1000()
		countdown = 1000;
		return;
	}
}
