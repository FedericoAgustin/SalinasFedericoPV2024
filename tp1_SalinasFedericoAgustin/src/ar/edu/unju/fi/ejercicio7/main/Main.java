package ar.edu.unju.fi.ejercicio7.main;

import java.util.Scanner;

import ar.edu.unju.fi.ejercicio7.model.Empleado;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String empleadoNombre;
		String legajoEmpleado;
		double salarioEmpleado;
		System.out.println("INGRESE DATOS");
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingrese el nombre del empleado:");
		empleadoNombre = teclado.nextLine();
		System.out.println("Ingrese el legajo del empleado:");
		legajoEmpleado = teclado.next();
		System.out.println("Ingrese salario:");
		salarioEmpleado = teclado.nextDouble();
		teclado.close();

		Empleado empleado = new Empleado(empleadoNombre, legajoEmpleado, salarioEmpleado);
		empleado.mostrarDatos();
		empleado.aumentoMeritos();
		empleado.setNombre(empleadoNombre);

	}

}
