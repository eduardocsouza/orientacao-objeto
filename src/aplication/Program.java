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
			Product product = new Product();
			System.out.println("informe os produtos em stoques:");
			product.name = sc.next();
			product.price = sc.nextDouble();
			product.quantity = sc.nextInt();
				
			
			System.out.println("Product Data: " + product);
			System.out.println("-------------------------------------");
	
			System.out.println("Updata stock:");
			int qtd = sc.nextInt();
			product.addProuct(qtd);
			System.out.println("Product Data: " + product);
			
			System.out.println("--------------------------------------");
			
			System.out.println("Remover quantity:");
			qtd = sc.nextInt();
			product.removeProducts(qtd);
			System.out.println("Product Data: " + product);
			System.out.println();
			
			System.out.print("Pretendi adicionar mais item? S/N:");
			c = sc.next().charAt(0);
		} while(c != 'n');
			
		sc.close();
	}
}
