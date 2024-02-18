package labAss2;

public class GameApp {
	public static void main(String[] args) {		
		Character character = new Character (new Archer());
		System.out.println(character.strategy());
	}
}
