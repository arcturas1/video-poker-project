
public enum Suit {
	SPADES ("Spades"),
	CLUBS ("Clubs"),
	DIAMONDS ("Diamonds"),
	HEARTS("Hearts");
	
	private final String suitName;
	
	Suit (final String isuitName){
		this.suitName = isuitName;
	}
	
	public int getValue(){
		return this.ordinal();
	}
	
	@Override
	public String toString(){
		return this.suitName;
	}
}
