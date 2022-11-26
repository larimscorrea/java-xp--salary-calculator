package Pattern;

public class Person {
	private String name;
	private String CPF;
	
	public Person (String name, String CPF) {
		this.name = name; 
		this.CPF = CPF; 
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCPF() {
		return CPF;
	}
	public void setCPF(String cPF) {
		CPF = cPF;
	}
	
	public String imprintData() {
		return "Name: "+ this.getName() + "\n"
+ "CPF: " + this.getCPF() + "\n";	}
}
