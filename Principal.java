package Pattern;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pessoa pes1 = new Pessoa(3532);
		pes1.setCPF("0.123.456-89");
		pes1.setNome("Carolina Maria de Jesus");
		pes1.setAltura(1.85);
		pes1.setPeso(90); 
		System.out.println(pes1.imprimeDados());
		
		Pessoa pes2 = new Pessoa(3590, "123.456.789-91", "Marie Curie"); 
		pes2.setAltura(1.59); 
		pes2.setPeso(90); 
		System.out.println(pes2.imprimeDados());
		
		Pessoa pes3 = new Pessoa(3290, "002.100.200-30", "Joana Gonzalez", 1.75, 150);
		System.out.println(pes3.imprimeDados());
		

	}

}
