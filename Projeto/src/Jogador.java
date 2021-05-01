
public class Jogador {
	private Ficha ficha;
	private char nome;
	private char cor;
	private Card mao[];
	
	public Jogador(Ficha f, char nome, char cor) {
		this.ficha = f;
		this.nome = nome;
		this.cor = cor;
	}
	
	public int getFicha() {
		return ficha.getValorFicha();
	}
	
	public void giveHand(Card c[]) {
		mao = c;
	}
	
	public Card[] getHand() {
		return mao;
	}
	
	public char getCor() {
		return cor;
	}
	
	public char getNome() {
		return nome;
	}
	
	public void getAposta(int n) {
		ficha.subFicha(n);
	}
	
	public void getProfit(int n) {
		ficha.sumFicha(n);
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
	
}
