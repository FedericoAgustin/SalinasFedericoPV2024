package ar.edu.unju.fi.ejercicio13;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int[] enteros = new int[8];
		int numero;
		Scanner teclado = new Scanner(System.in);
		for (int i = 0; i < enteros.length; i++) {
			System.out.println("Ingrese valor a almacenar");
			numero = teclado.nextInt();
			enteros[i] = numero;
		}
		for (int i = 0; i < enteros.length; i++) {
			System.out.println("Valores almacenados en la posición " + i + " = " + enteros[i]);
		}
		teclado.close();
	}

}
