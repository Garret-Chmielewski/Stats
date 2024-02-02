package pokemon;

import java.util.ArrayList;

public class Player 
{
	private ArrayList<Card> deck; 
	private ArrayList<Card> hand;
	private ArrayList<Card> prize; 
	private ArrayList<Card> discard;
	
	public Player()
	{
		deck = new ArrayList<Card>();
		hand = new ArrayList<Card>();
		prize = new ArrayList<Card>();
		discard = new ArrayList<Card>();
	}
}
