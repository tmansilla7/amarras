package ar.edu.unlam.pb2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FondeaderoTest {

	@Test
	void crearFondeadero() {
		Fondeadero fondeadero = new Fondeadero(70);
		
		assertEquals(70, fondeadero.getCantidadMaximaDeAmarras());
	}
	
	@Test
	void amarrarYateAVela() {
		Fondeadero fondeadero = new Fondeadero(70);
		Yate yate = new YateVela();
		
		assertTrue(fondeadero.amarrarYate(yate));
	}
	
	@Test
	void amarrarYateAMotor() {
		Fondeadero fondeadero = new Fondeadero(70);
		Yate yate = new YateMotor();
		
		assertTrue(fondeadero.amarrarYate(yate));
	}
	
	@Test
	void desamarrarYateAVela() {
		Fondeadero fondeadero = new Fondeadero(70);
		Yate yate1 = new YateVela();
		Yate yate2 = new YateVela();
		
		assertTrue(fondeadero.amarrarYate(yate1));
		assertTrue(fondeadero.amarrarYate(yate2));
		assertTrue(fondeadero.desamarrarYate(yate1));
		assertEquals(1, fondeadero.getTamañoFondeadero());
	}
	
	@Test
	void desamarrarYateAMotor() {
		Fondeadero fondeadero = new Fondeadero(70);
		Yate yate1 = new YateMotor();
		Yate yate2 = new YateMotor();
		
		assertTrue(fondeadero.amarrarYate(yate1));
		assertTrue(fondeadero.amarrarYate(yate2));
		assertTrue(fondeadero.desamarrarYate(yate1));
		assertEquals(1, fondeadero.getTamañoFondeadero());
	}
	
	@Test
	void obtenerLaCantidadDeYatesAmarrados() {
		Fondeadero fondeadero = new Fondeadero(70);
		Yate yate1 = new YateVela();
		Yate yate2 = new YateMotor();
		
		assertTrue(fondeadero.amarrarYate(yate1));
		assertTrue(fondeadero.amarrarYate(yate2));
		assertEquals(2, fondeadero.getCantidadDeYatesAmarrados());
	}
	
	@Test
	void obtenerLaCantidadDeAmarrasDisponibles() {
		Fondeadero fondeadero = new Fondeadero(70);
		Yate yate1 = new YateVela();
		Yate yate2 = new YateMotor();
		
		assertTrue(fondeadero.amarrarYate(yate1));
		assertTrue(fondeadero.amarrarYate(yate2));
		assertEquals(68, fondeadero.getCantidadDeAmarrasDisponibles());
	}

	@Test
	void obtenerPrecioDeAmarreYateAVelaYEsloraCorta() {
		Fondeadero fondeadero = new Fondeadero(70);
		Yate yate = new YateVela();
		
		assertEquals(11000, yate.getCostoMensual());
	}
	
	@Test
	void obtenerPrecioDeAmarreYateAMotorYEsloraLarga() {
		Fondeadero fondeadero = new Fondeadero(70);
		Yate yate = new YateMotor();
		
		assertEquals(13000, yate.getCostoMensual());
	}
	
	@Test
	void obtenerRecaudacionTotal() {
		Fondeadero fondeadero = new Fondeadero(70);
		Yate yate1 = new YateVela();
		Yate yate2 = new YateMotor();
		
		assertTrue(fondeadero.amarrarYate(yate1));
		assertTrue(fondeadero.amarrarYate(yate2));
		
		assertEquals(24000, fondeadero.obtenerRecaudacionTotal());
	}
	
}