package part1;

public class Batman extends Superhero {
	
	public Batman(String name) {
		super(name);
	}

	@Override
	public void saveTheWorld() {
		System.out.println(super.getCharacterName() + " saves Gotham City again!");
	}
	
	
	
	

}
