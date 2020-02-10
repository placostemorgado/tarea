package com.placoste.api;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.placoste.entidad.Persona;
import com.placoste.modelo.Proceso;

@RestController
public class PersonaApi {
	@RequestMapping(value = "/personas", method = RequestMethod.GET)
	public List<Persona> listaPersonas() throws ParseException {
	List<Persona> lista = new ArrayList<Persona>();
	Persona p = new Persona();
	Proceso proceso = new Proceso();
	String fechaNacimiento = "26/05/1972";
	p.setNombre("Pedro");
	p.setApellidos("Lacoste");
	p.setNacimiento(fechaNacimiento);
	p.setEdad(proceso.calcularEdad(fechaNacimiento));
	p.setPoema(proceso.proximoCumpleanos(fechaNacimiento));
	lista.add(p);
	Persona p1 = new Persona();
	fechaNacimiento = "20/11/1973";
	p1.setNombre("Alejandra");
	p1.setApellidos("Reinoso");
	p1.setNacimiento(fechaNacimiento);
	p1.setEdad(proceso.calcularEdad(fechaNacimiento));
	p1.setPoema(proceso.proximoCumpleanos(fechaNacimiento));
	lista.add(p1);
	return lista;
	}
}