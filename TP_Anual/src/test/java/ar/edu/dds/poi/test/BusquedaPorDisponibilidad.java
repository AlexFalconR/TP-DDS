package ar.edu.dds.poi.test;

import static java.time.DayOfWeek.*;
import static org.junit.Assert.*;
import org.junit.Test;

public class BusquedaPorDisponibilidad extends setUp{
	
		
	@Test
	public void testColectivoSiempreDisponible(){
		assertTrue(paradaLejanaDeColectivo.estaDisponible(SUNDAY, 00, 00));
	}

	@Test
	public void testBancoDisponible(){
		assertTrue(bancoPatagonia.estaDisponible("Prestamos", WEDNESDAY, 12, 55));
	}
	@Test
	public void testBancoConUnDiaNoDisponible(){
		assertFalse(bancoNacionLiniers.estaDisponible("Pagos", SUNDAY, 12, 45));
	}
	@Test
	public void testBancoConUnHorarioNoDisponible(){
		assertFalse(bancoNacionLiniers.estaDisponible("Cobros", THURSDAY, 15, 01));
	}
	@Test
	public void testBancoDisponiblePeroNoPrestaElServicio(){
		assertFalse(bancoPatagonia.estaDisponible("Deposito", THURSDAY, 12, 30));
	}
	
	@Test	
	public void testAlmacenDisponible(){
		assertTrue(luisito.estaDisponible(MONDAY, 17, 00));
	}
	@Test
	public void testAlmacenConDiaNoDisponible(){
		assertFalse(laBondiolita.estaDisponible(SATURDAY, 12, 45));
	}
	@Test
	public void testAlmacenConHorarioNoDisponible(){
		assertFalse(luisito.estaDisponible(MONDAY, 13, 30));
	}
	
	@Test
	public void testCGP_Disponible(){
		assertTrue(cgp1.estaDisponible(supervivencia, FRIDAY, 11, 30));
	}
	@Test
	public void testCGP_SinServicioDisponible(){
		assertFalse(cgp8.estaDisponible(cuil, FRIDAY, 11,30));
	}
	@Test
	public void testCGP_QuePrestaUnServicioPeroHorarioNoDisponible(){
		assertFalse(cgp8.estaDisponible(pension, MONDAY, 13, 00));
	}
	@Test
	public void testCGP_ConServicioDisponiblePeroDiaNoHabil(){
		assertFalse(cgp1.estaDisponible(supervivencia, SUNDAY, 14, 00));
	}
	@Test
	public void testCGP_ConAlgunServicioDisponible(){
		assertTrue(cgp8.estaDisponible(MONDAY, 11, 30));
	}
	@Test
	public void testCGP_SinServiciosDisponibles(){
		assertFalse(cgp8.estaDisponible(SUNDAY, 11, 30));
	}
}
