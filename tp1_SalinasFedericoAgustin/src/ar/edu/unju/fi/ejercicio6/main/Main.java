package ar.edu.unju.fi.ejercicio6.main;

import java.time.LocalDate;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio6.model.Persona;

public class Main {

	public static void main(String[] args) {

		String nombre;
		String dni;
		String provincia;
		int anio;
		int mes;
		int dia;
		Scanner teclado = new Scanner(System.in);
		System.out.println("--- SE SOLICITA QUE INGRESE LOS SIGUIENTES DATOS ---");
		System.out.println("Ingrese el N° de dni:");
		dni = teclado.next();
		teclado.nextLine();
		System.out.println("Ingrese su nombre:");
		nombre = teclado.nextLine();
		System.out.println("Ingrese el año de nacimiento");
		anio = teclado.nextInt();
		System.out.println("Ingrese el mes de nacimiento");
		mes = teclado.nextInt();
		System.out.println("Ingrese el dia de nacimiento");
		dia = teclado.nextInt();
		System.out.println("Ingrese su provincia:");
		provincia = teclado.next();

		LocalDate fecha = LocalDate.of(anio, mes, dia);
		Persona persona = new Persona(dni, nombre, fecha, provincia);
		persona.mostrarDatos();

		Persona persona1 = new Persona(dni, nombre, fecha);
		persona1.mostrarDatos();
		teclado.close();

	}

}
