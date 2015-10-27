
public class PayoutTable {
	private double expectedPayout;
	private static final double FAKE_EXPECTED_PAYOUT = 42;
	
	PayoutTable(){
		expectedPayout = FAKE_EXPECTED_PAYOUT;
	}
	
	public double getExpectedPayout(){
		
		return expectedPayout;
	}
}
