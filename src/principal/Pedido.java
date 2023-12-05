package principal;

public class  Pedido {
	String produto;
	int quantidade;
	double valor;
	
	public Pedido(String produto, int quantidade, double valor) {
        this.produto = produto;
        this.quantidade = quantidade;
        this.valor = valor;
    }
	
	//método calcular valor do pedido

public double calcularValorTotal() {
	        return quantidade * valor;
	    }
}