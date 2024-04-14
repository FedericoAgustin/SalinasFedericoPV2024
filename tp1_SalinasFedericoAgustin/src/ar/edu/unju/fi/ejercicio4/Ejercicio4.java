package ar.edu.unju.fi.ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {

		int factorial = 1;
		int contador = 1;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingrese número a factorizar");
		int numero = teclado.nextInt();
		teclado.close();

		if (numero >= 0 && numero <= 10) {
			while (contador <= numero) {
				factorial = factorial * contador;
				contador = contador + 1;
			}
			System.out.println("El factorial es " + factorial);
		} else {
			System.out.println("El rango comprendido es del 1 al 10");
		}
	}

}
