package OrientacaoObjeto;

	//Crie uma classe produto eletr�nico e apresente os atributos e m�todos referentes esta classe, em seguida crie um objeto produto eletr�nico, defina as instancias deste objeto e apresente as informa��es deste objeto no console.

public class produtoEletronico {
	
	String produto;
	String marca;
	String entrega;
	Double valor;
	
	void adicionar() {
		System.out.println("Voc� deseja adicionar algo no carrinho? S/N");
	}
	
	void encerrarCompra() {
		System.out.println("Compra finalizada");
	}

}
