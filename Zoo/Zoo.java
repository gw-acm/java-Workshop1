package Zoo;

import java.util.ArrayList;

public class Zoo {

	static ArrayList<Animal> zooAnimals = new ArrayList<Animal>();

	private Zoo()
	{

	}

	public static void addAnimal(Animal newAddition)
	{
		zooAnimals.add(newAddition);
	}

	public static void tourZoo()
	{
		int counter =0;

		for(int i = 0; i<zooAnimals.size(); i++)
		{
			if(counter%2==0)
			{
				System.out.println("On the right is a "+ zooAnimals.get(i).animalName);
				zooAnimals.get(i).makeNoise();
				counter++;
			}
			else {
				System.out.println("On the left is  a "+zooAnimals.get(i).animalName);
				zooAnimals.get(i).move();
				counter++;
			}
		}
	}






}
