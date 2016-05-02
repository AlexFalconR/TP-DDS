package dds.tpanual;

public class Rubro {
	private double radioDeCercania;
	private String nombre;
	
	public Rubro(double unRadioDeCercania, String unNombre) {
		this.setRadioDeCercania(unRadioDeCercania);
		this.setNombre(unNombre);
	}

	public double getRadioDeCercania() {
		return radioDeCercania;
	}

	public void setRadioDeCercania(double radioDeCercania) {
		this.radioDeCercania = radioDeCercania;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
