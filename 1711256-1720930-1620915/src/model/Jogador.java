package model;

class Jogador {
	private Ficha pote[];
	private Ficha aposta[];
	private String nome;
	private Card mao[];
	private int soma;
	private boolean blackJack;
	
	public Jogador(String nome) {
		int valores[]= new int[]{1,5,10,20,50,100};
		int n[]= new int[]{10,8,5,5,2,2};
		this.pote = new Ficha[n.length];
		this.aposta = new Ficha[n.length];
		for(int i =0; i<6; i++) {
			this.pote[i] = new Ficha(valores[i],n[i]);
			this.aposta[i] = new Ficha(valores[i],0);
		}
		this.nome = nome;
		this.mao = new Card[2];
		this.soma = 0;
		this.blackJack = false;
	}
	
	public Ficha[] getpote() {
		return pote;
	}
	
	public Ficha[] getAposta() {
		return aposta;
	}
	
	public Card[] getHand() {
		return mao;
	}
	
	public String getNome() {
		return nome;
	}
	
	public int getSumHand() {
		return soma;
	}
	
	public boolean getBlackjack() {
		return blackJack;
	}
	
	public int getSumPote() {
		int n = 0;
		for (int i = 0; i<pote.length ; i++) {
			n += pote[i].getTotal();
		}
		return n;
	}
	
	public int getSumAposta() {
		int n = 0;
		for (int i = 0; i<aposta.length ; i++) {
			n += aposta[i].getTotal();
		}
		return n;
	}
	
	public void resetAposta() {
		for (int i = 0; i<aposta.length ; i++) {
			aposta[i].resetFicha();
		}
	}
	
	public void giveHand(Card c[]) {
		mao = c;
		for (int i=0;i<mao.length;i++) {
			soma += mao[i].getValorInt();
		}
		Card c1 = new Card(Valor.As,Naipe.Espadas);
		Card c2 = new Card(Valor.Dez,Naipe.Espadas);
		if (c[0].equals_valor(c1) && c[1].equals_valor(c2) || c[0].equals_valor(c2) && c[1].equals_valor(c1)) {
			blackJack = true;
		}
	}
	
	//Funcionalidade HIT
	public void giveCard(Card c) {
		int i;
		Card temp[] = new Card[mao.length];
		temp = mao;
		mao = new Card[mao.length + 1];
		for (i = 0; i < temp.length ; i++) {
			mao[i] = temp[i];
		}
		mao[i] = c;
		soma += c.getValorInt();
	}
	
	public void Apostar(int n, int val) {
		switch(val){
    		case 1: 
    			if(!this.checkMax(1,n)){
    				if(pote[0].subFicha(n)) {
    					aposta[0].sumFicha(n);
    				}
    			};
    			break;
    		case 5: 
    			if(!this.checkMax(5,n)){
    				if(pote[1].subFicha(n)) {
    					aposta[1].sumFicha(n);
    				}
    			};
    			break;
    		case 10:
    			if(!this.checkMax(10,n)){
    				if(pote[2].subFicha(n)) {
    					aposta[2].sumFicha(n);
    				}
    			};
    			break;
    		case 20:
    			if(!this.checkMax(20,n)){
    				if(pote[3].subFicha(n)) {
    					aposta[3].sumFicha(n);
    				}
    			};
    			break;
    		case 50: 
    			if(!this.checkMax(50,n)){
    				if(pote[4].subFicha(n)) {
    					aposta[4].sumFicha(n);
    				}
    			};
    			break;
    		case 100: 
    			if(!this.checkMax(100,n)){
    				if(pote[5].subFicha(n)) {
    					aposta[5].sumFicha(n);
    				}
    			};
    			break;
		}
		
	}
	
	public void removeAposta(int n, int val) {
		switch(val){
    		case 1: 
    			if(!this.checkMin(1,n)){
    				pote[0].sumFicha(n);
    				aposta[0].subFicha(n);
    			};
    			break;
    		case 5: 
    			if(!this.checkMin(5,n)){
    				pote[1].sumFicha(n);
    				aposta[1].subFicha(n);
    			};
    			break;
    		case 10:
    			if(!this.checkMin(10,n)){
    				pote[2].sumFicha(n);
    				aposta[2].subFicha(n);
    			};
    			break;
    		case 20:
    			if(!this.checkMin(20,n)){
    				pote[3].sumFicha(n);
    				aposta[3].subFicha(n);
    			};
    			break;
    		case 50: 
    			if(!this.checkMin(50,n)){
    				pote[4].sumFicha(n);
    				aposta[4].subFicha(n);
    			};
    			break;
    		case 100: 
    			if(!this.checkMin(100,n)){
    				pote[5].sumFicha(n);
    				aposta[5].subFicha(n);
    			};
    			break;
		}
		
	}
	
	public boolean checkMax(int val, int n) {
		int total = 0;
		for (int i = 0; i< aposta.length; i++) {
			total += aposta[i].getTotal();
		}
		total += val * n;
		System.out.println("Total");
		System.out.println(total);
		if (total > 100) {
			System.out.println("Limite maximo de $100 atingido");
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean checkMin(int val, int n) {
		int total = 0;
		for (int i = 0; i< aposta.length; i++) {
			total += aposta[i].getValorFicha();
		}
		total -= val * n;
		if (total < 20) {
			System.out.println("Limite minimo de $20");
			return true;
		}
		else {
			return false;
		}
	}
	
	
	public void receiveProfit(Ficha[] profit) {
		for (int i = 0; i < profit.length ; i++) {
			switch(profit[i].getValorFicha()){
				case 1: pote[0].sumFicha(profit[i].getQuantidade()*2);break;
				case 5: pote[1].sumFicha(profit[i].getQuantidade()*2);break;
				case 10: pote[2].sumFicha(profit[i].getQuantidade()*2);break;
				case 20: pote[3].sumFicha(profit[i].getQuantidade()*2);break;
				case 50: pote[4].sumFicha(profit[i].getQuantidade()*2);break;
				case 100: pote[5].sumFicha(profit[i].getQuantidade()*2);break;
			}
		}
	}
		
	public boolean checkSplit() {
        boolean k = false;
        for (int i=0;i<mao.length;i++) {
            Card temp = mao[i];
            for (int j=i+1; j<mao.length;j++){
                if (temp.equals_valor(mao[j])){
                    k=true;
                }
            }
        }
        return k;
    }
	
	public void regraAce() {
		if (soma > 21) {
			for (int i=0;i<mao.length;i++) {
				if (mao[i].checkAce()) {
					soma-=10;
					if (soma <= 21) {
						break;
					}
				}
			}
		}

	}

    public void calcula(int k) {
        if (k<5) {
            pote[0].sumFicha(k);
        }
        else if (k<10) {
            pote[1].sumFicha(1);
            this.calcula(k-5);
        }
        else if (k<20) {
            pote[2].sumFicha(1);
            this.calcula(k-10);
        }
        else if (k<30) {
            pote[3].sumFicha(1);
            this.calcula(k-20);
        }
        else if (k<40){
            pote[3].sumFicha(1);
            pote[2].sumFicha(1);
            this.calcula(k-30);
        }
        else if (k<50) {
            pote[3].sumFicha(2);
            this.calcula(k-40);
        }
        else if (k==50) {
            pote[3].sumFicha(2);
            pote[1].sumFicha(1);
            pote[0].sumFicha(5);
        }
    }

    public void surrender() {
           int s = this.getSumAposta()/2;
           this.calcula(s);
    }
	
}
