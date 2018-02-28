public class Pessoa {

	String nome;
	Double peso;
	String genero;
	
	void andar () {
		System.out.println("Andando");
	}
	
	String falar () {
		return "blablabla";
	}
}

*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*
public class Main {

	public static void main(String[] args) {
		
		Pessoa pMenino;
		Pessoa pMenina;
		
		pMenino = new Pessoa ();
		pMenino.genero = "masculino";
		pMenino.nome   = "Daniel";
		pMenino.peso   = 75d;
		
		pMenina = new Pessoa ();
		pMenina.genero = "feminino";
		pMenina.nome   = "Fernanda";
		pMenina.peso   = 68d;
		
		pMenina.andar();
		pMenino.andar();

		pMenina.falar();
		pMenino.falar();
		
		System.out.println(pMenino.falar());
	}

}
