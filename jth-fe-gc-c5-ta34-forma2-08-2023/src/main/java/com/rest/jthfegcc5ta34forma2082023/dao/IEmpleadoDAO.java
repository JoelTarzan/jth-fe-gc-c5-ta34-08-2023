package com.rest.jthfegcc5ta34forma2082023.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rest.jthfegcc5ta34forma2082023.dto.Empleado;
import com.rest.jthfegcc5ta34forma2082023.dto.Trabajo;

public interface IEmpleadoDAO extends JpaRepository<Empleado, Integer>{

	// Listar por trabajo
	public List<Empleado> findByTrabajo(Trabajo trabajo);
}