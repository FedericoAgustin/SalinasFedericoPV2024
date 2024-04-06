package ar.edu.unju.fi.ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero1;
		int numero2;
		int numero3;
		int numero4;
		int numero5;
		float promedio;
		Scanner teclado = new Scanner(System.in);
		System.out.print("Ingrese número 1: ");
		numero1 = teclado.nextInt();
		System.out.print("Ingrese número 2: ");
		numero2 = teclado.nextInt();
		System.out.print("Ingrese número 3: ");
		numero3 = teclado.nextInt();
		System.out.print("Ingrese número 4: ");
		numero4 = teclado.nextInt();
		System.out.print("Ingrese número 5: ");
		numero5 = teclado.nextInt();

		promedio = (float) (numero1 + numero2 + numero3 + numero4 + numero5) / 5;
		System.out.println("Valor promediado: " + promedio);

		teclado.close();
	}

}
