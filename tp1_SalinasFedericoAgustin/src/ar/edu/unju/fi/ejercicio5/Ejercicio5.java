package ar.edu.unju.fi.ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {

		int numero_a_multiplicar;
		int resultado;

		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingrese número a multiplicar");
		numero_a_multiplicar = teclado.nextInt();
		teclado.close();

		for (int j = 0; j <= 10; j++) {
			resultado = numero_a_multiplicar * j;
			System.out.println(numero_a_multiplicar + "*" + j + "=" + resultado);
		}

	}

}
