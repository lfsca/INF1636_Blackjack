
public class Dealer {
	private Card mao[];
	private int soma;
	private boolean blackJack;
	
	public Dealer() {
		this.mao = new Card[2];
		this.soma = 0;
		this.blackJack = false;
	}
	
	public int getSumHand() {
		return soma;
	}
	
	public boolean getBlackjack() {
		return blackJack;
	}
	
	public Card giveCard(Deck baralho) {
		Card c = baralho.compraCarta();
		return c;
	}
	
	public void giveHand(Card c[]) {
		mao = c;
		for (int i=0;i<mao.length;i++) {
			soma += mao[i].getValorInt();
		}
	}
	
	public void giveFirstHands(Deck baralho, Jogador [] jogadores) {
		Card hand[] = new Card[2];
		for (int i = 0; i< jogadores.length ; i++) {
			hand[0] = baralho.compraCarta();
			hand[1] = baralho.compraCarta();
			jogadores[i].giveHand(hand);
		}
		hand[0] = baralho.compraCarta();
		hand[1] = baralho.compraCarta();
		hand[1].vira();
		this.giveHand(hand);
	}
}
