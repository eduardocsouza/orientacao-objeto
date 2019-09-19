package semOrientacaoObject;

import java.util.Locale;
import java.util.Scanner;

import entites.Triangulo;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Triangulo x, y;
		x = new Triangulo();
		y = new Triangulo();
		
		System.out.println("Entre com as medidas de um triângulo X:");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		System.out.println("Entre com as medidas de um triângulo Y:");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();

		double areaX = x.areaTriangulo();
		double areaY = y.areaTriangulo();

		System.out.printf("Triângulo X area: %.4f%n", areaX);
		System.out.printf("Triângulo Y area: %.4f%n", areaY);

		if (areaX > areaY) {
			System.out.println("Maior area: X" );
		}else {
			System.out.println("Maior area: Y");
		}
		sc.close();
	}

}
