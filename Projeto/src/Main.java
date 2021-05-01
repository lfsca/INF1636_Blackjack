public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println("Testes Jogador");
		Deck d = new Deck();
		d.CriaDeck();
		d.shuffle();
		Card c1 = d.compraCarta();
		Card c2 = d.compraCarta();
		System.out.println(c1.getValor() + " de " + c1.getNaipe());
		System.out.println(c2.getValor() + " de " + c2.getNaipe());
		Jogador j1 = new Jogador("Pedro");
		System.out.println(j1.getNome());
        
        Card mao[] = new Card[2];
        mao[0] = c1;
        mao[1] = c2;
        j1.giveHand(mao);
        j1.giveCard(new Card(Valor.Ás,Naipe.Copas));
        j1.giveCard(new Card(Valor.Ás,Naipe.Copas));
        mao = j1.getHand();
        System.out.println(mao[3].getValor() + " de " + mao[3].getNaipe());
        System.out.println(j1.checkSplit());
        j1.regraAce();
        System.out.println(j1.getSumHand());
        j1.resetAposta();
        j1.Apostar(1, 5);
        j1.Apostar(1, 50);
        j1.Apostar(1, 50);
        j1.Apostar(1, 20);
        int n = j1.getSumPote();
        System.out.println(n);
	}

}
