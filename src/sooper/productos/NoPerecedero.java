/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sooper.productos;

import java.time.LocalDate;

/**
 *
 * @author Jonathan Matias Gomez
 */
public class NoPerecedero extends Alimentacion implements Caducable {

	private static final int ANYOS_CADUCIDAD = 5;
	
	private LocalDate fechaFabricacion;
	
	public NoPerecedero(String referencia, int peso, int volumen, LocalDate fechaFabricacion) {
		super(referencia, peso, volumen);
		this.fechaFabricacion = fechaFabricacion;
	}

	@Override
	public boolean estaCaducado() {
		return LocalDate.now().isBefore(fechaFabricacion.plusYears(ANYOS_CADUCIDAD));
	}

}
