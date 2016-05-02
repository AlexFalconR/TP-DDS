package dds.tpanual;

import java.time.DayOfWeek;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class CGP extends POI {
	private int numeroDeComuna;
	private ArrayList<String> barriosALosQueOfreceServicios;
	private Set<Servicio> servicios;
	public CGP(String nombre, Coordenadas coordenada, String barrio, int numeroDeComuna, ArrayList<String> barriosDeLaComuna ) {
		super(nombre, coordenada, barrio);
		this.numeroDeComuna = numeroDeComuna;
		this.servicios = new HashSet<Servicio>();
		barriosALosQueOfreceServicios = barriosDeLaComuna;
	}

	public CGP(String nombre, Coordenadas coordenada, String barrio, int numeroDeComuna,
			ArrayList<String> barriosDeLaComuna, Set<Servicio> servicios) {
		super(nombre, coordenada, barrio);
		this.numeroDeComuna = numeroDeComuna;
		this.servicios = servicios;
		barriosALosQueOfreceServicios = barriosDeLaComuna;
	}

	public CGP() {
	}

	@Override
	public boolean estaDisponible(DayOfWeek _dia, int hora, int min) {
		return servicios.stream().anyMatch(servicio -> this.estaDisponible(servicio, _dia, hora, min));
	}

	public boolean estaDisponible(Servicio _servicio, DayOfWeek _dia, int hora, int min) {
		return this.prestaElServicio(_servicio) && horarioDisponible(LocalTime.of(hora, min),
				this.diaDisponible(_dia, this.getDiasDeAtencion(_servicio)));
	}

	public List<Horario> getDiasDeAtencion(Servicio _servicio) {
		return _servicio.getDiasDeAtencion();
	}

	public boolean prestaElServicio(Servicio servicio) {
		return servicios.stream().anyMatch(unServicio -> unServicio.getNombre().equalsIgnoreCase(servicio.getNombre()));
	}

	public void agregarServicio(Servicio servicio) {
		servicios.add(servicio);
	}

	public void setAgregarServicio(Servicio _servicio) {
		servicios.add(_servicio);
	}

	@Override
	public Set<String> getPalabrasClave() {
		Set<String> palabrasClave = super.getPalabrasClave();
		palabrasClave.addAll(servicios.stream().map(servicio -> servicio.getNombre()).collect(Collectors.toSet()));
		return palabrasClave;
	}

	@Override
	public boolean estaCerca(POI unPOI) {
		return barriosALosQueOfreceServicios.contains(unPOI.getBarrio());
	}

	public int getNumeroDeComuna() {
		return numeroDeComuna;
	}

	public ArrayList<String> getBarriosALosQueOfreceServicios() {
		return barriosALosQueOfreceServicios;
	}

	public String getNombre() {
		return nombre;
	}

	public Set<Servicio> getServicios() {
		return servicios;
	}

	public void setNumeroDeComuna(int numeroDeComuna) {
		this.numeroDeComuna = numeroDeComuna;
	}

	public void setBarriosALosQueOfreceServicios(ArrayList<String> barriosALosQueOfreceServicios) {
		this.barriosALosQueOfreceServicios = barriosALosQueOfreceServicios;
	}

	public void setServicios(Set<Servicio> servicios) {
		this.servicios = servicios;
	}

	public CGP modelarLista(CGPListaExterna cgp) {
		ArrayList<String> barrios = new ArrayList<String>();
		this.setNombre(cgp.getNombre());
		this.setCoordenadas(cgp.getCoordenadas());
		this.setBarrio(cgp.getBarrio());
		this.setNumeroComuna(cgp.getNumeroComuna());
		this.setBarriosDeLaComuna(this.pasameloAArrayList(cgp.getZonasIncluidas(),barrios));
		this.setServicio(cgp.getServicioDTO());
		return (this);
	}

	private void setServicio(Set<Servicio> servicio) {
		this.servicios = servicio; 
	}

	private void setBarriosDeLaComuna(ArrayList<String> barrios) {
		this.barriosALosQueOfreceServicios = barrios;
	}

	private void setNumeroComuna(int numeroComuna) {
		this.numeroDeComuna = numeroComuna;
	}

	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<String> pasameloAArrayList(String zonasIncluidas, ArrayList<String> barrios) {

		int posicion = 0;
		char unCaracter;
		String palabra = null;

		while ((unCaracter = zonasIncluidas.charAt(posicion)) != '\n') {

			if (unCaracter == ',') {
				barrios.add(palabra);
			} else {
				palabra = (palabra) + (unCaracter);
			}

			posicion++;

		}

		barrios.add(palabra);

		return barrios;
	}

}