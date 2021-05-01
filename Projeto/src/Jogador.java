class Jogador {
	private Ficha pote[];
	private String nome;
	private Card mao[];
	
	public Jogador(String nome) {
		int valores[]= new int[]{1,5,10,20,50,100};
		int n[]= new int[]{10,8,5,5,2,2};
		this.pote = new Ficha[n.length];
		for(int i =0; i<6; i++) {
			this.pote[i] = new Ficha(valores[i],n[i]);
		}
		this.nome = nome;
		this.mao = new Card[2];
	}
	
	public int getPote() {
		int n = 0;
		for (int i = 0; i<pote.length ; i++) {
			n += pote[i].getValorFicha();
		}
		return n;
	}
	
	public void giveHand(Card c[]) {
		mao = c;
	}
	
	public void giveCard(Card c) {
		int i;
		Card temp[] = new Card[mao.length];
		temp = mao;
		mao = new Card[mao.length + 1];
		for (i = 0; i < temp.length ; i++) {
			mao[i] = temp[i];
		}
		mao[i] = c;
	}
	
	public Card[] getHand() {
		return mao;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void getAposta(int n, int val) {
		switch(val){
    		case 1: pote[0].subFicha(n);break;
    		case 5: pote[1].subFicha(n);break;
    		case 10: pote[2].subFicha(n);break;
    		case 20: pote[3].subFicha(n);break;
    		case 50: pote[4].subFicha(n);break;
    		case 100: pote[5].subFicha(n);break;
		}
		
	}
	
	public void getProfit(int n, int val) {
		switch(val){
			case 1: pote[0].sumFicha(n);break;
			case 5: pote[1].sumFicha(n);break;
			case 10: pote[2].sumFicha(n);break;
			case 20: pote[3].sumFicha(n);break;
			case 50: pote[4].sumFicha(n);break;
			case 100: pote[5].sumFicha(n);break;
		}
	}
		
	public boolean checkSplit() {
		boolean k = false;
		for (int i=0;i<mao.length;i++) {
			Card temp = mao[i];
			for (int j=0; j<mao.length;j++){
				if (temp.equals_valor(mao[j])){
					k=true;
				}
			}
		}
		return k;
	}
	
	public int checkSumHand() {
		int total = 0;
		for (int i=0;i<mao.length;i++) {
			total += mao[i].getValorInt();
		}
		return total;
	}
	
}
