package ar.edu.unju.fi.ejercicio6.model;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Persona {

	private String dniPersona;
	private String nombrePersona;
	private LocalDate fechaNacimiento;
	private String provincia;

	public Persona() {
		// TODO Auto-generated constructor stub
	}

	public Persona(String dniPersona, String nombrePersona, LocalDate fechaNacimiento, String provincia) {
		super();
		this.dniPersona = dniPersona;
		this.nombrePersona = nombrePersona;
		this.fechaNacimiento = fechaNacimiento;
		this.provincia = provincia;
	}

	public Persona(String dniPersona, String nombrePersona, LocalDate fechaNacimiento) {
		super();
		this.dniPersona = dniPersona;
		this.nombrePersona = nombrePersona;
		this.fechaNacimiento = fechaNacimiento;
		this.provincia = "Jujuy";
	}

	public String getDniPersona() {
		return dniPersona;
	}

	public void setDniPersona(String dniPersona) {
		this.dniPersona = dniPersona;
	}

	public String getNombrePersona() {
		return nombrePersona;
	}

	public void setNombrePersona(String nombrePersona) {
		this.nombrePersona = nombrePersona;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	public int calcularEdad() {
		Period periodo = Period.between(fechaNacimiento, LocalDate.now());
		return periodo.getYears();
	}

	public boolean verificarMayoriaEdad() {
		Period periodo = Period.between(fechaNacimiento, LocalDate.now());
		if (periodo.getYears() > 18) {
			return true;
		} else {
			return false;
		}
	}

	public void mostrarDatos() {

		DateTimeFormatter fechaFormato = DateTimeFormatter.ofPattern("dd/MM/yyy");
		String fechaFormateada = fechaNacimiento.format(fechaFormato);
		System.out.println("-------Datos de la persona------");
		System.out.println("Nombre: " + nombrePersona);
		System.out.println("DNI: " + dniPersona);
		System.out.println("Edad: " + calcularEdad());
		System.out.println("Fecha de Nacimiento: " + fechaFormateada);
		System.out.println("Provincia donde reside: " + provincia);

		if (verificarMayoriaEdad() == true)
			System.out.println("La persona es mayor de edad");
		else
			System.out.println("La persona no es mayor de edad");
	}

}
