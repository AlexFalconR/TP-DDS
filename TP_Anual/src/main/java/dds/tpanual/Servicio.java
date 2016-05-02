package dds.tpanual;

import java.util.ArrayList;
import java.util.List;

public class Servicio {
	
	private String nombre;
	private List<Horario> diasDeAtencion = new ArrayList<>();
	
	public Servicio(String _nombre){
		this.nombre = _nombre;
	}
	
	public void setDiasDeAtencion(Horario _dia){
			diasDeAtencion.add(_dia);
	}
	
	public List<Horario> getDiasDeAtencion(){
		return diasDeAtencion;
	}
	
	public String getNombre() {
		return nombre;
	}
}
