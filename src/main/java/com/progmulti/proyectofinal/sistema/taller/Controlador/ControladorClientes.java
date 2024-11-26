package com.progmulti.proyectofinal.sistema.taller.Controlador;

import com.progmulti.proyectofinal.sistema.taller.Modelos.Cliente;
import com.progmulti.proyectofinal.sistema.taller.Modelos.Repositorios.RepositorioClientes;
import java.util.List;

/**
 *
 * @author Victor Alejandro
 */
public class ControladorClientes implements MetodosControlador<Cliente>{
    RepositorioClientes repo = new RepositorioClientes();
    
    @Override
    public void Guardar(Cliente entidad) {
      if(entidad.getIdCliente()==0){
      repo.Guardar(entidad);   
      }else{
      repo.Modificar(entidad);
      }
    }

    @Override
    public List<Cliente> Lista() {
       return repo.lista();
    }

    @Override
    public List<Cliente> Lista(String busqueda) {
        return repo.buscar(busqueda);
    }

    @Override
    public void Eliminar(Long id) {
        repo.Eliminar(id);
    }
    
}
