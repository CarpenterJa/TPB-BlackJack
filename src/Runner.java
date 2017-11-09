
public class Runner {

	public static void main(String[] args) {
		Deck.addDeck();
		Deck.Shuffle();
		GameMechanics.StartGame();
		while(GameMechanics.keepPlaying==true)
		{
		GameMechanics.PlayBlackJack();
		}

	}

}
