package com.progmulti.proyectofinal.sistema.taller.Modelos.Repositorios;

import java.util.List;

/**
 *
 * @author Victor Alejandro
 */
public interface Metodos <T> {
    public void Guardar(T entidad); 
    public void Modificar(T entidad);
    public List<T> lista();
    public List<T> buscar(String parametro);
    public void Eliminar(Long id);
}
