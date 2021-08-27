package com.api.cliente.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
		List<Usuario> listaUsuarios = servicoUsuario.buscarTodos();		
		return ResponseEntity.ok().body(listaUsuarios);		
	}
	
	@GetMapping(value ="/{id}")
	public ResponseEntity <Usuario> buscarPorId(@PathVariable Long id){
		Usuario usuario = servicoUsuario.buscarPorId(id);
		return ResponseEntity.ok().body(usuario);
	}
	

}
