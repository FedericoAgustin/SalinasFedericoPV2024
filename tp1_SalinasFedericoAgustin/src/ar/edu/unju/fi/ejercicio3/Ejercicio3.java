package ar.edu.unju.fi.ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {

		int numero;
		int resto;

		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingrese un número");
		numero = teclado.nextInt();
		teclado.close();

		resto = numero % 2;

		System.out.println(resto);
		if (resto == 0) {
			System.out.println(numero + " es par");
			System.out.println("El triple de " + numero + " es: " + numero * 3);
		} else {
			System.out.println(numero + " es impar");
			System.out.println("El doble de " + numero + " es: " + numero * 2);
		}

	}

}
