package ar.edu.unju.fi.ejercicio9.model;

public class Producto {

	private String nombreProducto;
	private String codigoProducto;
	private Double precioProducto;
	private byte descuento;

	public Producto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getNombreProducto() {
		return nombreProducto;
	}

	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}

	public String getCodigoProducto() {
		return codigoProducto;
	}

	public void setCodigoProducto(String codigoProducto) {
		this.codigoProducto = codigoProducto;
	}

	public Double getPrecioProducto() {
		return precioProducto;
	}

	public void setPrecioProducto(Double precioProducto) {
		this.precioProducto = precioProducto;
	}

	public byte getDescuento() {
		return descuento;
	}

	public void setDescuento(byte descuento) {
		this.descuento = descuento;
	}

	public double calcularDescuento() {
		double precioConDescuento = precioProducto - (precioProducto * descuento / 100);
		return precioConDescuento;
	}

	public void mostrarInfoProducto() {
		System.out.println("Producto: " + nombreProducto);
		System.out.println("Código: " + codigoProducto);
		System.out.println("Precio del producto: " + "$" + precioProducto);

		if (descuento > 0) {
			System.out.println(
					"Precio del producto aplicando el " + descuento + "%" + " de descuento: " + calcularDescuento());
		} else
			System.out.println("No se aplicó ningún descuento al producto");
	}

}
