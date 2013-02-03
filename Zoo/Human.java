package Zoo;

public class Human extends Animal{

	public String works="";
	public String danceMoves="";
	public String personName="";
	
	public Human(String noise, String move, String species, String job, String dance, String name) {
		super(noise, move, name);
		works=job;
		danceMoves=dance;
		personName=name;
	}
	
	public void works()
	{
		System.out.println(personName+" is a "+works);
	}
	
	public void dance()
	{
		System.out.println(personName+" performs the "+danceMoves);
	}
	
	
	
}
