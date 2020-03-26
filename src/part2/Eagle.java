package part2;

import part1.Flyable;

public class Eagle extends Animal implements Flyable {
	
	public Eagle(String name) {
		super(name);
	}

	@Override
	public void fly() {
		System.out.printf("The %s is soaring\n",super.getName());
		
	}
	
	

}
