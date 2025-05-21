package com.cosmeticos.clientes.servicios;

import com.cosmeticos.clientes.modelo.entidades.Cliente;
import java.util.List;

public interface ClienteServicio {
    List<Cliente> getTodosClientes();
    List<Cliente> getTodosClientesManual();
    void insertarCliente(Cliente cliente);
}
