public abstract class Card implements Comparable<Card>{
  
  /* handy arrays for ranks and suits    */
  /* do NOT change these                 */
  public final static String[] RANKS = { "None", "None", 
    "2", "3", "4", "5", "6", "7", "8", "9", "10", 
    "Jack", "Queen", "King", "Ace"};
  public final static String[] SUITS = { "Diamonds", 
    "Clubs", "Hearts", "Spades"};
  
	
	/** creates a card with specified suit and rank
	 * 
	 * @param suit is the suit of the card (must be a string from Card.SUITS)
	 * @param rank is the rank of the card (must be a string from Card.RANKS)
	 */
	 public Card(String suit, String rank){
			// add code here if needed
	 }
  
  /** the numerical representation of the rank of the current card
	 *  <p>
	 * ranks have the numerical values
	 *  2 = 2, 3 = 3, ..., 10 = 10
   *  Jack = 11, Queen = 12, King = 13, Ace = 14
   *	 
	 * @return the numerical rank of this card 
	 */
  public abstract int getRank();
	
	/** the string representation of the rank of the current card 
	 *
	 * @return the string representation of the rank of this card (must be a string from Card.RANKS) 
	 */
	public abstract String getRankString();
  
	
	/** the suit of the current card 
	 *
	 * @return the suit of this card (must be a string from Card.SUITS) 
	 */
	public abstract String getSuit();
  
  
  
  @Override
  public final String toString(){
    // outputs a string representation of a card object
    int r = getRank();
    if( r >= 2 && r <= 14 ){
      return r + getSuit().substring(0,1);
		}
    return "invalid card";
  }
  
}

