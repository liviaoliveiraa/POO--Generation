package OrientacaoObjeto;

public class objAviao {

	public static void main(String[] args) {
		
		aviao aviao1 = new aviao();
		
		aviao1.setCapacidade(951);
		aviao1.setcapacidadeTanque(152.98);
		aviao1.setCompanhia("Gol");
		aviao1.setModelo("Boing 726");
		
		System.out.println("O modelo do avi�o �: " + aviao1.getModelo());
		System.out.println("A companhia da aeronave �: " + aviao1.getCompanhia());
		System.out.println("A capacidade total �: " + aviao1.getCapacidade());
		System.out.println("A capacidade do tanque � de: " + aviao1.getcapacidadeTanque() + "l");

	}

}
