package com.api.cliente.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.cliente.entidades.Pedido;
import com.api.cliente.entidades.Usuario;
import com.api.cliente.repositories.PedidoRepository;

@Service
public class PedidoService {
	
	@Autowired
	private PedidoRepository repositorioPedido;
	
	
	public List<Pedido> buscarTodos(){
		return repositorioPedido.findAll();
	}
	
	public Pedido buscarPorId(Long id) {		
		Optional<Pedido> pedidoOptional = repositorioPedido.findById(id);		
		return pedidoOptional.get();
	}
	
	
	

}
