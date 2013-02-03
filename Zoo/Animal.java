package Zoo;

public class Animal {
	
	String animalNoise="";
	public String animalMovement="";
	public String animalName="";
	
	
	public Animal(String noise, String move, String species){
		
		animalNoise=noise;
		animalMovement=move;
		animalName=species;
		
		
	}
	
	public void makeNoise(){
		System.out.println(animalName+" "+animalNoise);
	}
	
	public void move()	{
		System.out.println(animalName+" "+animalMovement);
	}
	
	public void feed(String food){
		System.out.println(animalName+" eats "+food);
	}
	
}
