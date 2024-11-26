
package com.progmulti.proyectofinal.sistema.taller.Controlador;

import com.progmulti.proyectofinal.sistema.taller.Modelos.Repositorios.RepositorioModelos;
import javax.swing.JTable;

/**
 *
 * @author Victor Alejandro
 */
public class ControladorModelos {
    RepositorioModelos repo = new RepositorioModelos();
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
