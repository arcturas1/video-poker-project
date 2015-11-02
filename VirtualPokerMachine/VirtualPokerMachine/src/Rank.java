
public enum Rank {

	ACE ("Ace", 1),
	TWO ("2", 2),
	THREE ("3", 3),
	FOUR ("4", 4),
	FIVE ("5", 5),
	SIX ("6", 6),
	SEVEN ("7", 7),
	EIGHT ("8", 8),
	NINE ("9", 9),
	TEN ("10", 10),
	JACK ("J", 11),
	QUEEN ("Q", 12),
	KING ("K", 13);
	
	private final String rankName;
	
	private final int rankValue;
	
	Rank (final String iName, final int iValue){
		this.rankName = iName;
		this.rankValue = iValue;
	}
	
	public int getValue(){
		return this.rankValue;
	}
	
	@Override
	public String toString(){
		return this.rankName;
	}
	
}
