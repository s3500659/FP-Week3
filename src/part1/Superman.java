package part1;

public class Superman extends Superhero implements Flyable {
	
	public Superman(String name) {
		super(name);
	}

	@Override
	public void saveTheWorld() {
		System.out.println(super.getCharacterName() + " saves the world and Lois Lane again!");
	}

	@Override
	public void fly() {
		System.out.println(super.getCharacterName() + " is flying to the fortress of solitude");
		
	}
	
	
	
	

}
