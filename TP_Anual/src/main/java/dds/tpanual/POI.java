
package dds.tpanual;

import java.time.DayOfWeek;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class POI {
	protected String nombre;
	private Coordenadas coordenadas;
	private String barrio;
	private List<Horario> diasDeAtencion = new ArrayList<>();
	
	public POI(){
		
	}
	
	public POI(String nombre, Coordenadas coordenadas, String barrio) {
		this.nombre = nombre;
		this.coordenadas = coordenadas;
		this.barrio = barrio;					
	}
	
	public Set<String> getPalabrasClave(){
		Set<String> palabrasClave = new HashSet<String>();
		palabrasClave.add(nombre);
		palabrasClave.add(barrio);		
		palabrasClave.add(Class.class.getName());
		return palabrasClave;
	}

	public boolean contienePalabraClave(String unTexto) {
		return this.getPalabrasClave().contains(unTexto);
	}

	public boolean esValido() {
		return ((tieneNombre()) && (this.getCoordenada().tieneCoordenadasValidas()));
	}

	public boolean estaCerca(POI unPOI) {
		return (this.getRadioDeCercania() >= coordenadas.distanciaEnMetrosEntreCoordenadas(unPOI.getCoordenada()));
	}
	
	public boolean estaDisponible(DayOfWeek _dia, int hora, int min){
		return horarioDisponible(LocalTime.of(hora, min), this.diaDisponible(_dia, this.getDiasDeAtencion()));
	}

	public List<Horario> diaDisponible(DayOfWeek _dia, List<Horario> _diasDeAtencion){
		return _diasDeAtencion.stream().filter(turno -> turno.getDia().equals(_dia)).collect(Collectors.toList());
	}

	public boolean horarioDisponible(LocalTime horario, List<Horario> _diasDeAtencion){
		return  _diasDeAtencion.stream().anyMatch(turno -> turno.turnoDisponible(horario));
	}
	
	public List<Horario> getDiasDeAtencion(){
		return diasDeAtencion;
	}
	
	public void setDiasDeAtencion(Horario _dia){
		diasDeAtencion.add(_dia);
	}
	
	public double getRadioDeCercania() {
		return 500;
	}

	public boolean tieneNombre() {
		return ((this.nombre).length() > 0);
	}

	public String getBarrio() {
		return barrio;
	}

	public String getNombre() {

		return nombre;
	}

	public Coordenadas getCoordenada() {
		return coordenadas;
	}

	public void setCoordenadas(Coordenadas unaCoordenada){
		this.coordenadas = unaCoordenada;
	}

	public void setBarrio(String unBarrio){
		this.barrio = unBarrio;
	}

}