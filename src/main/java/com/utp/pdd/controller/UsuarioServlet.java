package com.utp.pdd.controller;

import com.utp.pdd.dto.UsuarioDTO;
import com.utp.pdd.facade.UsuarioFacade;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet("/usuarios")
public class UsuarioServlet extends HttpServlet {

    private final UsuarioFacade facade = new UsuarioFacade();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        try {
            String idParametro = request.getParameter("id");

            if (idParametro != null && !idParametro.isBlank()) {
                int id = Integer.parseInt(idParametro);
                UsuarioDTO resultado = facade.obtenerUsuario(id);

                request.setAttribute("resultado", resultado);
                request.getRequestDispatcher("/usuario.jsp").forward(request, response);
            } else {
                List<UsuarioDTO> usuarios = facade.listarUsuarios();

                request.setAttribute("usuarios", usuarios);
                request.getRequestDispatcher("/usuarios.jsp").forward(request, response);
            }

        } catch (NumberFormatException e) {
            response.sendError(HttpServletResponse.SC_BAD_REQUEST, "El ID debe ser numérico.");
        } catch (SQLException e) {
            throw new ServletException("No fue posible acceder a la base de datos.", e);
        }
    }
}
