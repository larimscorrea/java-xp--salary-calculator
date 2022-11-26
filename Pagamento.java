package FP;

public class Pagamento {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ResumoFolha resumo = new ResumoFolha(); 
		
		Horista emp = new Horista("Joaquim Borges", "123.456.789-01", 0, 40, 220); 
		emp.setValorBeneficios(800);
		emp.setValorPrevidencia(450);
		resumo.addEmpregado(emp);
		
		emp = new Horista("Ana Gotardo", "222.333.444-55", 1500, 37, 220); 
		emp.setValorBeneficios(800);
		emp.setValorPrevidencia(470);
		resumo.addEmpregado(emp);
		
		Comissionado emp2 = new Comissionado("Alex Silva", "111.222.333-45", 0, 85000, 0.04); 
		emp.setValorBeneficios(800);
		emp.setValorPrevidencia(500);
		resumo.addEmpregado(emp2);
		
		emp2 = new Comissionado("Paulo Gouveia", "098.765.432-12", 0, 190000, 0.037); 
		emp.setValorBeneficios(800);
		emp.setValorPrevidencia(500);
		resumo.addEmpregado(emp2);
		
		System.out.println(resumo.imprimirResumo()); 
	}

}
