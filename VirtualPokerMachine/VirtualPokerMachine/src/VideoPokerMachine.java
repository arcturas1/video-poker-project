/**
 * 
 */

/**
 * @author Jon
 *
 */
public class VideoPokerMachine {
	
	private PayoutTable gamePayoutTable;
	
	/**
	 * Constructs a VirtualPokerMachine with fake values for testing 
	 */
	
	VideoPokerMachine(){
		gamePayoutTable = new PayoutTable();
	}
	
	private String displayExpectedPayout() {
		
		String results = "";

		results += gamePayoutTable.getExpectedPayout();
		
		return results;
	}
	
	/**
	 * tester for the Virtual Poker Machine
	 * @param args - none
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VideoPokerMachine testMachine = new VideoPokerMachine();
		System.out.println(testMachine.displayExpectedPayout());
	}



}
