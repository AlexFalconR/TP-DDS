package dds.tpanual;

import java.util.Set;

public class LocalComercial extends POI {

	private Rubro rubroDelLocal;

	public LocalComercial(String nombre, Coordenadas coordenada, String barrio, Rubro unRubro) {
		super(nombre, coordenada, barrio);
		this.setRubroDelLocal(unRubro);

	}
	
	@Override
	public Set<String> getPalabrasClave(){
		Set<String> palabrasClave = super.getPalabrasClave();
		palabrasClave.add(rubroDelLocal.getNombre());
		return palabrasClave;
	}

	public Rubro getRubroDelLocal() {
		return rubroDelLocal;
	}

	public void setRubroDelLocal(Rubro unRubro) {
		this.rubroDelLocal = unRubro;
	}
	
	@Override
	public double getRadioDeCercania() {
		return this.rubroDelLocal.getRadioDeCercania();
	}

}
