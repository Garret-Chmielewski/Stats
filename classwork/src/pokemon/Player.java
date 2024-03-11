package pokemon;

import java.util.ArrayList;
/**
 * Mia help with the edits
 * @author Garret Chmielewski
 *
 */
public class Player 
{
	private ArrayList<Card> deck; 
	private ArrayList<Card> hand;
	ArrayList<Card> prize; 
	private ArrayList<Card> discard;
	private ArrayList<Card> bench;
	private ArrayList<Card> active;
	
	
	public Player()
	{
		deck = new ArrayList<Card>();
		hand = new ArrayList<Card>();
		prize = new ArrayList<Card>();
		discard = new ArrayList<Card>();
		bench = new ArrayList<Card>();
		active = new ArrayList<Card>();
	}
	

}
