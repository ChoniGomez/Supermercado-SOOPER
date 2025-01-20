/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sooper.productos;

import sooper.IProducto;
import sooper.enums.Categoria;

/**
 *
 * @author Jonathan Matias Gomez
 */
public class Mascotas extends Producto {

	public Mascotas(String referencia, int peso, int volumen) {
		super(referencia, peso, volumen);
	}

	@Override
	public Categoria getCategoria() {
		return Categoria.MASCOTAS;
	}

	@Override
	public boolean esCompatible(IProducto p) {
		return Categoria.DROGUERIA.equals(p.getCategoria());
	}

}

