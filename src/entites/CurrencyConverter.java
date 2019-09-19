package entites;

public class CurrencyConverter {
	
	public static double IOF = 0.06;

	public static double convert(double valor, double valor2) {
		double soma = valor * valor2;
		soma += soma * IOF;
		return soma;
	}
}
