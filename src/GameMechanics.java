import java.util.*;

public class GameMechanics {
	
	static String name;
	static Scanner user = new Scanner(System.in);
	static int counter=1;
	static double whtotal=0;
	static boolean keepPlaying=true;
	static int dealerFirstCard;
	static int dealerSecondCard;
	static int money;
	static int bet;
	

	public static void StartGame() {
		
		System.out.println("Welcome to Trailer Park Boys Blackjack");
		System.out.println("What is your name?");
		name = user.next();
		if (name.equalsIgnoreCase("saunders")) {
			System.out.println("Frig off Saunders.");
			System.exit(0);
		} 
		else if (name.equalsIgnoreCase("will")) {
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
		System.out.println("How much money are you starting with?");
		money=user.nextInt();
	
	}
	public static void PlayBlackJack()
	{
		int userTotal=0;
		System.out.println("How much are you willing to zing?");
		bet=user.nextInt();
		if (bet > money )
		{
			System.out.println("You can't zing that much.");
		}
		else if (bet == money)
		{
			System.out.println("You're fucking tweaking.");
		}
		else 
		{
			money-=bet;
		System.out.println("You bet " + bet + " dollars and your total money now is " + money);	
		}
		System.out.println("The dealer burns the first card of the deck.");
		System.out.println("You are delt the " + Deck.deck.get(counter).getName() + " and the " + Deck.deck.get(counter+1).getName());
		userTotal=Deck.deck.get(counter).getValue() + Deck.deck.get(counter+1).getValue();
		whtotal=Deck.deck.get(counter).getWHvalue() + Deck.deck.get(counter+1).getWHvalue();
		System.out.println(GameMechanics.whtotal);
		counter=counter+2;
		dealerFirstCard=counter;
		counter++;
		dealerSecondCard=counter;
		System.out.println("The dealer is showing the " + Deck.deck.get(counter).getName());
	
		
		
		
		System.out.println(name + " your total is " + userTotal);
		while(userTotal<21)
		{
			System.out.println("Would you like to 1) Hit or 2) Stay?");
			int choice=user.nextInt();
			if(choice==1)
			{
				userTotal=userTotal + Deck.deck.get(counter).getValue();
				whtotal+=Deck.deck.get(counter).getWHvalue();
				System.out.println(GameMechanics.whtotal);
				if(userTotal<=21)
				{
				System.out.println("You get the " +  Deck.deck.get(counter).getName());
				System.out.println(name + " your new total is " + userTotal);
				
				}
				else
				{
					System.out.println("You get the " +  Deck.deck.get(counter).getName());
					System.out.println(name + " your new total is " + userTotal);
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
		Dealer.deal();
		System.out.println("Would you like to continue playing 1) Yes 2) No?");
		int choice=user.nextInt(); 
		if(choice==1)
		{
			
		}     
		else
		{
			System.out.println("Jim Lahey is a fucking drunk and he always will be");
			keepPlaying=false;
		}
		
	}

}
