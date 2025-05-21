package com.cosmeticos.clientes.controlador;

import com.cosmeticos.clientes.modelo.entidades.Cliente;
import com.cosmeticos.clientes.servicios.ClienteServicio;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
public class  ClienteControlador {

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

    @PostMapping ("/insertarCliente")
    public void insertarCliente(@RequestBody Cliente cliente){
        clienteServicio.insertarCliente(cliente);
    }

    @PutMapping("/actualizarCliente")
    public void actualizarCliente (@RequestBody Cliente cliente){
        clienteServicio.actualizarCliente(cliente);
    }


}
