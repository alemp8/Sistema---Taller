package com.progmulti.proyectofinal.sistema.taller.Modelos.Repositorios;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conexion {
    
    private Connection con = null;
    private String usuario = "root";  
    private String password = "12345";  
    private String db = "taller";  
    private String puerto = "3306"; 

    public Connection obtenerConexion() {
        try {
            String cadena = "jdbc:mysql://localhost:" + puerto + "/" + db + "?useSSL=false&serverTimezone=UTC";
            con = DriverManager.getConnection(cadena, usuario, password);
            System.out.println("Conexión exitosa con MySQL");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de conexión: " + ex.getMessage());
        }
        return con;
    }
}
