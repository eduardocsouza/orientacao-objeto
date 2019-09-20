package aplication;

import java.util.Locale;
import java.util.Scanner;

import entites.Product;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		char c;
		do {
			System.out.println("informe os produtos em stoques:");
			String name = sc.next();
			double price = sc.nextDouble();
			int quantity = sc.nextInt();
			Product prod = new Product(name, price, quantity);
				
			
			System.out.println("Product Data: " + prod);
			System.out.println("-------------------------------------");
	
			System.out.println("Updata stock:");
			quantity = sc.nextInt();
			prod.addProuct(quantity);
			System.out.println("Product Data: " + prod);
			
			System.out.println("--------------------------------------");
			
			System.out.println("Remover quantity:");
			quantity = sc.nextInt();
			prod.removeProducts(quantity);
			System.out.println("Product Data: " + prod);
			System.out.println();
			
			System.out.print("Pretendi adicionar mais item? S/N:");
			c = sc.next().charAt(0);
		} while(c != 'n');
			
		sc.close();
	}
}
