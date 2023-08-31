package com.rest.jthfegcc5ta34forma2082023.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rest.jthfegcc5ta34forma2082023.dao.IEmpleadoDAO;
import com.rest.jthfegcc5ta34forma2082023.dto.Empleado;
import com.rest.jthfegcc5ta34forma2082023.dto.Trabajo;

@Service
public class EmpleadoServiceImpl implements IEmpleadoService {

	@Autowired
	IEmpleadoDAO iEmpleadoDAO;
	
	@Override
	public List<Empleado> listarEmpleados() {
		
		return iEmpleadoDAO.findAll();
	}

	@Override
	public Empleado buscarEmpleadoPorId(int id) {
		
		return iEmpleadoDAO.findById(id).get();
	}
	
	@Override
	public List<Empleado> buscarEmpleadoPorTrabajo(Trabajo trabajo) {
		
		return iEmpleadoDAO.findByTrabajo(trabajo);
	}
	
	@Override
	public Empleado guardarEmpleado(Empleado empleado) {
		
		return iEmpleadoDAO.save(empleado);
	}

	@Override
	public Empleado actualizarEmpleado(Empleado empleado) {
		
		return iEmpleadoDAO.save(empleado);
	}

	@Override
	public void eliminarEmpleado(int id) {
		
		iEmpleadoDAO.deleteById(id);
	}
}