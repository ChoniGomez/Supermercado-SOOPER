/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sooper;

import sooper.enums.Categoria;

/**
 *
 * @author Jonathan Matias Gomez
 */
public interface IProducto {
	
	String getReferencia();

	int getPeso();

	int getVolumen();
	
	Categoria getCategoria();

	boolean esCompatible(IProducto p);

	boolean tengoEspacio(IContenedor contenedor);

	void meter(IContenedor contenedor);
}
