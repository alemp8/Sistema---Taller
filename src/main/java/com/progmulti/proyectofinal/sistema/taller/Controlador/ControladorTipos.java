/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.progmulti.proyectofinal.sistema.taller.Controlador;

import com.progmulti.proyectofinal.sistema.taller.Modelos.Repositorios.RepositorioTipos;
import java.util.List;
import javax.swing.JTable;

/**
 *
 * @author Victor Alejandro
 */
public class ControladorTipos {

    RepositorioTipos repo = new RepositorioTipos();

    public void Guardar(Long codigo, String nombre) {
        if (codigo == 0) {
            repo.mantenimiento(codigo, nombre, "Guardar");
        } else {
            repo.mantenimiento(codigo, nombre, "Actualizar");
        }
    }

    public void Lista(JTable table, Long codigo, String nombre) {
        repo.CargarTabla(table, codigo, nombre, "Leer");
    }

    public void Eliminar(Long codigo, String nombre) {
        repo.mantenimiento(codigo, nombre, "Eliminar");
    }

}
