package com.api.cliente.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import com.api.cliente.entidades.Usuario;


public interface UsuarioRepository  extends JpaRepository<Usuario, Long>{

}
