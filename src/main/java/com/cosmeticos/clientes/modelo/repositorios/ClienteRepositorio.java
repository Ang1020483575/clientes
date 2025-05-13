package com.cosmeticos.clientes.modelo.repositorios;

import com.cosmeticos.clientes.modelo.entidades.Cliente;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;

import java.util.List;

public interface ClienteRepositorio extends Repository<Cliente, Long> {
    List<Cliente> findAll();

    @Query(value = "select * from cosmeticos.clientes", nativeQuery = true)
    List<Cliente> traerTodo();
}
