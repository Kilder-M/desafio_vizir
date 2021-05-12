package entidades;



public class Tarifa {
	private String origem;
	private String destino;
	private Double valor;
	
	
	
	
	public Tarifa(String origem, String destino, Double valor) {
		
		this.origem = origem;
		this.destino = destino;
		this.valor = valor;
	}
	
	
	public String getOrigem() {
		return origem;
	}
	public void setOrigem(String origem) {
		this.origem = origem;
	}
	public String getDestino() {
		return destino;
	}
	public void setDestino(String destino) {
		this.destino = destino;
	}
	public Double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}


	@Override
	public String toString() {
		return "Tarifa [origem=" + origem + ", destino=" + destino + ", valor=" + valor + "]";
	}
	
	
	
	
}
