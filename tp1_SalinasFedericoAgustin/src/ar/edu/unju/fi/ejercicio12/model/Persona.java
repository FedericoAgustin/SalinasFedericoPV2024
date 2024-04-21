package ar.edu.unju.fi.ejercicio12.model;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Persona {

	private String personaNombre;
	private Calendar personaFechaNacimiento;

	public Persona() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Persona(String personaNombre, Calendar personaFechaNacimiento) {
		super();
		this.personaNombre = personaNombre;
		this.personaFechaNacimiento = personaFechaNacimiento;
	}

	public String getPersonaNombre() {
		return personaNombre;
	}

	public void setPersonaNombre(String personaNombre) {
		this.personaNombre = personaNombre;
	}

	public Calendar getPersonaFechaNacimiento() {
		return personaFechaNacimiento;
	}

	public void setPersonaFechaNacimiento(Calendar personaFechaNacimiento) {
		this.personaFechaNacimiento = personaFechaNacimiento;
	}

	public long edadPersona() {
		Calendar fechaActual = Calendar.getInstance();
		long milisec = fechaActual.getTimeInMillis() - personaFechaNacimiento.getTimeInMillis();
		long edadEnDias = milisec / 1000 / 60 / 60 / 24;

		int anioActual = fechaActual.get(Calendar.YEAR);

		if ((anioActual % 4 == 0 && anioActual % 100 != 0) || (anioActual % 400 == 0)) {
			return edadEnDias / 366;
		} else
			return edadEnDias / 365;
	}

	public String signoZodiacal() {

		int dia = personaFechaNacimiento.get(Calendar.DAY_OF_MONTH);
		int mes = personaFechaNacimiento.get(Calendar.MONTH) + 1;

		if ((mes == 3 && dia >= 21) || (mes == 4 && dia <= 19)) {
			return "Aries";
		} else if ((mes == 4 && dia >= 20) || (mes == 5 && dia <= 20)) {
			return "Tauro";
		} else if ((mes == 5 && dia >= 21) || (mes == 6 && dia <= 20)) {
			return "Géminis";
		} else if ((mes == 6 && dia >= 21) || (mes == 7 && dia <= 22)) {
			return "Cáncer";
		} else if ((mes == 7 && dia >= 23) || (mes == 8 && dia <= 22)) {
			return "Leo";
		} else if ((mes == 8 && dia >= 23) || (mes == 9 && dia <= 22)) {
			return "Virgo";
		} else if ((mes == 9 && dia >= 23) || (mes == 10 && dia <= 22)) {
			return "Libra";
		} else if ((mes == 10 && dia >= 23) || (mes == 11 && dia <= 21)) {
			return "Escorpio";
		} else if ((mes == 11 && dia >= 22) || (mes == 12 && dia <= 21)) {
			return "Sagitario";
		} else if ((mes == 12 && dia >= 22) || (mes == 1 && dia <= 19)) {
			return "Capricornio";
		} else if ((mes == 1 && dia >= 20) || (mes == 2 && dia <= 18)) {
			return "Acuario";
		} else {
			return "Piscis";
		}
	}

	public String estacionAnio() {

		int dia = personaFechaNacimiento.get(Calendar.DAY_OF_MONTH);
		int mes = personaFechaNacimiento.get(Calendar.MONTH) + 1;

		if ((mes == 11 && dia >= 21) || (mes == 3 && dia <= 20)) {
			return "Verano";
		} else if ((mes == 3 && dia >= 21) || (mes == 6 && dia <= 20)) {
			return "Otoño";
		} else if ((mes == 6 && dia >= 21) || (mes == 9 && dia <= 20)) {
			return "Invierno";
		} else {
			return "Primavera";
		}
	}

	public void mostrarDatos() {
		personaFechaNacimiento.add(Calendar.MONTH, -1);
		SimpleDateFormat fechaFormateada = new SimpleDateFormat("dd/MM/yyyy");

		System.out.println("Nombre de la persona: " + personaNombre);
		System.out.println(
				"Fecha de Nacimiento de la persona: " + fechaFormateada.format(personaFechaNacimiento.getTime()));
		System.out.println("Edad de la persona: " + edadPersona() + " años");
		System.out.println("Signo del zodiaco de la persona: " + signoZodiacal());
		System.out.println("Estación del año: " + estacionAnio());
	}

}
