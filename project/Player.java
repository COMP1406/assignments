import java.util.ArrayList;
import java.util.Stack;

public abstract class Player{
	protected ArrayList<Card> hand;
	
	public int getSizeOfHand(){
		return hand.size();
	}
	
	/* play a card  */
	public abstract boolean play(DiscardPile       discardPile, 
	                             Stack<Card>       drawPile, 
										          	ArrayList<Player> players);
	// return true if player wins game by playing last card
	// returns false otherwise
	// side effects: plays a card to top of discard Pile, possibly taking zero
	//               or more cards from the top of the drawPile
	//               card played must be valid card
	
}