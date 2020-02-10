package com.placoste.modelo;

import static org.junit.jupiter.api.Assertions.*;

import java.text.ParseException;

import org.junit.jupiter.api.Test;
import com.placoste.modelo.Proceso;
class ProcesoTest {

	

	@Test
	void testProximoCumpleanos() throws ParseException {
		String resultado = Proceso.proximoCumpleanos("26/05/1972");
		String esperado = "Faltan 106 para el cumpleaños";
		assertEquals(resultado,esperado);
	}

	@Test
	void testCalcularEdad() throws ParseException {
		int resultado = Proceso.calcularEdad("26/05/1972");
		int esperado = 47;
		assertEquals(resultado,esperado);
	}

}
