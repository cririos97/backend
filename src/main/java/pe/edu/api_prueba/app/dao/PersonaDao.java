package pe.edu.api_prueba.app.dao;

import org.springframework.data.repository.CrudRepository;

import pe.edu.api_prueba.app.entity.Persona;

public interface PersonaDao extends CrudRepository<Persona, Long>{

}
