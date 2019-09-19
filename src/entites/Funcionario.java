package entites;

public class Funcionario {

	public String name;
	public double grossSalary;
	public double tax;
	
	public double netSalary() {
		return grossSalary - tax;
	}
	
	public void increaseSalary(double porcentage) {
		this.grossSalary += (grossSalary * porcentage) / 100;
	}
	
	@Override
	public String toString() {
		return  name + ", $ " + String.format("%.2f", netSalary());
	}
}
