package Pattern;

public class Hours_employee extends Employee {
	
	private double hours_worked_amount; 
	private double hour_value; 
	
	public Hours_employee(String name, String cpf) {
		super(name, cpf); 
	}
	
	public Hours_employee(String name, String cpf, double hours_amount, double hours_value) {
		super(name, cpf); 
		this.setHours_worked_amount(hours_worked_amount);
		this.setHour_value(hour_value);
		
	}
	
	public double calculate_month_salary() {
		return this.getFixed_salary() + 
		(this.getHours_worked_amount() * this.getHour_value()); 	
		
		}

	public String imprintData() {
		return super.imprintData() + "\n" 
		+ "Hours's amount worked: " + this.getHours_worked_amount() + "\n"
		+ "Hour's value: " + this.getHour_value(); 
	}


	public double getHours_worked_amount() {
		return hours_worked_amount;
	}

	public void setHours_worked_amount(double hours_worked_amount) {
		this.hours_worked_amount = hours_worked_amount;
	}

	public double getHour_value() {
		return hour_value;
	}

	public void setHour_value(double hour_value) {
		this.hour_value = hour_value;
	}
}
