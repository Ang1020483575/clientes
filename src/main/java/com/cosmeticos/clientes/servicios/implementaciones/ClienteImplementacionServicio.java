package com.cosmeticos.clientes.servicios.implementaciones;

import com.cosmeticos.clientes.modelo.repositorios.ClienteRepositorio;
import com.cosmeticos.clientes.modelo.entidades.Cliente;
import com.cosmeticos.clientes.servicios.ClienteServicio;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ClienteImplementacionServicio implements ClienteServicio {

    private final ClienteRepositorio clienteRepositorio;

    public ClienteImplementacionServicio(ClienteRepositorio clienteRepositorio){
        this.clienteRepositorio = clienteRepositorio;
    }

    @Override
    public List<Cliente> getTodosClientes(){
        return clienteRepositorio.findAll();
    }

    @Override
    public List<Cliente> getTodosClientesManual(){
        return clienteRepositorio.traerTodo();
    }

    @Override
    public void insertarCliente(Cliente cliente){
         clienteRepositorio.insertarCliente(cliente.getNombre(),cliente.getCorreo(),cliente.getTelefono());
    }
}
