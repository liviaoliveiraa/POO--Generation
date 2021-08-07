package OrientacaoObjeto;

public class objProdutoEletronico {

	public static void main(String[] args) {
		
		produtoEletronico produto1 = new produtoEletronico();
		produtoEletronico produto2 = new produtoEletronico();
		
		produto1.produto = "Fogão";
		produto1.marca = "Electrolux";
		produto1.entrega = "6 dias úteis";
		produto1.valor = 999.00;
		
		produto2.produto = "Geladeira";
		produto2.marca = "Brastemp";
		produto2.entrega = "10 dias úteis";
		produto2.valor = 1499.99;
		
		System.out.println("Temos os seguintes produtos aqui, na Lívia EletroEletrônicos:");
		System.out.println(produto1.produto);
		System.out.println(produto1.marca);
		System.out.println(produto1.entrega);
		System.out.println(produto1.valor);
		System.out.println("");
		System.out.println(produto2.produto);
		System.out.println(produto2.marca);
		System.out.println(produto2.entrega);
		System.out.println(produto2.valor);
		System.out.println("");
		void

	}

}
