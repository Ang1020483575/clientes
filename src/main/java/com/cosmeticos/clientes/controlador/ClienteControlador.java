package com.cosmeticos.clientes.controlador;

import com.cosmeticos.clientes.modelo.entidades.Cliente;
import com.cosmeticos.clientes.servicios.ClienteServicio;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;

@RestController
public class ClienteControlador {

    private final ClienteServicio clienteServicio;

    public ClienteControlador(ClienteServicio clienteServicio){
        this.clienteServicio = clienteServicio;
    }

    @GetMapping("/clientes")
    public List<Cliente> getClientes(){
        return clienteServicio.getTodosClientes();
    }

    @GetMapping("/clientesManual")
    public List<Cliente> getClientesManual(){
        return clienteServicio.getTodosClientesManual();
    }
}
