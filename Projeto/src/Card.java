public class Card {

		private Valor valor_carta;
	    private Naipe naipe;
	    private boolean carta_desvirada = true;
	    
	    
	    public Card(Valor valor_carta, Naipe naipe){
	        this.naipe = naipe;
	        this.valor_carta = valor_carta;
	    }
	    
	    //Descobre o valor da carta.
	    public Valor getValor(){
	        return valor_carta;
	    }
	    
	    //Descobre o naipe da carta.
	    public Naipe getNaipe(){
	        return naipe;
	    }
	    
	    //Descobre a se a face da carta está virada ou desvirada.
	    public boolean getFace(){
	        return carta_desvirada;
	    }
	    
	    //Vira a carta.
	    public void vira(){
	        carta_desvirada = !carta_desvirada;
	    }
	    
	    //Checa se uma carta é igual a outra.
	    public boolean equals(Card c){
	        if (this.naipe == c.naipe && this.valor_carta == c.valor_carta){
	            return true;
	        }
	        return false;
	    }
}
