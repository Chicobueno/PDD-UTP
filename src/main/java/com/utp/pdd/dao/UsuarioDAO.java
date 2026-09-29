package com.utp.pdd.dao;

import com.utp.pdd.dto.UsuarioDTO;
import java.sql.SQLException;
import java.util.List;

public interface UsuarioDAO {
    List<UsuarioDTO> listar() throws SQLException;
    UsuarioDTO buscarPorId(int id) throws SQLException;
}
