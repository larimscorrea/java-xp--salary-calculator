package Pattern;

public class IMC {
	public double height; 
	public double weight; 
	
	public IMC (double height, double weight) {
		this.height = height; 
		this.weight = weight; 
	}
	
	public double calculateIMC() {
		return this.weight / (this.height * this.height);
	}
	public String verifyClassification() {
		if (this.calculateIMC() < 18.5)
			return "Abaixo do devido";
		else if(this.calculateIMC() >= 18.5 && this.calculateIMC() <= 24.9) 
			return "Peso normal";
		else if(this.calculateIMC() >= 25 && this.calculateIMC() <= 29.9) 
			return "Sobrepeso";
		else if(this.calculateIMC() >= 30 && this.calculateIMC() <= 34.9) 
			return "Obesidade Grau I";
			else if(this.calculateIMC() >= 35 && this.calculateIMC() <= 40)
				return "Obesidade Grau II";
			else 
				return "Obesidade Grau III"; 
		
	}
}
