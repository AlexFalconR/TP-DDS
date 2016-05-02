package dds.tpanual;

import static java.time.DayOfWeek.*;
import java.time.DayOfWeek;
import java.util.ArrayList;
import java.util.List;

public class SucursalBancaria extends POI {
	
	Horario lunes= new Horario(MONDAY, 10, 00, 15, 00);
	Horario martes = new Horario(TUESDAY, 10, 00, 15, 00);
	Horario miercoles = new Horario(WEDNESDAY, 10, 00, 15, 00);
	Horario jueves = new Horario(THURSDAY, 10, 00, 15, 00);
	Horario viernes = new Horario(FRIDAY, 10, 00, 15, 00);
	
	private List<String> servicios = new ArrayList<>();
	
	public SucursalBancaria(String nombre, Coordenadas coordenada, String barrio) {
		super(nombre, coordenada, barrio);
		this.setDiasDeAtencion(lunes);
		this.setDiasDeAtencion(martes);
		this.setDiasDeAtencion(miercoles);
		this.setDiasDeAtencion(jueves);
		this.setDiasDeAtencion(viernes);
	}
	
	public boolean estaDisponible(String _servicio, DayOfWeek _dia, int hora, int min){
		return this.prestaElServicio(_servicio) && this.estaDisponible(_dia, hora, min);
	}
	
	public boolean prestaElServicio(String _servicio){
		return servicios.contains(_servicio);
	}
	
	public void setServicios(String _servicio){
		servicios.add(_servicio);
	}
}