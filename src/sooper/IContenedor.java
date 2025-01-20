/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sooper;

import java.util.Set;
import sooper.enums.TipoContenedor;

/**
 *
 * @author Jonathan Matias Gomez
 */
public interface IContenedor {
	
	String getReferencia();

	int getVolumen();

	int volumenDisponible();

	int getResistencia();
	
	Set<IProducto> getProductos();
	
	TipoContenedor getTipo();

	boolean meter(IProducto producto);

	boolean resiste(IProducto producto);
	
	int getSuperficie();

}
