package com.placoste.entidad;

public class Persona {
	  private String nombre;
	  private String apellidos;
	  private String nacimiento;
	  private int edad;
	  private String poema;
	  public Persona() {
	    super();
	  }
	  public Persona(String nombre, String apellidos, String nacimiento,int edad, String poema) {
	    super();
	    this.nombre = nombre;
	    this.apellidos = apellidos;
	    this.nacimiento = nacimiento;
	    this.edad = edad;
	    this.poema = poema;
	  }
	  public String getNombre() {
	    return nombre;
	  }
	  public void setNombre(String nombre) {
	    this.nombre = nombre;
	  }
	  public String getApellidos() {
	    return apellidos;
	  }
	  public void setApellidos(String apellidos) {
	    this.apellidos = apellidos;
	  }
	  public String getNacimiento() {
	    return nacimiento;
	  }
	  public void setNacimiento(String nacimiento) {
	    this.nacimiento = nacimiento;
	  }
	  
	  
	  
	  public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	
	public String getPoema() {
		return poema;
	}
	public void setPoema(String poema) {
		this.poema = poema;
	}
	public Persona(String nombre) {
	    super();
	    this.nombre = nombre;
	  }
}
	

