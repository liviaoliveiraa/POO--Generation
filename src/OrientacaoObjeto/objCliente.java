package OrientacaoObjeto;

public class objCliente {

	public static void main(String[] args) {
		
		cliente cliente1 = new cliente();
		
		cliente1.nome = "Lívia";
		cliente1.idade = "27";
		cliente1.sexo = "F";
		
		System.out.println("O nome do cliente é: " + cliente1.nome);
		System.out.println("A idade do cliente é: " + cliente1.sexo);
		System.out.println("O sexo do cliente é: " + cliente1.sexo);
		
		cliente1.comprar();
		cliente1.passear();
	}

}
