import java.util.Collection;

/**
  * VideoPokerMachine models the User interface for a physical video poker machine.
  * It provides interfaces to fulfill user goals by coordinating communication between its
  * constituent parts. It provides some options to output results to the console, but is
  * primarily oriented toward being connected to a more robust User Interface to format
  * and display output for human consumption.
  *
 * @author Jonathan Grant
 *
 * @version 0.1
 * displays an arbitrary constant representing what will be a true expected payout for a
 * given video poker game's payout table.
 * 
 * Current issues: the machine contains only a hollow shell of a Payout Table,
 * and is unable to represent objects necessary to determining an expected payout, such as
 * a deck of cards, or poker hands. 
 * 
 * Current goal: model the objects that will enable the video poker machine to create poker
 * hands and keep track of the number of cards in a deck. 
 * 
 * Next milestone: use the Card, Deck, and Hand objects to populate a payout table.
 *
 * End goal for version 0.x : calculate the expected value of a hard-coded 
 * payout table based on certain "qualifying hands" and report this value to the user. 
 * 
 * Additionally, there is currently no way to specify a payout table for the game
 * of interest to the user. This feature is of high priority, however, work will not begin
 * until Version 1.0 has been reached, at which point the core logic for working with a 
 * hard-coded payout table will have been implemented and tested.
 *
 *
 */

public class VideoPokerMachine {
	
	//Attributes
	
	private PayoutTable gamePayoutTable;
	private Collection<Object> deck;
	
	
	//Constructors
	
	/**
	 * Constructs a VirtualPokerMachine with default values for testing purposes only.
	 * This default constructor is not meant to be invoked for any purpose other than
	 * to validate the functionality of the Video Poker Machine.
	 */
	
	VideoPokerMachine(){
		gamePayoutTable = new PayoutTable();
	}
	
	//Behaviors   
	
	/**
	 * displayExpectedPayout requests the expected payout from this machine's payout table
	 * 	and packages it into a string for display. It can also print the expected payout
	 *  directly to the console, if desired.
	 * 
	 * @param iPrintToConsole if true, the Expected Payout will be printed to the console.
	 * 		   Otherwise, it will only be returned to the calling method as a string.
	 * 
	 * @return String containing the expected payout of the video poker game
	 */
		
	private String displayExpectedPayout(boolean iPrintToConsole) {
		
		String results = "";

		results += "Expected Payout: " + gamePayoutTable.getExpectedPayout();
		
		if(iPrintToConsole){
			System.out.println(results);
		}
		
		return results;
	}
	
	//Accessors & Mutators
	
	/**
	 * testing method for the Virtual Poker Machine
	 * @param args - none
	 */
	public static void main(String[] args) {
		// TODO create a more comprehensive testing suite.
		
		
		VideoPokerMachine testMachine = new VideoPokerMachine();
		testMachine.displayExpectedPayout(true);
	}



}
