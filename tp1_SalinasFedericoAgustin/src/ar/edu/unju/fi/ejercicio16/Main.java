package ar.edu.unju.fi.ejercicio16;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		String[] arregloNombre = new String[5];

		Scanner teclado = new Scanner(System.in);
		for (int i = 0; i < arregloNombre.length; i++) {
			System.out.print("Ingrese nombre de la persona en la posición " + i + ": ");
			arregloNombre[i] = teclado.next();
		}

		System.out.println("");
		int j = 0;
		while (j < arregloNombre.length) {
			System.out.println(arregloNombre[j]);
			j++;
		}

		System.out.println("TAMAÑO DEL ARREGLO: " + arregloNombre.length);

		System.out.println("");
		byte indiceEliminar;
		do {
			System.out.print("Ingrese el indice a eliminar: ");
			indiceEliminar = teclado.nextByte();
			arregloNombre[indiceEliminar] = "";
		} while (indiceEliminar < 0 || indiceEliminar > 4);

		for (int k = 0; k < arregloNombre.length - 1; k++) {
			if (arregloNombre[k].equals("")) {
				arregloNombre[k] = arregloNombre[k + 1];
				arregloNombre[k + 1] = "";
			}
		}

		j = 0;
		while (j < arregloNombre.length) {
			System.out.println(arregloNombre[j]);
			j++;
		}
		teclado.close();

	}

}
