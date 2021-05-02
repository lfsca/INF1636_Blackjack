package test;

import org.junit.*;
import static org.junit.Asserts.*;

import model.Card.*;


public class CardTest {

	public void test() {
		
		Card carta_teste = new Card;
		carta_teste = Card(Valor.Dois,Naipe.Paus);
		Valor a = getValor(carta_teste);
		assertEquals(Valor.Dois,a);
		

	}

}