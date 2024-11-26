package com.progmulti.proyectofinal.sistema.taller.Modelos.Repositorios;

import javax.swing.JTable;

/**
 *
 * @author Victor Alejandro
 */
public interface Procesos{
   public void mantenimiento(Long codigo,String nombre, String accion);
   public void CargarTabla(JTable table,Long codigo,String nombre, String accion); 
}
