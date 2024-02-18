package labAss2;

public class Character {
	private Type type;
	
	
	public Character (Type type) {
		this.type = type;
	}
	
	public String useStrategy() {
        return type.attack() + "\n" + type.defend();
    }
}
