package pokemon;

public class Chimchar extends pokemon implements Attackable
{
	public Chimchar()
	{
		setHP(50);
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
