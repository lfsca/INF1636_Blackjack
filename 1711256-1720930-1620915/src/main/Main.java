package main;

import model.Dealer;
import model.Jogador

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/*System.out.println("Testes Jogador");
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
        j1.giveCard(new Card(Valor.As,Naipe.Copas));
        j1.giveCard(new Card(Valor.As,Naipe.Copas));
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
        j1.removeAposta(1, 5);
        j1.surrender();
        int n = j1.getSumPote();
        System.out.println(n);*/
		
		Dealer d = new Dealer();
		Jogador j1 = new Jogador("Pedro");
		Jogador j2 = new Jogador("Pedro");
		Jogador j3 = new Jogador("Pedro");
		Jogador j4 = new Jogador("Pedro");
		Jogador listJogadores[] = new Jogador[4];
		listJogadores[0] = j1;
		listJogadores[1] = j2;
		listJogadores[2] = j3;
		listJogadores[3] = j4;
		d.giveFirstHands(listJogadores);
		/*System.out.println(j1.getSumHand());
		System.out.println(j2.getSumHand());
		System.out.println(j3.getSumHand());
		System.out.println(j4.getSumHand());
		System.out.println(d.getSumHand());*/
		d.dealCards();
		System.out.println(d.getSumHand());
		System.out.println(d.checkWin(j1));
	}

}
