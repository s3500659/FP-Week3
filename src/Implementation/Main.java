package Implementation;
import java.util.ArrayList;
import java.util.List;

import part1.Aquaman;
import part1.Batman;
import part1.Birdman;
import part1.Flyable;
import part1.Superhero;
import part1.Superman;
import part1.WonderWoman;
import part2.Eagle;
import part2.Parrot;

public class Main {
	
	static List<Superhero> mySuperheroCollection = new ArrayList<>();
	static List<Flyable> myFlyables = new ArrayList<>();

	public static void main(String[] args) {
		
		Superhero aquaMan = new Aquaman("Aquaman");
		Superhero batMan = new Batman("Batman");
		Superhero superMan = new Superman("Superman");
		Superhero birdMan = new Birdman("Birdman");
		Superhero wonderWoman = new WonderWoman("WonderWoman");
		Flyable eagle = new Eagle("Eagle");
		Flyable parrot = new Parrot("Parrot");
		
		mySuperheroCollection.add(aquaMan);
		mySuperheroCollection.add(batMan);
		mySuperheroCollection.add(superMan);
		mySuperheroCollection.add(birdMan);
		mySuperheroCollection.add(wonderWoman);
		
		for (Superhero i : mySuperheroCollection) {
			i.saveTheWorld();
			
		}
		
		
		myFlyables.add((Flyable) superMan);
		myFlyables.add((Flyable) birdMan);
		myFlyables.add((Flyable) eagle);
		myFlyables.add((Flyable) parrot);
		
		for (Flyable i : myFlyables) {
			i.fly();
		}
	}
}
