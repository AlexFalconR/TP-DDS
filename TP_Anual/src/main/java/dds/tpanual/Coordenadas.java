package dds.tpanual;

public class Coordenadas {
	private double latitud;
	private double longitud;

	public Coordenadas(double latitud, double longitud) {
		this.latitud = latitud;
		this.longitud = longitud;
	}

	public boolean tieneCoordenadasValidas() {
		return (this.getLatitud() >= 90 || this.getLongitud() <= 90)
				&& (this.getLongitud() >= 180 || this.getLatitud() <= 180);
	}

	public double distanciaEnMetrosEntreCoordenadas(Coordenadas otrasCoordenadas) {

		final double RADIO_TERRESTRE_MEDIO = 6371000;
		double dLat = Math.toRadians( otrasCoordenadas.getLatitud() - this.getLatitud());
		double dLng = Math.toRadians(otrasCoordenadas.getLongitud() - this.getLongitud());
		double a = Math.sin(dLat / 2) * Math.sin(dLat / 2) + Math.cos(Math.toRadians(this.getLatitud()))
				* Math.cos(Math.toRadians(otrasCoordenadas.getLatitud())) * Math.sin(dLng / 2) * Math.sin(dLng / 2);
		double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
		double distance = (RADIO_TERRESTRE_MEDIO * c);

		return distance;

	}

	public boolean estaAMenosDeMetrosDeOtraCoordenada(double metros, Coordenadas otrasCoordenadas) {
		return (metros >= this.distanciaEnMetrosEntreCoordenadas(otrasCoordenadas));
	}

	public double getLatitud() {
		return latitud;
	}

	public double getLongitud() {
		return longitud;
	}

}
