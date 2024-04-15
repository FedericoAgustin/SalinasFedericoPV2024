package ar.edu.unju.fi.ejercicio10.main;

import java.util.Scanner;

import ar.edu.unju.fi.ejercicio10.model.Pizza;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int diametroPizza;
		boolean ingredienteEspecialPizza;

		for (int i = 0; i < 3; i++) {

			System.out.println("Ingrese los datos de la pizza " + (i + 1) + ":");
			do {
				System.out.print("Ingrese Diámetro: ");
				diametroPizza = teclado.nextInt();
				if (diametroPizza != 20 && diametroPizza != 30 && diametroPizza != 40) {
					System.out.print("Recuerde que los diametros aceptados son: (20,30,40)" + '\n');
				}
			} while (diametroPizza != 20 && diametroPizza != 30 && diametroPizza != 40);

			System.out.print("¿La pizza contiene ingredientes especiales? (true/false): ");
			ingredienteEspecialPizza = teclado.nextBoolean();

			Pizza pizza = new Pizza();

			pizza.setDiametroPizza(diametroPizza);
			pizza.setIngredienteEspecial(ingredienteEspecialPizza);

			System.out.println();
			System.out.println("** Pizza " + (i + 1) + " **");
			pizza.mostrarPizza();
			System.out.println();

		}
		teclado.close();

	}

}
