package ar.edu.unju.fi.ejercicio7.model;

public class Empleado {

	private String nombre;
	private String legajo;
	private double salario;
	private double salarioMinimo = 210000.00;
	private double amuentoPorMeritos = 20000.00;

	public Empleado(String nombre, String legajo, double salario) {
		super();
		this.nombre = nombre;
		this.legajo = legajo;

		if (salario >= salarioMinimo) {
			this.salario = salario;
		} else
			this.salario = salarioMinimo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getLegajo() {
		return legajo;
	}

	public void setLegajo(String legajo) {
		this.legajo = legajo;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public void mostrarDatos() {
		System.out.println("Nombre del empleado: " + nombre);
		System.out.println("Legajo: " + legajo);
		System.out.println("Salario: " + "$" + salario);
	}

	public void aumentoMeritos() {
		double aumento;
		aumento = this.salario + amuentoPorMeritos;
		System.out.println("Salario aumentado por meritos: " + aumento);

	}

}
