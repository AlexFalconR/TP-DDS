package dds.tpanual;

import java.time.DayOfWeek;
import java.time.LocalTime;

public class Horario {

	 private DayOfWeek dia;
	 private int horaApertura;
	 private int minApertura;
	 private int horaCierre;
	 private int minCierre;
	 
	 public Horario(DayOfWeek _dia, int _horaApertura, int _minApertura, int _horaCierre, int _minCierre){
		 this.dia = _dia;
		 this.horaApertura = _horaApertura;
		 this.minApertura = _minApertura;
		 this.horaCierre = _horaCierre;
		 this.minCierre = _minCierre;
	 }
	 
	 public void setDia(DayOfWeek _dia) {
			this.dia = _dia;
	}
	 
	 public DayOfWeek getDia() {
			return dia;
	}
	
	 public boolean turnoDisponible(LocalTime horario){
		 return horario.isAfter(LocalTime.of(horaApertura, minApertura)) && horario.isBefore(LocalTime.of(horaCierre, minCierre));
	 }
}
