package com.progmulti.proyectofinal.sistema.taller.Modelos.Repositorios;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Victor Alejandro
 */
public class RepositorioModelos implements Procesos{
    Conexion cone = new Conexion();
    @Override
    public void mantenimiento(Long codigo, String nombre, String accion) {
       try{
        Connection conn = cone.obtenerConexion();
        CallableStatement cmd = conn.prepareCall("{CALL sp_GestionModelos(?,?,?)}");
        
        cmd.setLong(1,codigo);
        cmd.setString(2,nombre);
        cmd.setString(3,accion);
        
        cmd.execute();
        } 
    catch(Exception ex){
        JOptionPane.showMessageDialog(null, "Error: "+ ex);
    }    
    }

    @Override
    public void CargarTabla(JTable table, Long codigo, String nombre, String accion) {
        DefaultTableModel modelo = (DefaultTableModel) table.getModel();
        modelo.setRowCount(0);
        ResultSet rs;
        ResultSetMetaData rsmd;
        int columnas;
        
        try{
        Connection conn = cone.obtenerConexion();
        CallableStatement cmd = conn.prepareCall("{CALL sp_GestionModelos(?,?,?)}");
        
        cmd.setLong(1,codigo);
        cmd.setString(2,nombre);
        cmd.setString(3,accion);
        
        rs = cmd.executeQuery();
        rsmd = rs.getMetaData();
        columnas = rsmd.getColumnCount();
        
        while(rs.next()){
        Object [] fila = new Object[columnas];
        for(int i=0;i<columnas;i++){
            fila[i]= rs.getObject(i+1);
        }
        modelo.addRow(fila);
        }
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Error: "+ ex);
        }
    }
    
}
