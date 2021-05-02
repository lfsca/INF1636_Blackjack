package model;

class Card {

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
	    
	    //Valor da carta ap�s o switch.
	    int val; 
	    
	    
	    //M�todo para descobrir o valor inteiro da carta.
	    public int getValorInt() {
	    	switch(valor_carta){
	    	//Colocar a condicional que faz com que o A seja 11 ao inv�s de 1.
	    	case As:val = 11;break;
	    	case Dois:val = 2; break;
	    	case Tres:val = 3; break;
	    	case Quatro:val = 4; break;
	    	case Cinco:val = 5; break;
	    	case Seis:val = 6; break;
	    	case Sete:val = 7; break;
	    	case Oito:val = 8; break;
	    	case Nove:val = 9; break;
	    	case Dez:
	    	case Valete:
	    	case Dama:
	    	case Rei:
	    		val = 10;
	    		break;
			default:
				System.out.println("Erro no switch.\n");
				break;
	    	}
	    	return val;
	    	
	    }

	    
	    //Descobre o naipe da carta.
	    public Naipe getNaipe(){
	        return naipe;
	    }
	    
	    //Descobre a se a face da carta est� virada ou desvirada.
	    public boolean getFace(){
	        return carta_desvirada;
	    }
	    
	    //Vira a carta.
	    public void vira(){
	        carta_desvirada = !carta_desvirada;
	    }
	    
	    //Checa se uma carta � igual a outra.
	    public boolean equals(Card c){
	        if (this.naipe == c.naipe && this.valor_carta == c.valor_carta){
	            return true;
	        }
	        return false;
	    }
	    
	    public boolean equals_valor(Card c){
	        if (this.valor_carta == c.valor_carta){
	            return true;
	        }
	        return false;
	    }
	    

	    public boolean checkAce() {
            if (valor_carta == Valor.As) {
                return true;
            }
            return false;
        }	
}
