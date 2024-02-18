package labAss2;

public class Knight implements Type{
	public String attackStrategy () {
		return "Knight attacks with a sword!";
	}
	
	public String defenseStrategy () {
		return "Using a shield to defend!\n"+
			   "Dodgin to avoid attack!\n"+
			   "Creating a magic barrier for defense!";
	}
}
