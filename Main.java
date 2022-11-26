package Pattern;

public class Main {

	public static void main(String[] args) {
		Person pes = new Person("Maria Carolina de Jesus", "123.456.789-12");
		System.out.println(pes.imprintData());
		
		Employee emp = new Employee("Joana D'arc", "012.345.678-90", 29, 3000, 5050);
		System.out.println(emp.imprintDataWithMonthSalary());
		
		Hours_employee it = new Hours_employee("Simone Beuavoir", "444.111.222-33", 
				220, 60);
		
		System.out.println(it.imprintDataWithMonthSalary());
		
		
	}

}
