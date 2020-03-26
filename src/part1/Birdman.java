package part1;

public class Birdman extends Superhero implements Flyable {
	
	public Birdman(String name) {
		super(name);
	}
	
	@Override
	public void fly() {
		System.out.println(super.getCharacterName() + " is flying close to the sun");
		
	}

}
