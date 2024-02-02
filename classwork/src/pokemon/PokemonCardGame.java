package pokemon;

import java.util.ArrayList;
import java.util.Random;
import java.util.Collections;

public class PokemonCardGame 
{
	private ArrayList<Card> deck; 
	private ArrayList<Card> hand;
	
	
	public PokemonCardGame()
	{
		deck = new ArrayList<Card>();
		hand = new ArrayList<Card>();
		deck.add(new pokemon());
		
		int deckSize =60;
		
		for(int i=1; i < deckSize; i++)
		{
			deck.add(new energy());
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

public void drawHand()
{
	for( int i =0; i < 7; i++)
	{
		hand.add(drawCard());
	}	
}

public boolean lookAtHand()
{
	boolean hasPokemon = false;
	for( int i =0; i < hand.size(); i++)
	{
		
		Card currentCard= hand.get(i);
		if(currentCard instanceof pokemon)
		{
			hasPokemon =true;
		}
	}
	return hasPokemon;
}

//Mia helped fix
public void newdeck()
{
	deck.clear();
	hand.clear();
	deck.add(new pokemon());
	
	int deckSize =60;
	
	for(int i=1; i < deckSize; i++)
	{
		deck.add(new energy());
	}
}

public void alterdeck(int pokecount)
{
	deck.clear();
	hand.clear();
	int deckSize =60;
	
	for(int p=1;p <= pokecount;p++)
	{
		deck.add(new pokemon());
	}
	
	for(int e=pokecount+1;e <= deckSize;e++)
	{
		deck.add(new energy());
	}
}


// Mia helped with this method 
public void run(double runamount)
{
	int deckSize =60;
	
	for(int q =1; q <= deckSize; q++)
	{
		double totalcount=0;
		for(int i=0;i < runamount; i++)
		{
			alterdeck(q);
			drawHand();
				if(lookAtHand()==true)
				{
					totalcount++;
				}
					
		}
		System.out.println("percent of playable hands for " + q +" pokemomn is " + (totalcount/runamount));
		
		
	}

		
		
		
}

}

