
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Card c = new Card(Valor.Ás, Naipe.Espadas);
		Valor a = c.getValor();
		Naipe b = c.getNaipe();
		boolean vira = c.getFace();
		System.out.println(vira);
		c.vira();
		vira = c.getFace();
		System.out.println(vira);
		
		Deck d = new Deck();
		d.CriaDeck();
		d.shuffle();
		Card carta1 = d.compraCarta();
		Card carta2 = d.compraCarta();
		System.out.println(carta1.getValor() + " de " + carta1.getNaipe());
		System.out.println(carta2.getValor() + " de " + carta2.getNaipe());
		
		int k = carta1.getValorInt();
		int j = carta2.getValorInt();
		
		System.out.println(k);
		System.out.println(j);
		
		Jogador j1 = new Jogador("Pedro");
		j1.getProfit(1, 100);
		int n = j1.getPote();
		System.out.println(n);
		
		/*Ficha f = new Ficha(500);
		int l = f.getValorFicha();
		System.out.println(l);
		f.sumFicha(50);
		l = f.getValorFicha();
		System.out.println(l);
		f.subFicha(50);
		l = f.getValorFicha();
		System.out.println(l);
		
		for (int j = 0; j<208;j++) {
			System.out.println(d.getValor() + " de " + cards[j].getNaipe());
		}
		*/
		
		
		
				
		
	}

}
