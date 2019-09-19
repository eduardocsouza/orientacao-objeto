package entites;

public class Product {
	
	public String name;
	public double price;
	public int quantity;
	
	public double totalValueInStock() {
	double soma = price * quantity;
	
	return soma;
		
	}
	
	public void addProuct(int quantity) {
		this.quantity += quantity;
	}
	
	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}
	
	@Override
	public String toString() {
		return name + ", $ " 
					+ String.format("%.2f", price) 
					+ ", "
					+ quantity
					+ "units, Total: $ "
					+ totalValueInStock();
	}
	

}
