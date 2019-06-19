package pe.edu.api_prueba.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.edu.api_prueba.app.entity.Usuario;
import pe.edu.api_prueba.app.service.UsuarioService;

@RestController
@CrossOrigin(origins = { "http://localhost:4200" })
public class UsuarioController {
	
	@Autowired
	private UsuarioService usuarioService;
	
	
	@GetMapping("usuarios")
	public List<Usuario> listAll() {
		return usuarioService.findAll();
	}

}
