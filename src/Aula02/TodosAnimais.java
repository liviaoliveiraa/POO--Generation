package Aula02;

public class TodosAnimais {

	public static void main(String[] args) {
		Cachorro cao = new Cachorro();
		Cavalo cav = new Cavalo();
		Preguica preg = new Preguica();
		
		cao.nome = "Yubi";
		cao.idade = "18";
		cao.som = "late";
		cao.farejar = "Fareja";
		
		cav.nome = "Zé";
		cav.idade = "10";
		cav.som = "Relincha";
		cav.trotar = "Trota";
		
		preg.nome = "Zoraide";
		preg.idade = "20";
		preg.som = "Desconhecido";
		preg.dorme = "Dorme";
		
		System.out.println("Cachorro: " + cao.nome + "/" + cao.idade + "/" + cao.som + "/" + cao.farejar);
		System.out.println("Cavalo: " + cav.nome + "/" + cav.idade + "/" + cav.som + "/" + cav.trotar);
		System.out.println("Preguiça: " + preg.nome + "/" + preg.idade + "/" + preg.som + "/" + preg.dorme);

	}

}
