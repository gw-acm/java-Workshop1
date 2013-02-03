import java.util.Scanner;


public class InputOput {


	public static void main(String[] args)
	{
		int x=0;
		Scanner in = new Scanner(System.in);

		
		boolean test =false;
		while(!test)
		{
			try{
				System.out.println("Enter an integer:");
				x = in.nextInt();
				in.nextLine();
				test=true;
			}catch(Exception e)
			{
				System.out.println("Invalid input!");
				in.nextLine();
				test=false;

			}
		}
		
		System.out.println("Enter a string");
		String y =in.nextLine();

		System.out.println("x is equal to: "+x);
		System.out.println("y is equal to: "+y);



	}


}
