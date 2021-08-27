package com.api.cliente.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.cliente.entidades.Usuario;



@RestController
@RequestMapping(value = "/usuarios")
public class UsuarioResource {
	
	
	@GetMapping
	public ResponseEntity<Usuario> buscarTodos(){
		
		Usuario usuario = new Usuario(1L,"Rafael","rchagas.sdi@gmail.com","123455","1010101010");	
		return ResponseEntity.ok().body(usuario);
		
	}

}
