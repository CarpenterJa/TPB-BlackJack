import java.util.*;

public class GameMechanics {
	
	static String name;
	static Scanner user = new Scanner(System.in);
	static int counter=0;

	public static void StartGame() {
		
		System.out.println("Welcome to Trailer Park Boys Blackjack");
		System.out.println("What is your name?");
		name = user.next();
		if (name.equalsIgnoreCase("saunders")) {
			System.out.println("Frig off Saunders.");
			System.exit(0);
		} else if (name.equalsIgnoreCase("will")) {
			System.out.println("Frig off Will.");
			System.exit(0);
		}
		else if (name.equalsIgnoreCase("jimmy")) {
			System.out.println("Greasy.");
		}
		else if (name.equalsIgnoreCase("sean")) {
			System.out.println("Greasy.");
		}
		else
		{
			System.out.println("Welcome to SunnyVale Trailer Park " + name);
		}
	
	}
	public static void PlayBlackJack()
	{
		int userTotal=0;
		System.out.println("You are delt a " + Deck.deck.get(counter).getName() + " and a " + Deck.deck.get(counter+1).getName());
		userTotal=Deck.deck.get(counter).getValue() + Deck.deck.get(counter+1).getValue();
		counter=counter+2;
		System.out.println(name + " your total is " + userTotal);
		while(userTotal<21)
		{
			System.out.println("Would you like to 1) Hit or 2) Stay?");
			int choice=user.nextInt();
			if(choice==1)
			{
				userTotal=userTotal + Deck.deck.get(counter).getValue();
				if(userTotal<21)
				{
				System.out.println("You get a " +  Deck.deck.get(counter).getName());
				System.out.println(name + " your new total is " + userTotal);
				
				}
				else
				{
					System.out.println("You busted! Polmegranite Cocks");
				}
				counter++;
			}
			else if(choice==2)
			{
				break;
			}
			else
			{
				System.out.println("Thats not an option you mofq");
				System.exit(0);
			}
		}
		System.out.println("You finished with a total of " + userTotal);
	}

}
