package part2;

import part1.Flyable;

public class Parrot extends Animal implements Flyable {
	
	public Parrot(String name) {
		super(name);
	}

	@Override
	public void fly() {
		System.out.printf("The %s is flying in all its glorified colour\n", super.getName());  
	}

}
