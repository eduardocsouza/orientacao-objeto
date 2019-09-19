package entites;

public class Retangulo {

	public double width;
	public double height;
	
	
	public double area() {
		double result = width * height;
		return result;
	}
	
	public double perimetro() {
		double result = 2*(width + height);
		return result;
	}
	
	public double diagonal() {
		double result = Math.pow(width, 2) + Math.pow(height, 2);
		return Math.sqrt(result);
	}
}
