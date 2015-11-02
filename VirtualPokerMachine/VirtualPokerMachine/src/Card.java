/**
 * 
 */

/**
 * @author Jon
 *
 */
public class Card {
	
	//attributes
	
	private Suit cardSuit;
	private Rank cardRank;
	private final int cardValue;
	
	//Constructors
	
	/**
	 * default constructor creates an Ace of Spades with an invalid cardValue for testing.
	 */
	Card(){
		cardSuit = Suit.SPADES;
		cardRank = Rank.ACE;
		cardValue = -1;
	}
	
	
	/**
	 * Create a card from a Rank and Suit
	 * @param iRank the Rank specified by the caller
	 * @param iSuit the Suit specified by the caller
	 */
	Card (final Rank iRank, final Suit iSuit){
		cardRank = iRank;
		cardSuit = iSuit;
		cardValue = iSuit.getValue()*iRank.getValue() + iRank.getValue();
	}
	
	//Behaviors
}
