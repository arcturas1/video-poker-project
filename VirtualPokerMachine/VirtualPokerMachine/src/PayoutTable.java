/**
 * PayoutTable models the payout table of a video poker machine.
 * when complete, it should contain some collection of qualifying poker hands,
 * coupled with the values that each qualifying hand pays out. 
 * 
 * It will be able to find its expected payout given such a collection, and validate
 * a given hand against its collection of qualifying hands to determine if the given hand 
 * warrants a payout.
 * 
 * @author Jonathan Grant
 *
 */
public class PayoutTable {
	
	//Attributes
	
	private double expectedPayout; // the expected payout of this payout table
	private static final double FAKE_EXPECTED_PAYOUT = 0.42; // an arbitrary fake expected payout for testing purposes
	
	//Constructors
	
	/**
	 * default constructor of the Payout Table. Sets improbable, but safe values for
	 * all class attributes.
	 */
	
	PayoutTable(){
		expectedPayout = -1;
	}
	
	//Behaviors
	
	/**
	 * analyzes this payout table to calculate its expected payout.
	 */
	private void calculateExpectedPayout() {
		// TODO actually calculate an Expected Payout
		
		expectedPayout = FAKE_EXPECTED_PAYOUT;
		
	}
	
	//Accessors and Mutators
	
	public double getExpectedPayout(){
		if(expectedPayout < 0){
			calculateExpectedPayout();
		}
		return expectedPayout;
	}

}
