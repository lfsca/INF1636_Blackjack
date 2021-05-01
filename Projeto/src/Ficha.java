public class Ficha {
	
	private int valor_ficha;
	
	public Ficha(int valor) {
		this.valor_ficha = valor;
	}
	
	public int getValorFicha() {
		return valor_ficha;
	}
	
	public void sumFicha(int n) {
		valor_ficha += n;  
	}
	
	public void subFicha(int n) {
		valor_ficha -= n;  
	}
	
}
