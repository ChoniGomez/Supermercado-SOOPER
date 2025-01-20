/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sooper;

import java.util.Set;

/**
 *
 * @author Jonathan Matias Gomez
 */
public interface IPedido {
    	String getReferencia();
	
	Set<IProducto> getProductos();

	Set<IContenedor> getContenedores();

	void addContenedor(IContenedor contenedor);
	
	IContenedor addProducto(IProducto producto);

}
