package ar.edu.dds.poi.test;

import static org.junit.Assert.*;

import org.junit.Test;

public class BusquedaPorCercania extends setUp{


	// Paradas de colectivo

	@Test
	public void testUnaParadaAMenosDeUnaCuadraSeConsideraCercana() {
		assertTrue(paradaDeLaPuerta114.estaCerca(facultad));
	}

	@Test
	public void testUnaParadaAMasDeUnaCuadraNoSeConsideraCercana() {

		assertFalse(paradaLejanaDeColectivo.estaCerca(facultad));

	}

	// Sucursales bancarias (funcionan como cualquier POI: el radio de cercanía
	// es 500 metros)
	// Imaginemos que hubiera una sucursal del Banco Patagonia cerca de la facu.
	@Test
	public void testLaSucursalDelBancoPatagoniaQueEstaAMenosDe500MetrosSeConsideraCercana() {

		assertTrue(bancoPatagonia.estaCerca(facultad));
	}

	@Test
	public void testLaSucursalDelBancoNacionLiniersQueEstaAMasDe500MetrosNoSeDebeConsiderarCercana() {

		assertFalse(bancoNacionLiniers.estaCerca(facultad));

	}

	// Locales Comerciales

	@Test
	public void testUnLocalComercialConRubroComidaAlPasoUbicadoAMenosDe200MetrosSeDebeConsiderarCercano() {

		assertTrue(luisito.estaCerca(facultad));
	}

	@Test
	public void testUnLocalComercialConRubroComidaAlPasoUbicadoAMenosDe200MetrosNoSeDebeConsiderarCercano() {

		assertFalse(laBondiolita.estaCerca(facultad));
	}

	// CGP
	
	
	@Test
	public void testCGP9EstaEnLuganoPorLoQueEsCercanoALaFacultad() {

		assertTrue(cgp8.estaCerca(facultad));
	}

	@Test
	public void testCGP1EstaEnSanNicolasPorLoqueNoEsCercanoALaFacultad() {

		assertFalse(cgp1.estaCerca(facultad));

	}
	
}