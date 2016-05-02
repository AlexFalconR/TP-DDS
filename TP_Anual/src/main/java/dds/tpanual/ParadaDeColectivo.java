package dds.tpanual;

import java.time.DayOfWeek;
import java.util.Set;

public class ParadaDeColectivo extends POI {
	int lineaDeColectivo;
	
	public ParadaDeColectivo(String nombre, Coordenadas unaCoordenada, String barrio, int numeroDeLinea) {
		super(nombre,unaCoordenada,barrio);
		setLineaDeColectivo(numeroDeLinea);
	}
	
	@Override
	public Set<String> getPalabrasClave(){
		Set<String> palabrasClave = super.getPalabrasClave();
		palabrasClave.add(String.valueOf(lineaDeColectivo));
		return palabrasClave;
	}
	
	public int getLineaDeColectivo() {
		return lineaDeColectivo;
	}

	public void setLineaDeColectivo(int lineaDeColectivo) {
		this.lineaDeColectivo = lineaDeColectivo;
	}

	@Override
	public double getRadioDeCercania() {
		return 100;
	}
	
	public boolean estaDisponible(DayOfWeek _dia, int hora, int min){
		return true;
	}

}
