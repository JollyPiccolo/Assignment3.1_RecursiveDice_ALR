/**
 * 
 */
import java.util.Scanner;
/**
 * @author AdelineLR
 *
 */
public class RecDieRollerDriver {
	public static void main(String[]args) {
		/**
		 * Instantiation of Necessary Variables
		 */
		RecDieRoller die = new RecDieRoller();
		Scanner scan = new Scanner(System.in);
		String input;
		
		
		/**
		 * Standard Roll - Prompt Loop
		 */
		do {
			
			/**
			 * Standard Roll - Prompt to Start
			 */	
			System.out.println("Enter S to start the Standard Roll: ");
			input = scan.next();
	
			/**
			 * Standard Roll - Activation, and Clearing of input
			 */
			if(input.equalsIgnoreCase("s")) 
				die.roll();
			
		}while(!input.equalsIgnoreCase("s"));
		
		
		/**
		 * Thousand Roll - Prompt Loop
		 */
		do {
			/**
			 * Thousand Rolls - Prompt to Start
			 */
			System.out.println("\nEnter S to start the Thousand Rolls: ");
			input = scan.next();
			
			/**
			 * Standard Roll - Activation, and Clearing of input
			 */
			System.out.println(input);
			
			if(input.equalsIgnoreCase("s")) 
				die.roll1000();
			
		}while(!input.equalsIgnoreCase("s"));
		
		
		/**
		 * Closing of the scanner
		 */
		scan.close();
	}
}