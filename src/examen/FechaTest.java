package examen;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FechaTest {
	Fecha f = new Fecha();
	
	@Test
	void CP1() {
		boolean fecha = f.validarFecha(2023, 1, 0);
		assertFalse(fecha);
	}
	
	@Test
	void CP2() {
		boolean fecha = f.validarFecha(2023, 2, 15);
		assertTrue(fecha);
	}
	
	@Test
	void CP3() {
		boolean fecha = f.validarFecha(2024, 4, 29);
		assertTrue(fecha);
	}
	
	@Test
	void CP4() {
		boolean fecha = f.validarFecha(2018, 5, 31);
		assertTrue(fecha);
	}

}
