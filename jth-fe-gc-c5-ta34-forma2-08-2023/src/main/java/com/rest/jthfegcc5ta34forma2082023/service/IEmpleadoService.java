package com.rest.jthfegcc5ta34forma2082023.service;

import java.util.List;

import com.rest.jthfegcc5ta34forma2082023.dto.Empleado;
import com.rest.jthfegcc5ta34forma2082023.dto.Trabajo;

public interface IEmpleadoService {

	// Get All
	public List<Empleado> listarEmpleados();
	
	// FindById
	public Empleado buscarEmpleadoPorId(int id);
	
	// FindByTrabajo
	public List<Empleado> buscarEmpleadoPorTrabajo(Trabajo trabajo);
	
	// Create
	public Empleado guardarEmpleado(Empleado empleado);
	
	// Update
	public Empleado actualizarEmpleado(Empleado empleado);
	
	// Delete
	public void eliminarEmpleado(int id);
}