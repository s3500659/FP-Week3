package part1;

public abstract class Superhero {
	
	private String characterName;
	
	public Superhero(String characterName) {
		this.characterName = characterName;
	}
	
	public void saveTheWorld() {
		System.out.println(characterName + " saves the world again!");
	}
	
	public String getCharacterName() {
		return characterName;
	}

}
