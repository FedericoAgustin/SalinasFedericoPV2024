package ar.edu.unju.fi.ejercicio8.main;

import java.util.Scanner;
import ar.edu.unju.fi.ejercicio8.model.CalculadoraEspecial;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numero;
		CalculadoraEspecial calculadora = new CalculadoraEspecial();
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingrese número:");
		numero = teclado.nextInt();
		calculadora.setN(numero);
		teclado.close();
		calculadora.calcularSumatoria();
		calculadora.calcularProductoria();
	}

}
