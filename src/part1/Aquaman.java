package part1;

public class Aquaman extends Superhero {
	
	public Aquaman(String name) {
		super(name);
	}

	@Override
	public void saveTheWorld() {
		System.out.println(super.getCharacterName() + " saves Atlantis again!");
		
	}
	
	

}
