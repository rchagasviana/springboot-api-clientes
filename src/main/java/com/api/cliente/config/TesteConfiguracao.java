package com.api.cliente.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.api.cliente.entidades.Usuario;
import com.api.cliente.repositories.UsuarioRepository;

@Configuration
@Profile("test")
public class TesteConfiguracao implements CommandLineRunner {
	
	//Somente para popular o banco de dados
	
	@Autowired
	private UsuarioRepository usuarioRepository;

	@Override
	public void run(String... args) throws Exception {
		
		Usuario usuario1 = new  Usuario(null,"Rafael","rchagas.sdi@gmail.com","123456","98998989898");
		Usuario usuario2 = new  Usuario(null,"Marcello","mpedro@gmail.com","203030123456","9797979797");
		Usuario usuario3 = new  Usuario(null,"Danielle","dani@gmail.com","564554545451589","787854181");
		
		//Salvar os usuários na base de dados
		usuarioRepository.saveAll(Arrays.asList(usuario1,usuario2,usuario3));		
		
		
	} 

}
