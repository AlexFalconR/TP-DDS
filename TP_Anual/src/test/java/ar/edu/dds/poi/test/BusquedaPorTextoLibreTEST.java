package ar.edu.dds.poi.test;

import static org.junit.Assert.*;

import org.junit.Test;

import dds.tpanual.Servicio;

public class BusquedaPorTextoLibreTEST extends setUp{
	

	@Test
	public void testSeBuscaUnNumeroYDebeEncontrarLasParadasDeLaLineaDeColectivos() {

		assertTrue(maquinaDeLaFacu.busquedaPorTextoLibre("114").contains(paradaDeLaPuerta114));
		assertTrue(maquinaDeLaFacu.busquedaPorTextoLibre("114").contains(paradaLejanaDeColectivo));

		
	}

	@Test
	public void testSeBuscaUnNumeroYNoDebeEncontrarOtrosPOI() {
	assertFalse(maquinaDeLaFacu.busquedaPorTextoLibre("114").contains(luisito));
	}
	@Test
	public void testSeBuscaUnaParadaPorElNombre() {
		assertTrue(maquinaDeLaFacu.busquedaPorTextoLibre("Parada de la puerta").contains(paradaDeLaPuerta114));
	}

	@Test
	public void testSeBuscaUnLocalComercialPorElNombre() {
		assertTrue(maquinaDeLaFacu.busquedaPorTextoLibre("Luisito").contains(luisito));
	}

	@Test
	public void testBusquedaPorBarrio() {
		assertTrue(maquinaDeLaFacu.busquedaPorTextoLibre("Villa Lugano").contains(luisito));
		assertTrue(maquinaDeLaFacu.busquedaPorTextoLibre("Villa Lugano").contains(paradaDeLaPuerta114));
	}
	
	@Test
	public void testBusquedaPorBarrioNoEncuentraLosQueEstanEnOtroBarrio() {
		assertFalse(maquinaDeLaFacu.busquedaPorTextoLibre("Villa Lugano").contains(cgp1));

	}

	@Test
	public void testSeBuscaElServicioAsesoramientobusquedaDeCGPporServicios() {
		cgp1.agregarServicio(new Servicio("Asesoramiento"));
		assertTrue(maquinaDeLaFacu.busquedaPorTextoLibre("Asesoramiento").contains(cgp1));
	}
}
