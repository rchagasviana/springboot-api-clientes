package com.api.cliente.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.cliente.entidades.Usuario;
import com.api.cliente.repositories.UsuarioRepository;



@Service
public class UsuarioService {
	
	@Autowired
	private UsuarioRepository repositorioUsuario;
	
	
	public List<Usuario> buscarTodos(){
		return repositorioUsuario.findAll();
	}
	
	public Usuario buscarPorId(Long id) {		
		Optional<Usuario> usuarioOptional = repositorioUsuario.findById(id);		
		return usuarioOptional.get();
	}

}
