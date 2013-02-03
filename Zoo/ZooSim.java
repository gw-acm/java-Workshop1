package Zoo;

public class ZooSim {
	
	public static void main(String[] args)
	{
		Lion leo = new Lion("Rawrs", "Runs", "Lion");
		Human human1 = new Human("Yawns", "Sleeps","Human","Computer Scientist","cha cha slide","Lucas");
		Lion jeremy = new Lion("Meows","Leaps","Baby Lion");
		Animal walter = new Animal("Hisses","Slithers", "walter");
		
		
		
		Zoo.addAnimal(leo);
		Zoo.addAnimal(human1);
		Zoo.addAnimal(jeremy);
		Zoo.addAnimal(walter);
		
		//national.tourZoo();
		
		leo.feed(walter.animalName);
		human1.feed("Cheesburger");
		jeremy.feed("Steak");
		//walter.feed("Eggs");
		human1.dance();
		leo.hunts(human1.animalName);
		leo.sleeps();
		
	}
}
