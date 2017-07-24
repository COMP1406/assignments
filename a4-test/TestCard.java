import java.util.Arrays;
import java.util.Random;

public class TestCard{

	public static void main(String[] args){
		Card[] deck = new Card[52];
		
		/* create s standard deck of cards */
		int index = 0;
		for(int r=2; r<=14; r+=1){
			for(int s=0; s<4; s+=1){
				deck[index++] = new StandardCard(Card.SUITS[s], Card.RANKS[r]);
			}
		}
		
		/* print out the deck */
		System.out.println("original deck in order");
		System.out.println( Arrays.toString(deck) );
		
		
		/* shuffle the deck */
		Random rnd = new Random();
		Card swap;
		for(int i = deck.length-1; i>=0; i=i-1){
			int pos = rnd.nextInt(i+1);
			swap = deck[pos];
			deck[pos] = deck[i];
			deck[i] = swap;
		}		
		
		/* print out the deck */
		System.out.println("deck after shuffling");
		System.out.println( Arrays.toString(deck) );
	
		/* sort the array */
		Arrays.sort(deck);
	
		/* print out the deck */
		System.out.println("deck after sorting");
		System.out.println( Arrays.toString(deck) );
	
	
	}
}