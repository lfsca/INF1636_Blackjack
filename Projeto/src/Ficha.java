class Ficha {
    
    private int valor_ficha;
    private int qntd;
    
    public Ficha(int valor, int quantidade) {
        this.valor_ficha = valor;
        this.qntd = quantidade;
    }
    
    public int getValorFicha() {
        return valor_ficha * qntd;
    }
    
    public void sumFicha(int n) {
        qntd += n;  
    }
    
    public void subFicha(int n) {
        qntd -= n;  
    }
    
}
