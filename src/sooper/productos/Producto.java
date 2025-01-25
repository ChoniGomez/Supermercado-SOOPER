/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sooper.productos;

import sooper.IContenedor;
import sooper.IProducto;

/**
 *
 * @author Jonathan Matias Gomez
 */
public abstract class Producto implements IProducto {

	private String referencia;
	private int peso;
	private int volumen;
	
	private IContenedor contenedor;
	
	public Producto(String referencia, int peso, int volumen) {
		this.referencia = referencia;
		this.peso = peso;
		this.volumen = volumen;
	}
	
	@Override
	public String getReferencia() {
		return referencia;
	}
	
	@Override
	public int getPeso() {
		return peso;
	}
	
	@Override
	public int getVolumen() {
		return volumen;
	}

	@Override
	public boolean tengoEspacio(IContenedor contenedor) {
		return contenedor.volumenDisponible() > volumen;
	}

	@Override
	public void meter(IContenedor contenedor) {
		this.contenedor = contenedor;		
	}

	@Override
	public String toString() {
		return "Producto [categoria=" + getCategoria() + ", referencia=" + referencia + ", peso=" + peso + ", volumen="
				+ volumen + ", contenedor=" + contenedor.getReferencia() + "]";
	}
}
