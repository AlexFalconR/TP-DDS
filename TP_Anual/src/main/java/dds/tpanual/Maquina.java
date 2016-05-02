package dds.tpanual;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Maquina extends POI{

	List <POI> listaDePOIs;

	public Maquina(String nombre, Coordenadas coordenadas, String barrio) {
		super(nombre, coordenadas, barrio);
		this.setListaDePOIs();
	}

	public List<POI> busquedaPorTextoLibre(String unTexto) {
		List<POI> resultadoBusquedaPorTexto = listaDePOIs.stream()
				.filter(unPOI -> unPOI.contienePalabraClave(unTexto))
				.collect(Collectors.toList());
		return resultadoBusquedaPorTexto;
	}

	public void agregarPOI(POI unPoi){
		listaDePOIs.add(unPoi);

	}

	public List<POI> getListaDePOIs() {
		return listaDePOIs;
	}

	public void setListaDePOIs() {
		this.listaDePOIs = new ArrayList<POI>();
	}
	
	@SuppressWarnings("unchecked")
	public void actualizacionDeCGP(String unTexto, CGPListaExterna cgpExterno) {
		CGP instanciaCgp = new CGP();
		int i = 0; 
		int f = 0;
		
		List<CGPListaExterna> cgps = cgpExterno.search(unTexto);
		List<POI> miNuevaLista = (List<POI>) cgps.stream().map(cgp -> instanciaCgp.modelarLista(cgp));
		while (this.dameUnElemento(miNuevaLista, f) != null){
			while (this.dameUnElemento(listaDePOIs, i) != null){
				if ( this.coincidenElementos(miNuevaLista, f , i) ){
					//this.actualizarLista();
					f ++;
					i = 0;
					
				}else{
					i++;
				}
			}
			listaDePOIs.add(dameUnElemento(miNuevaLista,f) );
			f++;
		}
		
	}
	
	public POI dameUnElemento (List<POI> unaLista, int posicion){
		return (unaLista.get(posicion)); 
	}
	
	public boolean coincidenElementos(List<POI> miNuevaLista, int f, int i){
		return (this.dameUnElemento(miNuevaLista, f).getNombre().equals(
				this.dameUnElemento(listaDePOIs, i).getNombre())  );
	
	}
}