package com.progmulti.proyectofinal.sistema.taller.Modelos.Repositorios;

import com.progmulti.proyectofinal.sistema.taller.Modelos.Usuario;
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
public class RepositorioUsuarios implements Metodos<Usuario> {

    Conexion cone = new Conexion();

    @Override
    public void Guardar(Usuario entidad) {
        try {
            Connection conn = cone.obtenerConexion();
            PreparedStatement ps = conn.prepareStatement("INSERT INTO Usuarios(nombre,correo,telefono,clave) Values (?,?,?,?)");
            ps.setString(1, entidad.getNombre());
            ps.setString(2, entidad.getCorreo());
            ps.setString(3, entidad.getTelefono());
            ps.setString(4, entidad.getClave());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Registro exitoso");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.toString());
        }
    }

    @Override
    public void Modificar(Usuario entidad) {
        try {
            Connection conn = cone.obtenerConexion();
            PreparedStatement ps = conn.prepareStatement("UPDATE Usuarios SET nombre = ?, correo = ?, telefono = ?,  clave = ? WHERE idUsuario = ?");
            ps.setString(1, entidad.getNombre());
            ps.setString(2, entidad.getCorreo());
            ps.setString(3, entidad.getTelefono());
            ps.setString(4, entidad.getClave());
            ps.setLong(5, entidad.getIdUsuario());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Registro exitoso");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.toString());
        }
    }

    @Override
    public List<Usuario> lista() {
        List<Usuario> usuarios = new ArrayList<>();
        try {
            Connection conn = cone.obtenerConexion();
            String sql = "SELECT idUsuario, nombre,correo,telefono,clave FROM Usuarios";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Usuario usuario = new Usuario();
                usuario.setIdUsuario(rs.getLong("idUsuario"));
                usuario.setNombre(rs.getString("nombre"));
                usuario.setCorreo(rs.getString("correo"));
                usuario.setTelefono(rs.getString("telefono"));
                usuario.setClave(rs.getString("clave"));
                usuarios.add(usuario);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error al obtener los usuarios: " + ex.toString());
        }

        return usuarios;
    }

    @Override
    public List<Usuario> buscar(String parametro) {
        List<Usuario> usuarios = new ArrayList<>();
        try {
            Connection conn = cone.obtenerConexion();
            String sql = "SELECT idUsuario, nombre, correo, telefono, clave FROM Usuarios WHERE nombre LIKE ? OR correo LIKE ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            String parametroBusqueda = "%" + parametro + "%";
            ps.setString(1, parametroBusqueda);  
            ps.setString(2, parametroBusqueda);  
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Usuario usuario = new Usuario();
                usuario.setIdUsuario(rs.getLong("idUsuario"));
                usuario.setNombre(rs.getString("nombre"));
                usuario.setCorreo(rs.getString("correo"));
                usuario.setTelefono(rs.getString("telefono"));
                usuario.setClave(rs.getString("clave"));
                usuarios.add(usuario);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error al buscar los usuarios: " + ex.toString());
        }
        return usuarios;
    }

    @Override
    public void Eliminar(Long id) {
        try {
            Connection conn = cone.obtenerConexion();
            PreparedStatement ps = conn.prepareStatement("DELETE FROM Usuarios WHERE idUsuario = ?");
            ps.setLong(1, id);
            ps.executeUpdate();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.toString());
        }
    }

}
