package com.progmulti.proyectofinal.sistema.taller;

import com.progmulti.proyectofinal.sistema.taller.Vistas.Usuarios;

/**
 *
 * @author Victor Alejandro
 */
public class SistemaTaller {

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {               
                new Usuarios().setVisible(true);
            }
        });
    }
}
