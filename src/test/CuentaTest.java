package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import pkg.Cuenta;

class CuentaTest {
	
	Cuenta cuenta1;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		cuenta1 = new Cuenta(0.0);
		cuenta2 = new Cuenta(50.0, 12345, "Alvaro" );
		cuenta3 = new Cuenta(0.0, 67890, "are");
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testIngresar() {

		cuenta1.ingresar(1d);
		
		assertEquals(1,cuenta1.getSaldo());
		
	}
	
	@Test
	void testRetirar() {

		cuenta1.retirar(1d);
		
		assertEquals(-1,cuenta1.getSaldo());
		
	}
	@Test
	void Test0014() {
		cuenta2.retirar(200.0);
		cuenta3.retirar(350.0);
		cuenta2.ingresar(100.0);
		cuenta3.retirar(200.0);
		cuenta3.retirar(150.0);
		cuenta2.retirar(200.0);
		cuenta3.ingresar(50.0);
		cuenta3.retirar(100.0);

		
		assertEquals(-250.0,cuenta2.getSaldo());
		assertEquals(-450.0,cuenta3.getSaldo());
		
	}
}
