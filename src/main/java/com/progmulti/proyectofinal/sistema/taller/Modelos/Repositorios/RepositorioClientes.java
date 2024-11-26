package com.progmulti.proyectofinal.sistema.taller.Modelos.Repositorios;

import com.progmulti.proyectofinal.sistema.taller.Modelos.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Victor Alejandro
 */
public class RepositorioClientes implements Metodos<Cliente>{

     Conexion cone = new Conexion();
     
    @Override
    public List<Cliente> lista() {
        List<Cliente> clientes = new ArrayList<>();
        try {
            Connection conn = cone.obtenerConexion();
            String sql = "SELECT idCliente, nombre,correo,telefono,direccion FROM Clientes";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Cliente cliente = new Cliente();
                cliente.setIdCliente(rs.getLong("idCliente"));
                cliente.setNombre(rs.getString("nombre"));
                cliente.setCorreo(rs.getString("correo"));
                cliente.setTelefono(rs.getString("telefono"));
                cliente.setDireccion(rs.getString("direccion"));
                clientes.add(cliente);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error al obtener los usuarios: " + ex.toString());
        }

        return clientes; 
    }

    @Override
    public List<Cliente> buscar(String parametro) {
       List<Cliente> clientes = new ArrayList<>();
        try {
            Connection conn = cone.obtenerConexion();
            String sql = "SELECT idCliente, nombre,correo,telefono,direccion FROM Clientes WHERE nombre LIKE ? OR correo LIKE ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            String parametroBusqueda = "%" + parametro + "%";
            ps.setString(1, parametroBusqueda);  
            ps.setString(2, parametroBusqueda);  
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Cliente cliente = new Cliente();
                cliente.setIdCliente(rs.getLong("idCliente"));
                cliente.setNombre(rs.getString("nombre"));
                cliente.setCorreo(rs.getString("correo"));
                cliente.setTelefono(rs.getString("telefono"));
                cliente.setDireccion(rs.getString("direccion"));
                clientes.add(cliente);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error al obtener los usuarios: " + ex.toString());
        }
        return clientes; 
    }

    @Override
    public void Eliminar(Long id) {
       try {
            Connection conn = cone.obtenerConexion();
            PreparedStatement ps = conn.prepareStatement("DELETE FROM Clientes WHERE idCliente = ?");
            ps.setLong(1, id);
            ps.executeUpdate();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.toString());
        }
    }

    @Override
    public void Guardar(Cliente entidad) {
        try {
            Connection conn = cone.obtenerConexion();
            PreparedStatement ps = conn.prepareStatement("INSERT INTO Clientes(nombre,correo,telefono,direccion) Values (?,?,?,?)");
            ps.setString(1, entidad.getNombre());
            ps.setString(2, entidad.getCorreo());
            ps.setString(3, entidad.getTelefono());
            ps.setString(4, entidad.getDireccion());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Registro exitoso");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.toString());
        } 
    }

    @Override
    public void Modificar(Cliente entidad) {
        try {
            Connection conn = cone.obtenerConexion();
            PreparedStatement ps = conn.prepareStatement("UPDATE Clientes SET nombre = ?, correo = ?, telefono = ?,  direccion = ? WHERE idCliente = ?");
            ps.setString(1, entidad.getNombre());
            ps.setString(2, entidad.getCorreo());
            ps.setString(3, entidad.getTelefono());
            ps.setString(4, entidad.getDireccion());
            ps.setLong(5, entidad.getIdCliente());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Registro exitoso");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.toString());
        }
    }
    
}
