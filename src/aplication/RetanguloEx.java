package aplication;

import java.util.Locale;
import java.util.Scanner;

import entites.Retangulo;

public class RetanguloEx {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Retangulo retangulo = new Retangulo();
		
		System.out.println("Entre com as medidas de um retâgulo LARGURA/ALTURA");
		retangulo.width = sc.nextDouble();
		retangulo.height = sc.nextDouble();
		double area = retangulo.area();
		System.out.printf("AREA = %.2f%n", area);
		double perimetro = retangulo.perimetro();
		System.out.printf("PERIMETRO = %.2f%n", perimetro);
		double diagonal = retangulo.diagonal();
		System.out.printf("DIAGONAL = %.2f", diagonal);
		
		sc.close();
	}

}
