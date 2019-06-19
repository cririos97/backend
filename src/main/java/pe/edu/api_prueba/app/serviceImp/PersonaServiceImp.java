package pe.edu.api_prueba.app.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.api_prueba.app.dao.PersonaDao;
import pe.edu.api_prueba.app.entity.Persona;
import pe.edu.api_prueba.app.service.PersonaService;

@Service
public class PersonaServiceImp implements PersonaService{
	
	@Autowired
	private PersonaDao personaDao;

	@Override
	public List<Persona> findAll() {

		return (List<Persona>) personaDao.findAll();
	}

}
