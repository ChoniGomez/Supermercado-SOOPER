/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sooper;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Jonathan Matias Gomez
 */
public class Pedido implements IPedido {

	private String referencia;
	private Set<IContenedor> contenedores;
	
	public Pedido(String referencia) {
		this.referencia = referencia;
		this.contenedores = new HashSet<IContenedor>();
	}

	@Override
	public String getReferencia() {
		return referencia;
	}

	@Override
	public Set<IProducto> getProductos() {
		Set<IProducto> productos = null;
		for (IContenedor c : contenedores) {
			if (productos == null) {
				productos = c.getProductos();
			} else {
				productos.addAll(c.getProductos());
			}
		}
		return productos;
	}

	@Override
	public Set<IContenedor> getContenedores() {
		return contenedores;
	}

	@Override
	public void addContenedor(IContenedor contenedor) {
		contenedores.add(contenedor);
	}

	@Override
	public IContenedor addProducto(IProducto producto) {
		for (IContenedor contenedor : contenedores) {
			if (contenedor.meter(producto)) {
				return contenedor;
			}			
		}
		System.err.println(producto.getReferencia() + " rechazado del pedido"); 
		return null;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Pedido: " + referencia + "\n");
		for (IContenedor contenedor : contenedores) {
			sb.append("\t" + contenedor + "\n");
		}
		return sb.toString();
	}
}

