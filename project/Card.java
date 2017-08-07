import java.util.HashMap;

public class Card implements Comparable<Card>{
  
  /* handy arrays for ranks and suits    */
  /* do NOT change these                 */
  public final static String[] RANKS = { "None", "None", 
    "2", "3", "4", "5", "6", "7", "8", "9", "10", 
    "Jack", "Queen", "King", "Ace"};
  public final static String[] SUITS = { "Diamonds", 
    "Clubs", "Hearts", "Spades", "None"};
  
	protected String suit;
	protected String rank;
	protected HashMap<String, Integer> rankValue;
	
	/** creates a card with specified suit and rank
	 * 
	 * @param suit is the suit of the card (must be a string from Card.SUITS)
	 * @param rank is the rank of the card (must be a string from Card.RANKS)
	 */
	 public Card(String suit, String rank){
			// assume input is valid!
			this.suit = suit; 
			this.rank = rank;
			this.rankValue = new HashMap<String,Integer>(15);
			for(int r = 2; r < RANKS.length; r+=1){
				this.rankValue.put(RANKS[r], r);
			}
	 }
  
  /** the numerical representation of the rank of the current card
	 *  <p>
	 * ranks have the numerical values
	 *  2 = 2, 3 = 3, ..., 10 = 10
   *  Jack = 11, Queen = 12, King = 13, Ace = 14
   *	 
	 * @return the numerical rank of this card 
	 */
  public int getRank(){
		if(this.rank.equals(RANKS[0])){ return -1; }   // "no card"
		return rankValue.get(this.rank);
	}
	
	/** the string representation of the rank of the current card 
	 *
	 * @return the string representation of the rank of this card (must be a string from Card.RANKS) 
	 */
	public String getRankString(){ return this.rank; }
  
	
	/** the suit of the current card 
	 *
	 * @return the suit of this card (must be a string from Card.SUITS) 
	 */
	public String getSuit(){ return this.suit; }
  
  @Override
	public int compareTo(Card other){
		return 0;
	}
  
  @Override
  public final String toString(){
		// outputs a string representation of a card object
    if(this.rank.equals(RANKS[0])){ 
			return "no card"; 
		}
		
    int r = getRank();
    if( r >= 2 && r <= 14 ){
      return r + getSuit().substring(0,1);
		}
    return "no card";
  }
  
}

