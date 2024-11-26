/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.progmulti.proyectofinal.sistema.taller.Controlador;

import java.util.List;

/**
 *
 * @author Victor Alejandro
 */
public interface MetodosControlador <T> {
    public void Guardar(T entidad);
    public List<T> Lista();
    public List<T> Lista(String busqueda);
    public void Eliminar(Long id);
}
