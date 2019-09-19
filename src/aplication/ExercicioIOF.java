package aplication;

import java.util.Locale;
import java.util.Scanner;

import entites.CurrencyConverter;

public class ExercicioIOF {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("What is the dollar price? ");
		double price = sc.nextDouble();
		System.out.print("How many dollars will be bought? ");
		double dollar = sc.nextDouble();
		System.out.print("Amount to be paid in reais = " + CurrencyConverter.convert(dollar, price));
		sc.close();
	}
}
