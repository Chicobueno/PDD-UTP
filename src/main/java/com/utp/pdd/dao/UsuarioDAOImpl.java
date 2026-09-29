package com.utp.pdd.dao;

import com.utp.pdd.dto.UsuarioDTO;
import com.utp.pdd.util.Conexion;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UsuarioDAOImpl implements UsuarioDAO {

    @Override
    public List<UsuarioDTO> listar() throws SQLException {
        List<UsuarioDTO> usuarios = new ArrayList<>();

        String sql = "SELECT id_usuario, nombre, correo, rol FROM usuario ORDER BY id_usuario";

        try (Connection cn = Conexion.getConnection();
             PreparedStatement ps = cn.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                usuarios.add(mapear(rs));
            }
        }

        return usuarios;
    }

    @Override
    public UsuarioDTO buscarPorId(int id) throws SQLException {
        String sql = "SELECT id_usuario, nombre, correo, rol FROM usuario WHERE id_usuario = ?";

        try (Connection cn = Conexion.getConnection();
             PreparedStatement ps = cn.prepareStatement(sql)) {

            ps.setInt(1, id);

            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    return mapear(rs);
                }
            }
        }

        return null;
    }

    private UsuarioDTO mapear(ResultSet rs) throws SQLException {
        return new UsuarioDTO(
            rs.getInt("id_usuario"),
            rs.getString("nombre"),
            rs.getString("correo"),
            rs.getString("rol")
        );
    }
}
