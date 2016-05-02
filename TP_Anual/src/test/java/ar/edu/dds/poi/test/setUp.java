package ar.edu.dds.poi.test;


import static java.time.DayOfWeek.FRIDAY;
import static java.time.DayOfWeek.MONDAY;
import static java.time.DayOfWeek.SATURDAY;
import static java.time.DayOfWeek.SUNDAY;
import static java.time.DayOfWeek.THURSDAY;
import static java.time.DayOfWeek.TUESDAY;
import static java.time.DayOfWeek.WEDNESDAY;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import dds.tpanual.CGP;
import dds.tpanual.CGPListaExterna;
import dds.tpanual.Coordenadas;
import dds.tpanual.Horario;
import dds.tpanual.LocalComercial;
import dds.tpanual.Maquina;
import dds.tpanual.POI;
import dds.tpanual.ParadaDeColectivo;
import dds.tpanual.Rubro;
import dds.tpanual.Servicio;
import dds.tpanual.SucursalBancaria;

public class setUp {

	POI facultad;
	Coordenadas coordenadasFacultad;

	ParadaDeColectivo paradaLejanaDeColectivo;
	Coordenadas coordenadasParadaLejanaDeColectivo;

	ParadaDeColectivo paradaDeLaPuerta114;
	Coordenadas coordenadasParadaDeLaPuerta114;

	SucursalBancaria bancoNacionLiniers;
	Coordenadas coordenadasBancoNacionLiniers;

	SucursalBancaria bancoPatagonia;
	Coordenadas coordenadasBancoPatagonia;

	LocalComercial luisito;
	Coordenadas coordenadasLuisito;
	Rubro comidaAlPaso;

	LocalComercial laBondiolita;
	Coordenadas coordenadasLaBondiolita;

	CGP cgp8;
	Coordenadas coordenadasCGP8;
	ArrayList<String> barriosComuna8;

	CGP cgp1;
	Coordenadas coordenadasCGP1;
	ArrayList<String> barriosComuna1;
	Servicio pension;
	Servicio jubilacion;
	Servicio supervivencia;
	Servicio cuil;

	//CGP CREADO PARA LA PRueBA DE BUSQUEDAD DE CGP EN REPOSITORIO EXTERNO
	Set<Servicio> serviciosQueOfrece = new HashSet<Servicio>();{
	serviciosQueOfrece.add(pension);
	serviciosQueOfrece.add(jubilacion);}
	Coordenadas coordenadasCGP3 = new Coordenadas(-34.603302, -58.397160);
	String barriosQueIncluye = "Balvanera, San Cristobal";
	
	CGPListaExterna objetoExterno = new CGPListaExterna ("cgp3", coordenadasCGP3, 3, "CABA",
			barriosQueIncluye, "Perez Ricardo", "Junín 521", "4375-0644/45", serviciosQueOfrece);

	List<CGPListaExterna> interfazExterna = new ArrayList<CGPListaExterna>();{
	interfazExterna.add(objetoExterno);}
	
	Maquina maquinaDeLaFacu;
	
		{Horario lunes1 = new Horario(MONDAY, 8, 00, 12, 45);
		Horario lunes2 = new Horario(MONDAY, 14, 00, 18, 30);
		Horario martes = new Horario(TUESDAY, 8, 00, 17, 15);
		Horario miercoles1 = new Horario(WEDNESDAY, 10, 00, 14, 45);
		Horario miercoles2 = new Horario(WEDNESDAY, 16, 00, 20, 30);
		Horario jueves = new Horario(THURSDAY, 8, 00, 17, 15);
		Horario viernes1 = new Horario(FRIDAY, 10, 00, 14, 45);
		Horario viernes2 = new Horario(FRIDAY, 16, 00, 20, 30);
		Horario sabado = new Horario(SATURDAY, 12, 00, 16, 15);
		Horario domingo = new Horario(SUNDAY, 9, 30, 15, 00);
		
		cuil = new Servicio("Cuil");
		cuil.setDiasDeAtencion(lunes1);
		cuil.setDiasDeAtencion(lunes2);
		cuil.setDiasDeAtencion(miercoles1);
		cuil.setDiasDeAtencion(miercoles2);
		cuil.setDiasDeAtencion(viernes1);
		cuil.setDiasDeAtencion(viernes2);
		pension = new Servicio("Pension");
		pension.setDiasDeAtencion(lunes1);
		pension.setDiasDeAtencion(lunes2);
		pension.setDiasDeAtencion(martes);
		jubilacion = new Servicio("Jubilacion");
		jubilacion.setDiasDeAtencion(miercoles1);
		jubilacion.setDiasDeAtencion(miercoles2);
		jubilacion.setDiasDeAtencion(jueves);
		supervivencia = new Servicio("Supervivencia");
		supervivencia.setDiasDeAtencion(viernes1);
		supervivencia.setDiasDeAtencion(viernes2);
		supervivencia.setDiasDeAtencion(sabado);

		coordenadasFacultad = new Coordenadas(-34.659850, -58.468225);
		facultad = new POI("Facultad", coordenadasFacultad, "Villa Lugano");

		coordenadasParadaLejanaDeColectivo = new Coordenadas(-34.660891, -58.467635);
		paradaLejanaDeColectivo = new ParadaDeColectivo("Parada Lejana de colectivo",
				coordenadasParadaLejanaDeColectivo, "Villa Lugano", 114);

		coordenadasParadaDeLaPuerta114 = new Coordenadas(-34.659894, -58.4683);
		paradaDeLaPuerta114 = new ParadaDeColectivo("Parada de la puerta", coordenadasParadaDeLaPuerta114, "Villa Lugano",114);

		coordenadasBancoNacionLiniers = new Coordenadas(-34.639079, -58.520456);
		bancoNacionLiniers = new SucursalBancaria("Banco La Nacion", coordenadasBancoNacionLiniers, "Liniers");
		bancoNacionLiniers.setServicios("Cobros");
		bancoNacionLiniers.setServicios("Pagos");
		
		coordenadasBancoPatagonia = new Coordenadas(-34.66219, -58.46898);
		bancoPatagonia = new SucursalBancaria("Banco Patagonia", coordenadasBancoPatagonia, "Villa Lugano");
		bancoPatagonia.setServicios("Prestamos");
		bancoPatagonia.setServicios("Hipotecas");
		
		coordenadasLuisito = new Coordenadas(-34.659804, -58.468533);
		comidaAlPaso = new Rubro(200,"comidaAlPaso");
		luisito = new LocalComercial("Luisito", coordenadasLuisito, "Villa Lugano", comidaAlPaso);
		luisito.setDiasDeAtencion(lunes1);
		luisito.setDiasDeAtencion(lunes2);
		luisito.setDiasDeAtencion(martes);
		luisito.setDiasDeAtencion(miercoles1);
		luisito.setDiasDeAtencion(miercoles2);

		coordenadasLaBondiolita = new Coordenadas(-34.680183, -58.44996);
		laBondiolita = new LocalComercial("La Bondiolita S.R.L.", coordenadasLaBondiolita, "Villa Lugano", comidaAlPaso);
		laBondiolita.setDiasDeAtencion(jueves);
		laBondiolita.setDiasDeAtencion(viernes1);
		laBondiolita.setDiasDeAtencion(viernes2);
		laBondiolita.setDiasDeAtencion(domingo);

		coordenadasCGP8 = new Coordenadas(-34.686048, -58.455480);
		barriosComuna8 = new ArrayList<String>();
		barriosComuna8.add("Villa Soldati");
		barriosComuna8.add("Villa Lugano");
		barriosComuna8.add("Villa Riachuelo");
		Set<Servicio> serviciosCGP8 = new HashSet<Servicio>();
		serviciosCGP8.add(pension);
		serviciosCGP8.add(jubilacion);
		cgp8 = new CGP("CGP 8", coordenadasCGP8, "Villa Lugano", 8,barriosComuna8,serviciosCGP8);
		

		coordenadasCGP1 = new Coordenadas(-34.600136, -58.386880);
		barriosComuna1 = new ArrayList<String>();
		barriosComuna1.add("Retiro");
		barriosComuna1.add("San Nicolas");
		barriosComuna1.add("Puerto Madero");
		barriosComuna1.add("San Telmo");
		barriosComuna1.add("Monserrat");
		barriosComuna1.add("Constitucion");
		Set<Servicio> serviciosCGP1 = new HashSet<Servicio>();
		serviciosCGP1.add(supervivencia);
		serviciosCGP1.add(cuil);
		cgp1 = new CGP("CGP 1", coordenadasCGP1, "San Nicolas", 1,barriosComuna1,serviciosCGP1);
	
		maquinaDeLaFacu = new Maquina("Maquina de la esquina", coordenadasFacultad, "Villa Lugano");
		
		maquinaDeLaFacu.agregarPOI(bancoNacionLiniers);
		maquinaDeLaFacu.agregarPOI(bancoPatagonia);
		maquinaDeLaFacu.agregarPOI(cgp1);
		maquinaDeLaFacu.agregarPOI(cgp8);
		maquinaDeLaFacu.agregarPOI(laBondiolita);
		maquinaDeLaFacu.agregarPOI(luisito);
		maquinaDeLaFacu.agregarPOI(paradaLejanaDeColectivo);
		maquinaDeLaFacu.agregarPOI(paradaDeLaPuerta114);	
		}	
}
