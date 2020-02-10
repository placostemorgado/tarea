package com.placoste.modelo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


public class Proceso {
	public String fechaHoy() {
		Date date = new Date();  
	    SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");  
	    String fecha= formatter.format(date);    
		return fecha;
	}
	
	public static String proximoCumpleanos(String nacimiento) throws ParseException {
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat anno = new SimpleDateFormat("yyyy");
		SimpleDateFormat mes = new SimpleDateFormat("MM");
		SimpleDateFormat dia = new SimpleDateFormat("dd");
		
		Calendar annoactual = Calendar.getInstance();
		int valoranno = annoactual.get(Calendar.YEAR);

		Proceso proceso = new Proceso();
		String fechaactual = proceso.fechaHoy();
		
		
		Date valorfechaactual=dateFormat.parse(fechaactual);
		Date valorfechacumpleanos=dateFormat.parse(nacimiento);
		
		int valorpasoanno=0;
		
		Date valornacimiento=dateFormat.parse(dia.format(valorfechacumpleanos)+"/"+mes.format(valorfechacumpleanos)+"/"+valoranno);
		
		int dias=(int) ((valornacimiento.getTime()-valorfechaactual.getTime())/86400000);
		if (dias<0) {	
			valorpasoanno = Integer.parseInt(anno.format(valorfechacumpleanos))+1;
			valornacimiento=dateFormat.parse(dia.format(valorfechacumpleanos)+"/"+mes.format(valorfechacumpleanos)+"/"+valorpasoanno);
			dias=(int) ((valornacimiento.getTime()-valorfechaactual.getTime())/86400000);
		}
		String mensaje = "Faltan "+dias+ " para el cumpleaños";
		return mensaje;
	}
	
	public static int calcularEdad(String nacimiento) throws ParseException {
		Proceso calcular = new Proceso();
		String fechaactual = calcular.fechaHoy();
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/mm/yyyy");
		Date fechaInicial=dateFormat.parse(nacimiento);
		Date fechaFinal=dateFormat.parse(fechaactual);
		int dias=(int) ((fechaFinal.getTime()-fechaInicial.getTime())/86400000);
		return dias/365;
	}

}
