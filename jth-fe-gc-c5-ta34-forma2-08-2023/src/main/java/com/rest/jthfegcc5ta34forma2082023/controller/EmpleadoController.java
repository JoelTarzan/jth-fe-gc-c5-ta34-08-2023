package com.rest.jthfegcc5ta34forma2082023.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rest.jthfegcc5ta34forma2082023.dto.Empleado;
import com.rest.jthfegcc5ta34forma2082023.dto.Trabajo;
import com.rest.jthfegcc5ta34forma2082023.service.EmpleadoServiceImpl;

@RestController
public class EmpleadoController {

	@Autowired
	EmpleadoServiceImpl empleadoServiceImpl;

	@GetMapping("/empleados")
	public List<Empleado> listarEmpleados() {

		return empleadoServiceImpl.listarEmpleados();
	}

	@GetMapping("/empleados/{id}")
	public Empleado buscarEmpleadoPorId(@PathVariable(name = "id") int id) {

		return empleadoServiceImpl.buscarEmpleadoPorId(id);
	}

	@GetMapping("/empleados/trabajo/{trabajo}")
	public List<Empleado> buscarEmpleadoPorTrabajo(@PathVariable(name = "trabajo") Trabajo trabajo) {

		return empleadoServiceImpl.buscarEmpleadoPorTrabajo(trabajo);
	}

	@PostMapping("/empleados")
	public Empleado guardarEmpleado(@RequestBody Empleado empleado) {

		switch (empleado.getTrabajo()) {
			case PROGRAMADOR:
				empleado.setSalario(2000);
				break;
	
			case BOMBERO:
				empleado.setSalario(3000);
				break;
	
			case JUEZ:
				empleado.setSalario(5000);
				break;
	
			case PESCADERO:
				empleado.setSalario(1000);
				break;
	
			default:
				empleado.setSalario(900);
				break;
		}

		return empleadoServiceImpl.guardarEmpleado(empleado);
	}

	@PutMapping("/empleados/{id}")
	public Empleado actualizarEmpleado(@PathVariable(name = "id") int id, @RequestBody Empleado empleado) {

		Empleado empleadoSeleccionado = new Empleado();
		Empleado empleadoActualizado = new Empleado();

		empleadoSeleccionado = empleadoServiceImpl.buscarEmpleadoPorId(id);

		empleadoSeleccionado.setNombre(empleado.getNombre());
		empleadoSeleccionado.setTrabajo(empleado.getTrabajo());

		switch (empleado.getTrabajo()) {
			case PROGRAMADOR:
				empleadoSeleccionado.setSalario(2000);
				break;
	
			case BOMBERO:
				empleadoSeleccionado.setSalario(3000);
				break;
	
			case JUEZ:
				empleadoSeleccionado.setSalario(5000);
				break;
	
			case PESCADERO:
				empleadoSeleccionado.setSalario(1000);
				break;
	
			default:
				empleadoSeleccionado.setSalario(900);
				break;
		}
		
		empleadoActualizado = empleadoServiceImpl.actualizarEmpleado(empleadoSeleccionado);
		
		return empleadoActualizado;
	}
	
	@DeleteMapping("/empleados/{id}")
	public void eliminarEmpleado(@PathVariable(name = "id") int id) {
		
		empleadoServiceImpl.eliminarEmpleado(id);
	}
}