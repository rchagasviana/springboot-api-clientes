package com.api.cliente.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.api.cliente.entidades.Pedido;
import com.api.cliente.entidades.Usuario;
import com.api.cliente.entidades.enums.StatusPedido;
import com.api.cliente.repositories.PedidoRepository;
import com.api.cliente.repositories.UsuarioRepository;

@Configuration
@Profile("test")
public class TesteConfiguracao implements CommandLineRunner {
	
	//Somente para popular o banco de dados
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@Autowired
	private PedidoRepository pedidoRepository;

	@Override
	public void run(String... args) throws Exception {
		
		Usuario usuario1 = new  Usuario(null,"Rafael","rchagas.sdi@gmail.com","123456","98998989898");
		Usuario usuario2 = new  Usuario(null,"Marcello","mpedro@gmail.com","203030123456","9797979797");
		Usuario usuario3 = new  Usuario(null,"Danielle","dani@gmail.com","564554545451589","787854181");
		
		
		Pedido pedido01 = new Pedido(null,Instant.parse("2021-08-27T11:46:07Z"),StatusPedido.AGUARDANDO_PAGAMENTO,usuario1);
		Pedido pedido02 = new Pedido(null,Instant.parse("2021-08-27T11:46:07Z"),StatusPedido.PAGO,usuario1);
		Pedido pedido03 = new Pedido(null,Instant.parse("2021-08-27T11:46:07Z"),StatusPedido.ENTREGUE,usuario2);
		Pedido pedido04 = new Pedido(null,Instant.parse("2021-08-27T11:46:07Z"),StatusPedido.CANCELADO,usuario3);
		
		
		//Salvar os usuários na base de dados
		usuarioRepository.saveAll(Arrays.asList(usuario1,usuario2,usuario3));			
		pedidoRepository.saveAll(Arrays.asList(pedido01,pedido02,pedido03,pedido04));
		
		
		
		
	} 

}
