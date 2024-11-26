package com.progmulti.proyectofinal.sistema.taller.Controlador;

import com.progmulti.proyectofinal.sistema.taller.Modelos.Repositorios.RepositorioUsuarios;
import com.progmulti.proyectofinal.sistema.taller.Modelos.Usuario;
import java.util.List;

/**
 *
 * @author Victor Alejandro
 */
public class ControladorUsuarios implements MetodosControlador<Usuario>{
    RepositorioUsuarios repo = new RepositorioUsuarios();
    
    @Override
    public void Guardar(Usuario entidad) {
      if(entidad.getIdUsuario()==0){
      repo.Guardar(entidad);   
      }else{
      repo.Modificar(entidad);
      }
    }
    
    @Override
    public List<Usuario> Lista() {
       return repo.lista();
    }

    @Override
    public List<Usuario> Lista(String busqueda) {
        return repo.buscar(busqueda);
    }

    @Override
    public void Eliminar(Long id) {
        repo.Eliminar(id);
    }
    
}
