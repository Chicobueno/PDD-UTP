package com.utp.pdd.facade;

import com.utp.pdd.dao.UsuarioDAO;
import com.utp.pdd.dao.UsuarioDAOImpl;
import com.utp.pdd.dto.UsuarioDTO;
import java.sql.SQLException;
import java.util.List;

public class UsuarioFacade {

    private final UsuarioDAO usuarioDAO;

    public UsuarioFacade() {
        this.usuarioDAO = new UsuarioDAOImpl();
    }

    public List<UsuarioDTO> listarUsuarios() throws SQLException {
        return usuarioDAO.listar();
    }

    public UsuarioDTO obtenerUsuario(int id) throws SQLException {
        return usuarioDAO.buscarPorId(id);
    }
}
