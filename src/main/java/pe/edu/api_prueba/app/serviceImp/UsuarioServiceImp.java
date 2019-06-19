package pe.edu.api_prueba.app.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.api_prueba.app.dao.UsuarioDao;
import pe.edu.api_prueba.app.entity.Usuario;
import pe.edu.api_prueba.app.service.UsuarioService;

@Service
public class UsuarioServiceImp implements UsuarioService{
	
	@Autowired
	private UsuarioDao usuarioDao;

	@Override
	public List<Usuario> findAll() {

		return (List<Usuario>) usuarioDao.findAll();
	}

}
