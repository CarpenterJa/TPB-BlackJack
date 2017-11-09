
public class Agent {
	double wank;
	double crank;
	double jank;
	int numTraining;
	Dealer dealer;
	HashMap<Pair, Double> qvalues;
	
	public Agent(int numDecks, double w, double c, double j, int numTraining) {
		this.wank=w;
		this.crank=c;
		this.jank=j;
		this.numTraining=numTraining;
		this.dealer=new Dealer(numDecks, true);
		this.qvalues=new HashMap<Pair,Double>();
	}
	
}
