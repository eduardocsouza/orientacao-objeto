package aplication;

import java.util.Locale;
import java.util.Scanner;

import entites.Funcionario;

public class FuncionarioEx {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		

		Funcionario funcionario = new Funcionario();
		System.out.print("Nome: ");
		funcionario.name = sc.nextLine();
		System.out.print("Gross salary: ");
		funcionario.grossSalary = sc.nextDouble();
		System.out.print("Tax: ");
		funcionario.tax = sc.nextDouble();
		System.out.println("Employee: " + funcionario);
		
		System.out.print("Wich percentage to increase salary? ");
		double por = sc.nextDouble();
		funcionario.increaseSalary(por);
		System.out.println();
		System.out.println("Update data: " + funcionario);
		
		sc.close();
	}
}
