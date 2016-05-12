/**
 * 
 */
package com.ejemplo.modelo;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @author dtvaaula
 *
 */
public class PersonaTest {


	
	@Test
	public void shoulBeTrueWhenPersonasDistintoSexo() {
		Persona personaHombre = new Persona();
		personaHombre.setSexo(Persona.HOMBRE);
		Persona personaMujer = new Persona();
		personaMujer.setSexo(Persona.MUJER);
		assertTrue(personaHombre.isDistintoSexo(personaMujer));
	}
	@Test
	public void shoulBeFalseWhenPersonasIgualSexo() {
		Persona personaHombre = new Persona();
		personaHombre.setSexo(Persona.HOMBRE);
		Persona personaHombre2 = new Persona();
		personaHombre2.setSexo(Persona.HOMBRE);
		assertFalse(personaHombre.isDistintoSexo(personaHombre2));
	}

}
