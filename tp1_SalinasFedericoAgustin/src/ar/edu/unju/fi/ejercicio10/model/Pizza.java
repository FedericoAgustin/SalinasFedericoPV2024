package ar.edu.unju.fi.ejercicio10.model;

public class Pizza {

	private int diametroPizza;
	private int precioPizza;
	private double areaPizza;
	private boolean ingredienteEspecial;
	private int INGREDIENTE_ESPECIAL_20 = 500;
	private int INGREDIENTE_ESPECIAL_30 = 750;
	private int INGREDIENTE_ESPECIAL_40 = 1000;

	public Pizza() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getDiametroPizza() {
		return diametroPizza;
	}

	public void setDiametroPizza(int diametroPizza) {
		this.diametroPizza = diametroPizza;
	}

	public int getPrecioPizza() {
		return precioPizza;
	}

	public void setPrecioPizza(int precioPizza) {
		this.precioPizza = precioPizza;
	}

	public double getAreaPizza() {
		return areaPizza;
	}

	public void setAreaPizza(double areaPizza) {
		this.areaPizza = areaPizza;
	}

	public boolean isIngredienteEspecial() {
		return ingredienteEspecial;
	}

	public void setIngredienteEspecial(boolean ingredienteEspecial) {
		this.ingredienteEspecial = ingredienteEspecial;
	}

	public int calcularPrecioPizza() {

		if (diametroPizza == 20) {
			if (ingredienteEspecial == true) {
				this.precioPizza = 4500 + INGREDIENTE_ESPECIAL_20;
			} else {
				this.precioPizza = 4500;
			}
		}

		if (diametroPizza == 30) {
			if (ingredienteEspecial == true) {
				this.precioPizza = 4800 + INGREDIENTE_ESPECIAL_30;
			} else {
				this.precioPizza = 4800;
			}
		}

		if (diametroPizza == 40) {
			if (ingredienteEspecial == true) {
				this.precioPizza = 5500 + INGREDIENTE_ESPECIAL_40;
			} else {
				this.precioPizza = 5500;
			}
		}
		return precioPizza;
	}

	public double calcularArea() {
		double PI = 3.14159;
		areaPizza = PI * Math.pow(diametroPizza, 2);
		return this.areaPizza;
	}

	public void mostrarPizza() {
		System.out.println("Diametro de la pizza: " + diametroPizza);
		System.out.println("Ingredientes especiales: " + ingredienteEspecial);
		System.out.println("Precio de la Pizza: $" + calcularPrecioPizza());
		System.out.println("Área de la pizza: " + calcularArea());
	}

}
