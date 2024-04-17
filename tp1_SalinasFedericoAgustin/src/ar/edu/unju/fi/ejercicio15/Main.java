package ar.edu.unju.fi.ejercicio15;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int elemento;
		String nombre;

		System.out.println("Ingrese cantidad de elementos para almacenar del 5 al 10 ");
		Scanner teclado = new Scanner(System.in);
		elemento = teclado.nextInt();
		if (elemento >= 5 && elemento <= 10) {
			String[] arreglo = new String[elemento];
			int pos = arreglo.length - 1;
			for (int i = 0; i < arreglo.length; i++) {
				System.out.println("Ingrese nombres para almacenar");
				nombre = teclado.next();
				arreglo[i] = nombre;
			}
			for (int i = 0; i < arreglo.length; i++) {
				System.out.println("Nombres almacenados desde la posición incial " + i + " = " + arreglo[i]);
			}
			System.out.println("----NOMBRES COMENZANDO DESDE LA ÚLTIMA POSICIÓN----");
			for (int i = 0; i < arreglo.length; i++) {
				System.out.println("Nombres almacenados desde la posición Final " + i + " = " + arreglo[pos]);
				pos--;
			}
		} else
			System.out.println("fuera del rango");
		teclado.close();
	}

}
