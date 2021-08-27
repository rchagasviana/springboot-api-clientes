package com.api.cliente.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.cliente.entidades.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {

}
