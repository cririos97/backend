package pe.edu.api_prueba.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.edu.api_prueba.app.entity.Persona;
import pe.edu.api_prueba.app.service.PersonaService;

@RestController
@CrossOrigin(origins = { "http://localhost:4200" })
public class PersonaController {
	
	@Autowired
	private PersonaService personaService;
	
	@GetMapping("/personas")
	public List<Persona> listPersona(){
		return personaService.findAll();
	}

}
