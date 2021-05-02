package model;

class Dealer {
	private Card mao[];
	private Deck baralho;
	private int soma;
	private boolean blackJack;
	
	public Dealer() {
		this.mao = new Card[2];
		this.soma = 0;
		this.blackJack = false;
		this.baralho = new Deck();
		baralho.CriaDeck();
		baralho.shuffle();
	}
	
	public int getSumHand() {
		return soma;
	}
	
	public boolean getBlackjack() {
		return blackJack;
	}
	
	public void giveCard( Jogador j) {
		Card c = baralho.compraCarta();
		j.giveCard(c);
	}
	
	public void regraAce() {
		if (soma > 21) {
			for (int i=0;i<mao.length;i++) {
				if (mao[i].checkAce()) {
					soma-=10;
					if (soma <= 21) {
						break;
					}
				}
			}
		}

	}
	
	public void shuffleDeck() {
		baralho.shuffle();
	}
	
	public void dealCards() {
		int sum = this.getSumHand();
		int i = 0;
		while(sum<=17) {
			Card temp[] = new Card[mao.length];
			temp = mao;
			mao = new Card[mao.length + 1];
			System.out.println("mao");
			for (i = 0; i < temp.length ; i++) {
				mao[i] = temp[i];
				System.out.println(mao[i].getValorInt());
			}
			mao[i] = baralho.compraCarta();
			System.out.println(mao[i].getValorInt());
			System.out.println(" fim mao");
			soma += mao[i].getValorInt();
			this.regraAce();
			sum = soma;
		}
	}
	
	public boolean checkWin(Jogador j) {
		if(j.getBlackjack() && !blackJack) {
			return true;
		}
		else if(j.getSumHand() > soma) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public void giveHand(Card c[]) {
		mao = c;
		for (int i=0;i<mao.length;i++) {
			soma += mao[i].getValorInt();
		}
	}
	
	public void giveFirstHands( Jogador [] jogadores ) {
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
