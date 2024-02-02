package pokemon;

public class Pikacku extends pokemon implements Attackable 
{
	public Pikacku()
	{
		
		setHP(70);
	}
	
	
	public void attackOne(pokemon target)
	{
		int currenthp= target.getHP();
		int newhp= currenthp-10;
		setHP(newhp);
	}
	
	public void attackTwo(pokemon target)
	{
		
	}
	
}	
