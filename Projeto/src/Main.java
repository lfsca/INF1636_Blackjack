
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Card c = new Card(Valor.A, Naipe.Espadas);
		Valor a = c.getValor();
		Naipe b = c.getNaipe();
		boolean vira = c.getFace();
		System.out.println(vira);
		c.vira();
		vira = c.getFace();
		System.out.println(vira);
		
		Deck d = new Deck();
		d.CriaDeck();
		//d.shuffle();
		Card cards[] = d.getDeck();
		Card carta1 = d.compraCarta();
		Card carta2 = d.compraCarta();
		System.out.println(carta1.getValor());
		System.out.println(carta2.getValor());
		
		/*
		for (int j = 0; j<208;j++) {
			System.out.println(cards[j].getValor() + " de " + cards[j].getNaipe());
		}
		*/
		
		
		
				
		
	}

}
