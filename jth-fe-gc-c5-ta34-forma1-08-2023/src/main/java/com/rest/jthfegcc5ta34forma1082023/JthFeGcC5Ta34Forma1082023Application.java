package com.rest.jthfegcc5ta34forma1082023;

import java.util.ArrayList;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;

@SpringBootApplication
@RestController
public class JthFeGcC5Ta34Forma1082023Application {

	private ArrayList<Empleado> empleados = new ArrayList<Empleado>();

	public static void main(String[] args) {
		SpringApplication.run(JthFeGcC5Ta34Forma1082023Application.class, args);
	}

	@GetMapping("/empleados")
	public String getAll() {
		Gson gson = new Gson();
		String json = gson.toJson(empleados);

		return json;
	}

	@PostMapping("/crear-empleado")
	public void create(@RequestBody String empleadoJson) {
		Gson gson = new Gson();
		Empleado empleado = gson.fromJson(empleadoJson, Empleado.class);

		switch (empleado.getTrabajo()) {
			case PROGRAMADOR:
				empleado.setSalario(3000);
				break;
	
			case BOMBERO:
				empleado.setSalario(4000);
				break;
	
			case PESCADERO:
				empleado.setSalario(2000);
				break;
	
			case JUEZ:
				empleado.setSalario(5000);
				break;
	
			default:
				empleado.setSalario(900);
				break;
		}

		empleados.add(empleado);
	}

	@PutMapping("/empleado/{id}")
	public void update(@PathVariable int id, @RequestBody String empleadoJson) {
		Gson gson = new Gson();
		Empleado empleadoActualizado = gson.fromJson(empleadoJson, Empleado.class);

		for (Empleado empleado: empleados) {
			if (empleado.getId() == id) {

				empleado.setNombre(empleadoActualizado.getNombre());
				empleado.setTrabajo(empleadoActualizado.getTrabajo());            

				switch (empleado.getTrabajo()) {
					case PROGRAMADOR:
						empleado.setSalario(3000);
						break;
					case BOMBERO:
						empleado.setSalario(4000);
						break;
					case PESCADERO:
						empleado.setSalario(2000);
						break;
					case JUEZ:
						empleado.setSalario(5000);
						break;
					default:
						empleado.setSalario(900);
						break;
				}

			}
		}
	}
	
	@DeleteMapping("/empleado/{id}")
	public void delete(@PathVariable int id) {
		for (int i = 0; i < empleados.size(); i++) {
			
			if (empleados.get(i).getId() == id) {
				empleados.remove(i);
				break;
			}
		}
	}
}