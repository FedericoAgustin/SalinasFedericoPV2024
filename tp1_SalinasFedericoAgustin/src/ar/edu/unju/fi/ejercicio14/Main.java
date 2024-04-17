package ar.edu.unju.fi.ejercicio14;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int elemento;
		int numero;
		int sumatoria = 0;
		System.out.println("Ingrese cantidad de elementos para almacenar del 3 al 10");
		Scanner teclado = new Scanner(System.in);
		elemento = teclado.nextInt();
		if (elemento >= 3 && elemento <= 10) {
			int[] enteros = new int[elemento];
			for (int i = 0; i < enteros.length; i++) {
				System.out.println("Ingrese valor a almacenar");
				numero = teclado.nextInt();
				enteros[i] = numero;
			}
			for (int i = 0; i < enteros.length; i++) {
				System.out.println("Valores almacenados en la posición " + i + " = " + enteros[i]);
				sumatoria += enteros[i];
			}
			System.out.println("Sumatoria " + sumatoria);
		} else
			System.out.println("Debe ingresar un numero que este dentro del rango acordado");
		teclado.close();

	}

}
