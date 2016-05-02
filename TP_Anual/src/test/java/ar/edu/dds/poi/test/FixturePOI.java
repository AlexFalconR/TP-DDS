package ar.edu.dds.poi.test;

// public class POITest {
//
//	POI facultad;
//	Direccion direccionFacultad;
//	Coordenadas coordenadasFacultad;
//
//	POI paradaLejanaDeColectivo;
//	Direccion direccionParadaLejanaDeColectivo;
//	Coordenadas coordenadasParadaLejanaDeColectivo;
//
//	ParadaDeColectivo paradaDeLaPuerta;
//	Direccion direccionParadaDeLaPuerta;
//	Coordenadas coordenadasParadaDeLaPuerta;
//	
//	ParadaDeColectivo paradaLejana;
//
//
//	POI POIsinNombre;	
//
//	private static final double DELTA_METROS = 10;
//
//	@Before
//	public void setUp() throws Exception {
//		coordenadasFacultad = new Coordenadas (-34.659850,-58.468225);
//		direccionFacultad = new Direccion("Mozart",2300,"Av. Santiago De Compostela","Saraza",1407,"CABA","Barrio Nogera","Buenos Aires", "Argentina");
//		facultad = new POI("Facultad", coordenadasFacultad,direccionFacultad);
//
//		coordenadasParadaLejanaDeColectivo = new Coordenadas (-34.660891,-58.467635);
//		direccionParadaLejanaDeColectivo = new Direccion("Saraza",4223,"Pasaje", "Av. Castañares", 1407,"CABA","Barrio Nogera","Buenos Aires", "Argentina");
//		paradaLejanaDeColectivo = new POI("Parada Lejana", coordenadasParadaLejanaDeColectivo, direccionParadaLejanaDeColectivo);
//		
//		coordenadasParadaDeLaPuerta = new Coordenadas(-34.659894,-58.4683);
//		direccionParadaDeLaPuerta = new Direccion("Mozart",2392,"Av. Santiago De Compostela","Saraza",1407,"CABA","Barrio Nogera","Buenos Aires", "Argentina");
//		paradaDeLaPuerta = new ParadaDeColectivo("Parada de la puerta", coordenadasParadaDeLaPuerta, direccionParadaDeLaPuerta);
//		
//		paradaLejana = new ParadaDeColectivo("Parada Lejana", coordenadasParadaLejanaDeColectivo, direccionParadaLejanaDeColectivo);
//		
//		
//
//
//		//POIsinNombre = new POI("",,); 
//	}
//
//	@Test
//	public void testDistanciaFacultadAParadaLejanaDeColectivo() {
//		assertEquals (127.8, facultad.distanciaHasta(paradaLejanaDeColectivo),DELTA_METROS);
//	}
//
//	@Test
//	public void testUnPOISeEncuentraAMenosDe1000Metros() {
//		assertTrue(facultad.estaAMenosDeMetros(1000, paradaLejanaDeColectivo));
//	}
//
//	@Test
//	public void testUnPOISeEncuentraAMenosDe400Metros() {
//		assertTrue(facultad.estaAMenosDeMetros(400,paradaLejanaDeColectivo));
//	}
//
//	@Test
//	public void testEsValido() {
//		assertTrue(facultad.esValido());
//	}
//
//	//	@Test
//	//	public void testUnPOINoTieneNombreEntoncesNoEsValido() {
//	//		assertFalse(POIsinNombre.esValido());
//	//	}
//
//	//	@Test
//	//	public void testUnaParadaDeBondiDebeEstarAMenosDe100Metros() {
//	//		assertTrue(facultad.estaCerca(paradaDeLaPuerta));
//	//	}
//
//	@Test
//	public void testUnPOIaMenosDe500MetrosEstaCerca () {
//		assertTrue(facultad.estaCerca(paradaLejanaDeColectivo));
//	}
//
//	
//	@Test
//	public void testUnaParadaDeColectivoAMasDeUnaCuadraNoEsCercana () {
//		assertFalse (paradaLejana.estaCerca(facultad));
//	}
//	
//	@Test
//	public void testLaParadaDeLaPuertaEstaA5Metros() {
//		assertEquals (1, facultad.distanciaHasta(paradaDeLaPuerta),DELTA_METROS);
//
//	}
//	
//	
//	@Test
//	public void testUnaParadaDeColectivoAMenosDeUnaCuadraEsCercana() {
//		assertTrue(paradaDeLaPuerta.estaCerca(facultad));
//	}