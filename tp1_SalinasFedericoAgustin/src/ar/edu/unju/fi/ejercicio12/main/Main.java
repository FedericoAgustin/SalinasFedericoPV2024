package ar.edu.unju.fi.ejercicio12.main;

import java.util.Calendar;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio12.model.Persona;

public class Main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Calendar fechaNacimientoPersona = Calendar.getInstance();

		System.out.print("Ingrese Nombre: ");
		String nombrePersona = teclado.next();
		System.out.println("Ingrese Fecha de Nacimiento: ");
		System.out.print("Dia: ");
		int dia = teclado.nextInt();
		System.out.print("Mes: ");
		int mes = teclado.nextInt();
		System.out.print("Año: ");
		int anio = teclado.nextInt();

		fechaNacimientoPersona.set(anio, mes, dia);

		Persona persona = new Persona(nombrePersona, fechaNacimientoPersona);

		System.out.println("");
		persona.mostrarDatos();

		teclado.close();
	}

}
