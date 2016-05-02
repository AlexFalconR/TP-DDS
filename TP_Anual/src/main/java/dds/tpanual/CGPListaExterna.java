package dds.tpanual;

import java.util.List;
import java.util.Set;

public class CGPListaExterna {
	
	private String nombre;
	private int comuna;
	private String barrio;
	private Coordenadas coordenada;
	private String zonasIncluidas;
	private String nombreDirector;
	private String domicilio;
	private String telefono;
	private Set<Servicio> serviciosDTO;
	
	public CGPListaExterna(String nombre, Coordenadas coordenada, int comuna, String barrio, String zonasIncluidas,
			String nombreDirector, String domicilio, String telefono, Set<Servicio> serviciosDTO) {
		this.nombre = nombre;
		this.comuna = comuna;
		this.barrio = barrio;
		this.coordenada = coordenada;
		this.zonasIncluidas = zonasIncluidas;
		this.nombreDirector = nombreDirector;
		this.domicilio = domicilio;
		this.telefono = telefono;
		this.serviciosDTO = serviciosDTO;
	}

	public int getComuna() {
		return comuna;
	}

	public Coordenadas getCoordenada() {
		return coordenada;
	}

	public String getNombreDirector() {
		return nombreDirector;
	}

	public String getDomicilio() {
		return domicilio;
	}

	public String getTelefono() {
		return telefono;
	}

	public Set<Servicio> getServicioDTO() {
		return serviciosDTO;
	}

 	public String getBarrio(){
 		return barrio;
 	}
 	
 	public Coordenadas getCoordenadas(){
 		return coordenada;
 	}
 	
	public int getNumeroComuna(){
		return comuna;
	}

	public String getNombre(){
		return nombre;
	}
	
	public String getZonasIncluidas() {
		return zonasIncluidas;
	}

	public List<CGPListaExterna> search(String unTexto) {
		
		return null;
	}


}
