import java.util.ArrayList;
import java.util.List;

/**
 * 
 */

/**
 * @author Jon
 *
 */
public class Hand {

	//attributes
	
	List<Card> cards;
	
	//Constructors
	
	/**
	 * default constructor of the hand class. Creates a hand containing an empty set of cards
	 */
	Hand(){
		cards = new ArrayList<Card>();
	}
	
	Hand(){
		
	}
	
	//Behaviors
	
	public void sortCards(){
		//TODO: sort the cards
	}
	
	public List<Card> replaceCards(List<Card> iCardsToReplace){
		//TODO: specify cards to be discarded
		return null;
	}
	
}
