package com.cosmeticos.clientes.modelo.repositorios;

import com.cosmeticos.clientes.modelo.entidades.Cliente;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface ClienteRepositorio extends Repository<Cliente, Long> {
    List<Cliente> findAll();

    @Query(value = "select * from cosmeticos.clientes", nativeQuery = true)
    List<Cliente> traerTodo();

    @Modifying
    @Transactional
    @Query(value = "INSERT INTO cosmeticos.clientes (nombre, correo, telefono) VALUES (:nombre, :email, :telf)", nativeQuery = true)
    void insertarCliente(String nombre, String email, String telf);
}

