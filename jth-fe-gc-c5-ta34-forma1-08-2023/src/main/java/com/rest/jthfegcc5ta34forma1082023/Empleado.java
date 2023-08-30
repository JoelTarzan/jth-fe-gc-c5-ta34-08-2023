package com.rest.jthfegcc5ta34forma1082023;

public class Empleado {

	// Atributos
	private int id;
	private String nombre;
	private Trabajo trabajo;
	private double salario;

	// Constructores
	public Empleado() {
		this.id = 0;
		this.nombre = "";
		this.trabajo = Trabajo.PROGRAMADOR;
		this.salario = 0;
	}

	public Empleado(int id, String nombre, Trabajo trabajo, double salario) {
		this.id = id;
		this.nombre = nombre;
		this.trabajo = trabajo;
		this.salario = salario;
	}

	// Métodos
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Trabajo getTrabajo() {
		return trabajo;
	}

	public void setTrabajo(Trabajo trabajo) {
		this.trabajo = trabajo;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	@Override
	public String toString() {
		return "Id: " + id + " | Nombre: " + nombre + " | Trabajo: " + trabajo + " | Salario: " + salario;
	}
}