package OrientacaoObjeto;

//Crie uma classe avi�o e apresente os atributos e m�todos referentes esta classe, em seguida crie um objeto avi�o, defina as instancias deste objeto e apresente as informa��es deste objeto no console.

public class aviao {
	
	private String companhia;
	private int capacidade;
	private String modelo;
	private Double capacidadeTanque;
	
	public void setCompanhia(String comp) {
		this.companhia = comp;
	}
	public String getCompanhia() {
		return companhia;
	}

	public void setCapacidade(int capac) {
		this.capacidade = capac;
	}
	public int getCapacidade() {
		return capacidade;
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getModelo() {
		return modelo;
	}
	
	public void setcapacidadeTanque(double capacTanq) {
		this.capacidadeTanque = capacTanq;
	}
	
	public double getcapacidadeTanque() {
		return capacidadeTanque;
	}
	

}
