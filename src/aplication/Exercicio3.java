package aplication;

import java.util.Locale;
import java.util.Scanner;

import entites.Estudante;

public class Exercicio3 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Estudante aluno = new Estudante();
		
		System.out.println("Informe nome e as notas:");
		aluno.nome = sc.nextLine();
		aluno.nota1 = sc.nextDouble();
		aluno.nota2 = sc.nextDouble();
		aluno.nota3 = sc.nextDouble();
		
		if(aluno.notaFinal() < 60.0) {
			System.out.printf("FINAL GRADE = %.2f%n", aluno.notaFinal());
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS%n", aluno.resto());
		}else {
			System.out.printf("FINAL GRADE = %.2f%n", aluno.notaFinal());
			System.out.println("PASS");
		}
		sc.close();	
	}
}
