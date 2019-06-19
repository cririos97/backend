package pe.edu.api_prueba.app.dao;

import org.springframework.data.repository.CrudRepository;

import pe.edu.api_prueba.app.entity.Usuario;

public interface UsuarioDao extends CrudRepository<Usuario, Long>{

}
