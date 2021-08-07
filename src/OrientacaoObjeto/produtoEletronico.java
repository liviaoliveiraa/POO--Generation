package OrientacaoObjeto;

	//Crie uma classe produto eletrônico e apresente os atributos e métodos referentes esta classe, em seguida crie um objeto produto eletrônico, defina as instancias deste objeto e apresente as informações deste objeto no console.

public class produtoEletronico {
	
	String produto;
	String marca;
	String entrega;
	Double valor;
	
	void adicionar() {
		System.out.println("Você deseja adicionar algo no carrinho? S/N");
	}
	
	void encerrarCompra() {
		System.out.println("Compra finalizada");
	}

}
