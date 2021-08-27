package com.api.cliente.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.cliente.entidades.Pedido;
import com.api.cliente.entidades.Usuario;
import com.api.cliente.services.PedidoService;


@RestController
@RequestMapping(value="/pedidos")
public class PedidoResource {
	
	
	@Autowired
	private PedidoService servicoPedido;
			
	@GetMapping
	public ResponseEntity<List<Pedido>> buscarTodos(){
		List<Pedido> listaDePedido = servicoPedido.buscarTodos();
		return ResponseEntity.ok().body(listaDePedido);		
	}	
	
	@GetMapping(value ="/{id}")
	public ResponseEntity <Pedido> buscarPorId(@PathVariable Long id){
		Pedido pedido = servicoPedido.buscarPorId(id);
		return ResponseEntity.ok().body(pedido);
	}
	

}
