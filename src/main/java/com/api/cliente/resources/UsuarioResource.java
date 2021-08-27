package com.api.cliente.resources;

import java.util.List;

import javax.persistence.Entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.cliente.entidades.Usuario;
import com.api.cliente.services.UsuarioService;



@RestController
@RequestMapping(value = "/usuarios")
public class UsuarioResource {
	
	@Autowired
	private UsuarioService servicoUsuario;
	
	
	@GetMapping
	public ResponseEntity<List<Usuario>> buscarTodos(){
		
		//Usuario usuario = new Usuario(1L,"Rafael","rchagas.sdi@gmail.com","123455","1010101010");	
		
		List<Usuario> listaUsuarios = servicoUsuario.buscarTodos();
		
		return ResponseEntity.ok().body(listaUsuarios);
		
	}

}
