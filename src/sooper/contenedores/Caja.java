/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sooper.contenedores;

import sooper.IProducto;
import sooper.enums.TipoContenedor;

/**
 *
 * @author Jonathan Matias Gomez
 */
public class Caja extends Contenedor {
	
	private int ancho;
	private int largo;

	public Caja(String referencia, int alto, int ancho, int largo) {
		super(referencia, alto, 0);
		this.ancho = ancho;
		this.largo = largo;
	}
	
	@Override
	public TipoContenedor getTipo() {
		return TipoContenedor.CAJA;
	}

	@Override
	public int getSuperficie() {
		return ancho * largo;
	}

	@Override
	public boolean resiste(IProducto producto) {
		return true;
	}

}

