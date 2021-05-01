import java.util.Random;

public class Deck {
	public static final int num_cards = 208;
    private Card baralho[];
    private int carta_atual = 0;
    
    
    public Deck() {
    	this.baralho = new Card[num_cards];
    }
    
    public Card[] getDeck() {
    	return baralho;
    }
    
    public void CriaDeck(){
        int n = 0;
        for (int i=0; i<4; i++) {
        	for (Naipe naipe : Naipe.values()){
                for (Valor valor_carta : Valor.values()){
                    baralho[n++] = new Card(valor_carta, naipe);
                }
            }
        }        
    }
    
    //Talvez fique com a classe dealer.    
    public Card compraCarta(){
        if (carta_atual < num_cards){
           return (baralho[carta_atual++]);
        }
        else{
           System.out.println("Baralho vazio");
           return ( null );
        }
    }
    
    public void shuffle(){
        int index;
        Card temp;
        Random random = new Random();
        for (int i = baralho.length-1;i>0;i--){
            index = random.nextInt(i+1);
            temp = baralho[index];
            baralho[index] = baralho[i];
            baralho[i] = temp;
        }
    }
}
