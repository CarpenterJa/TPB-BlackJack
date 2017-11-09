import java.util.*;

public class Dealer {
	static int dealerTotal=0;

	public static void deal()
	{
		System.out.println("The dealers second card is the " + Deck.deck.get(GameMechanics.dealerFirstCard).getName());
		dealerTotal+=Deck.deck.get(GameMechanics.dealerFirstCard).getValue() + Deck.deck.get(GameMechanics.dealerSecondCard).getValue();
		System.out.println("The dealer is delt a total of " + dealerTotal);
		while(dealerTotal<17)
		{
			
			System.out.println("The dealer hits and gets the " + Deck.deck.get(GameMechanics.counter).getName());
			dealerTotal+=Deck.deck.get(GameMechanics.counter).getValue();
			if(dealerTotal>21)
			{
				System.out.println("The dealer busts!");
				System.out.println("The dealer decides to stay with a total of " + dealerTotal);
				break;
			}
			else if(dealerTotal>16)
			{
				System.out.println("The dealer decides to stay with a total of " + dealerTotal);
				break;
			}
			else
			{
				
			}
			GameMechanics.counter++;
		}
	}

}
