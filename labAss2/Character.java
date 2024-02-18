package labAss2;

public class Character {
	private Type type;
	
	public Character (Type type) {
		this.type = type;
	}
	
	public String strategy() {
        return type.attackStrategy() + "\n" + type.defenseStrategy();
    }
}
