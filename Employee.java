package Pattern;

public class Employee extends Person {
	
	private int registration; 
	private double fixed_salary; 
	private double days_worked; 
	
	public Employee(String name, String CPF) {
		super(name, CPF);
	}
	
	public Employee(String name, String CPF, double days_worked, double fixed_salary, int registration) {
		super(name, CPF);
		this.setDays_worked(days_worked);
		this.setFixed_salary(fixed_salary);
		this.setRegistration(registration);
	}

	public int getRegistration() {
		return registration;
	}

	public void setRegistration(int registration) {
		this.registration = registration;
	}

	public double getFixed_salary() {
		return fixed_salary;
	}

	public void setFixed_salary(double fixed_salary) {
		this.fixed_salary = fixed_salary;
	}

	public double getDays_worked() {
		return days_worked;
	}

	public void setDays_worked(double days_worked) {
		this.days_worked = days_worked;
	}
	
	public double calculate_salary_month() {
		return(this.getFixed_salary()/30) * this.getDays_worked(); 
	}
	
	public String imprintData() {
		return super.imprintData() + 
				"Registration: " + this.getRegistration() + "\n" 
				+ "Fixed salary: " + this.getFixed_salary()+ "\n"
				+ "Days worked: " + this.getDays_worked(); 
		}
	
	public String imprintDataWithMonthSalary() {
		return this.imprintData() + "\n" +
	"Month salary: " + this.calculate_salary_month(); 
	}
}
