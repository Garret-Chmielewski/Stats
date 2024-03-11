package pokemon;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Collections;

/**
 * Mia helped with creating the rare candy methods
 * @author Garret Chmielewski
 *
 */
public class PokemonCardGame 
{
	private ArrayList<Card> deck; 
	private ArrayList<Card> hand;
	private ArrayList<Card> prize;
	
	/**
	 * constructor that holds the decks and hands
	 */
	public PokemonCardGame()
	{
		deck = new ArrayList<Card>();
		hand = new ArrayList<Card>();
		prize = new ArrayList<Card>();
	}
	

/**
 * draws cards 
 * @return
 */
public Card drawCard()
{
	Random rng = new Random();
	int cardIndex = rng.nextInt(deck.size());
	Card drawnCard = deck.get(cardIndex);
	deck.remove(cardIndex);
	return drawnCard;
}

/**
 * draws enough cards to make a hand of cards
 */
public void drawHand()
{
	for( int i =0; i < 7; i++)
	{
		hand.add(drawCard());
	}	
}

/**
 * look at the hand of cards you currently have
 * @return
 */
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

/**
 * finding both the instance of a pokemon and a rare candy
 * @return
 */
public boolean evaluateHand()
{
	boolean haspokemon = false;
	boolean hasrarecandy =false;
	boolean playable =false;
	for( int i =0; i < hand.size(); i++)
	{
		
		Card currentCard= hand.get(i);
		if(currentCard instanceof pokemon)
		{
			haspokemon =true;
		}		
	}
	
	for(int y =0; y<hand.size();y++)
	{
		Card prizeCard = hand.get(y);
		if(prizeCard instanceof rarecandy)
		{
			hasrarecandy= true;
		}
	}
	
	if(haspokemon && hasrarecandy)
	{
		playable =true;
	}
	return playable;
}

// Mia helped fix
/**
 * makes a new deck of cards
 */
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

/**
 * alters the deck to work with different amounts of pokemon
 * @param pokecount number of pokemon in the deck
 */
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

// Mia helped edit this
/**
 * alters the number of rare candy in a deck
 * @param candy number of rare candy
 */
public void alterCandyDeck(int candy) 
{
	deck.clear();
	hand.clear();
	int deckSize =60;
	
	for(int p=1; p <= candy;p++)
	{
		deck.add(new rarecandy());
	}
	
	for(int e=1; e <= 15;e++)
	{
		deck.add(new energy());
	}
	
	for(int z= 1; z <= 15;z++ )
	{
		deck.add(new pokemon());
	}
	
	deckSize = deckSize - (candy - 30);
	for(int z= 1; z <= deckSize;z++ )
	{
		deck.add(new trainer());
	}
}
	/**
	 * Mia helped me figure out how to help me implement prize pile
	 */	
	public void drawPrizePile() {
    for(int i = 0; i < 6; i++) {
        prize.add(drawCard());
    }
}



// Mia helped with this method
/**
 * runs the monte carlo experiment
 * @param runamount total number of runs
 */
public void run(double runamount)
{
	
	int deckSize =60;
	double percent;
	ArrayList<Double> results=new ArrayList<>();
	ArrayList<Integer> poke = new ArrayList<>();
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
		percent = totalcount/ runamount;
		System.out.println("percent of playable hands for " + q +" pokemomn is " + percent);
		poke.add(q);
		results.add(percent);
		
	}
	writer(results,poke);	
		
	}
 
/**
 * writes results to an excel file
 * @param results
 * @param poke
 */
	private void writer(ArrayList<Double> results,ArrayList <Integer>poke)
	{
	
		try(FileWriter Writer = new FileWriter("monte carlo.csv");
				BufferedWriter creator = new BufferedWriter(Writer))
		{
			for(int j =0; j < results.size();j++)
			{
				creator.write(String.valueOf(poke.get(j)) + "," + String.valueOf(results.get(j)));
			}
			System.out.println(" successfully transfered to file" );
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
	
	/**
	 * Mia helped implement method
	 * @return state of opening hand
	 */
	public boolean evaluateOpeningHand() {
        for(int i = 0; i < hand.size(); i++) {
            Card currentCard = hand.get(i);
            if(currentCard instanceof rarecandy) {
                return true;
            }
        }
        return false;
    }

    /**
     * Mia helped implement method
     * @return 
     */
    public boolean evaluatePrizePile() {
        for(int i = 0; i < prize.size(); i++) {
            Card currentCard = prize.get(i);
            if(currentCard instanceof rarecandy) {
                return true;
            }
        }
        return false;
    }
	
/**
 * runs monte carlo for rare candies, Mia helped edit my origonal code to work
 * @param runamount how many times the test is done
 */
	public void candyrun(double runamount)
	{
		int deckSize =60;
		
		for(int w =1; w <= 4; w++)
		{
			double candy=0;
			for(int j = 0; j < runamount; j++) 
			{
				PokemonCardGame candyDeck = new PokemonCardGame();
                candyDeck.alterCandyDeck(w);
                openingHand(candyDeck);
                if(!isCandyBricked(candyDeck)) 
                {
                    candy++;
                }
                
              
            }
			
			System.out.println("number of candies: " + w + ", Number of prize piles with all candies: " + (candy) +
                    ", percentage of prize piles with all candies: " +
                    ((candy / runamount) * 100) + "%");
            System.out.println("Percent chance of not getting a bricked deck: "
                    + (100 - ((candy / runamount) * 100)) + "%" + "\n");
            
        }
    }
		/**
		 * Mia helped implement method
		 * @param candyDeck
		 */
		public void openingHand(PokemonCardGame candyDeck) 
		{
	        candyDeck.drawHand();
	        boolean isReady = false;
	        while (!isReady) 
	        {
	            if (!candyDeck.evaluateOpeningHand()) 
	            {
	                candyDeck.restartOpeningHand();
	                candyDeck.drawHand();
	            } else 
	            {
	                isReady = true;
	            }
	        }
	        candyDeck.drawPrizePile();
	    }
		
		/**
		 * Mia helped implement method
		 */
		public void restartOpeningHand() 
		{
	        deck.addAll(hand);
	        hand.clear();
	        Collections.shuffle(deck);
	    }
		
		/**
		 * Mia helped implement method
		 * @param candyDeck
		 * @return
		 */
		private boolean isCandyBricked(PokemonCardGame candyDeck) {
	        for (int i = 0; i < candyDeck.prize.size(); i++) {
	            if (candyDeck.prize.get(i) instanceof rarecandy) {
	                return false;
	            }
	        } return true;
	    }	
		
		
}




