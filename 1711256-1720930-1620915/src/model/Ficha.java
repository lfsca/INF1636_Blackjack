package model;

class Ficha {
	
	private int valor_ficha;
	private int qntd;
	
	public Ficha(int valor, int quantidade) {
		this.valor_ficha = valor;
		this.qntd = quantidade;
	}
	
	public int getTotal() {
		return valor_ficha * qntd;
	}
	
	public int getValorFicha() {
		return valor_ficha;
	}
	
	public int getQuantidade() {
		return qntd;
	}
	
	public void sumFicha(int n) {
		qntd += n;  
	}
	
	public boolean subFicha(int n) {
		if (qntd - n < 0) {
			System.out.println("Fichas Insuficientes");
			return false;
		}
		else {
			qntd -= n;
			return true;
		}
	}
	
	public void resetFicha() {
		qntd = 0;
	}
	

}
