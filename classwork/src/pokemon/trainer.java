package pokemon;

import java.util.ArrayList;
import java.util.Random;

public class trainer extends Card
{
	private ArrayList<Card> deck; 
	private ArrayList<Card> hand;
	
	private String cardname;
	
	public void drawHand()
	{
		for( int i =0; i < 7; i++)
		{
			hand.add(drawCard());
		}	
	}
	
	public Card drawCard()
	{
		Random rng = new Random();
		int cardIndex = rng.nextInt(deck.size());
		Card drawnCard = deck.get(cardIndex);
		deck.remove(cardIndex);
		return drawnCard;
	}
	
	
}


