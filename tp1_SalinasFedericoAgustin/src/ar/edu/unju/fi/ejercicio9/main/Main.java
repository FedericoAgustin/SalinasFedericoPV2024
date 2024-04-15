package ar.edu.unju.fi.ejercicio9.main;

import java.util.Scanner;

import ar.edu.unju.fi.ejercicio9.model.Producto;

public class Main {

	public static void main(String[] args) {

		Scanner leer = new Scanner(System.in);
		String codigoProducto;
		double precioProducto;
		String nombreProducto;
		byte descuentoProducto;
		for (int i = 0; i < 3; i++) {
			System.out.println("Ingrese los datos del producto " + (i + 1) + ":");
			System.out.print("Nombre: ");
			nombreProducto = leer.next();
			System.out.print("Código: ");
			codigoProducto = leer.next();
			System.out.print("Precio: ");
			precioProducto = leer.nextDouble();
			do {
				System.out.print("Descuento (%): ");
				descuentoProducto = leer.nextByte();
			} while (descuentoProducto < 0 || descuentoProducto > 50);

			Producto producto = new Producto();

			producto.setNombreProducto(nombreProducto);
			producto.setCodigoProducto(codigoProducto);
			producto.setPrecioProducto(precioProducto);
			producto.setDescuento(descuentoProducto);

			System.out.println();
			System.out.println("------INFORMACIÓN DEL PRODUCTO-----");
			producto.mostrarInfoProducto();
			System.out.println();
		}
		leer.close();

	}

}
