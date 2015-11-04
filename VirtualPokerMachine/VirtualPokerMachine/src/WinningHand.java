import java.util.List;

/**
 * 
 */

/**
 * @author Jon
 *
 */
public class WinningHand extends Hand {

	//attributes
	private double payoutValue;
	
	//Constructors
	
	/**
	 * default constructor; creates a winning hand with an empty list of cards and an invalid payout value for testing purposes.
	 */
	public WinningHand() {
		// TODO Auto-generated constructor stub
		super();
		payoutValue = -1;
	}
	
	public WinningHand(List<Card> iCards, double iHandValue){
		super(iCards);
		payoutValue = iHandValue;
	}
	
	//Behaviors

}
