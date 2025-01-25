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
public class Fresco extends Alimentacion implements Caducable {

	private LocalDate caducidad;
	
	public Fresco(String referencia, int peso, int volumen, LocalDate caducidad) {
		super(referencia, peso, volumen);
		this.caducidad = caducidad;
	}

	@Override
	public boolean estaCaducado() {
		return caducidad.isBefore(LocalDate.now());
	}

}