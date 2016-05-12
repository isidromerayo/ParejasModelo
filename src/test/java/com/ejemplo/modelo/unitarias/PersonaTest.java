/**
 * 
 */
package com.ejemplo.modelo.unitarias;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.ejemplo.modelo.Persona;

/**
 * @author dtvaaula
 *
 */
public class PersonaTest {

	private static Persona sut = new Persona();
	

	@BeforeClass
	public static void init()  {
		sut.setSexo(Persona.MUJER);
	}

	@Test
	public void testIsDintintoSexo() {
		// Definir datos de prueba
		
		Persona datosDePruebaDeEntrada = new Persona();
		datosDePruebaDeEntrada.setSexo(Persona.HOMBRE);
		boolean resultadoEsperado = true;
		// ejecutar la prueba
		boolean resultadoObtenido = sut.isDistintoSexo(datosDePruebaDeEntrada);
		// comprobar resultados
		assertEquals(resultadoEsperado, resultadoObtenido);
		assertTrue(resultadoObtenido);
	}
	
	@Test
	public void testIsIgualSexo() {
		// Definir datos de prueba
		
		Persona datosDePruebaDeEntrada = new Persona();
		datosDePruebaDeEntrada.setSexo(Persona.MUJER);
		boolean resultadoEsperado = false;
		// ejecutar la prueba
		boolean resultadoObtenido = sut.isDistintoSexo(datosDePruebaDeEntrada);
		// comprobar resultados
		assertEquals(resultadoEsperado, resultadoObtenido);
		assertFalse(resultadoObtenido);
	}


}
