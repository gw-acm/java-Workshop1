package Zoo;

public class Lion extends Animal{

	public Lion(String noise, String move, String species) {
		super(noise, move, species);
		
	}
	
	public void hunts(String animal){
		System.out.println(animalName+" hunts "+animal);
	}
	
	public void sleeps()
	{
		System.out.println(animalName+ " sleeps under the tree.");
	}
	
	
}
