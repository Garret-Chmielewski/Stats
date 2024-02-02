package pokemon;

public class pokemon extends Card 
{
	private int hp;
	private String attackOneName;
	private String attackTwoName;
	

    public int getHP() {
        return hp;
    }

    public void setHP(int userInputHp) {
        hp = userInputHp;
    }
}
