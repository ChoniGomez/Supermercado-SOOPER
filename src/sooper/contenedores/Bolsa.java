/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sooper.contenedores;

import sooper.enums.TipoContenedor;

/**
 *
 * @author Jonathan Matias Gomez
 */
public class Bolsa extends Contenedor {

	private int ancho;

	public Bolsa(String referencia, int alto, int ancho) {
		super(referencia, alto);
		this.ancho = ancho;
	}

	@Override
	public TipoContenedor getTipo() {
		return TipoContenedor.BOLSA;
	}

	@Override
	public int getSuperficie() {
		int radio = getDiametro()/2;
		return (int)(Math.PI * radio * radio);
	}
	
	private int getDiametro() {
		return (int)((2 * ancho) / Math.PI);		
	}


}
