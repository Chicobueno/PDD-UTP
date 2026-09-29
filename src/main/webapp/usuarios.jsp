<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <title>Usuarios</title>
    <style>
        body { font-family: Arial, sans-serif; max-width: 1000px; margin: 40px auto; }
        table { width:100%; border-collapse:collapse; }
        th, td { border:1px solid #ddd; padding:10px; text-align:left; }
        th { background:#0e7490; color:white; }
        .btn { display:inline-block; margin-top:15px; padding:9px 14px; background:#0e7490; color:white; text-decoration:none; border-radius:5px; }
    </style>
</head>
<body>
    <h1>Listado de usuarios</h1>

    <table>
        <thead>
            <tr>
                <th>ID</th>
                <th>Nombre</th>
                <th>Correo</th>
                <th>Rol</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach var="usuario" items="${usuarios}">
                <tr>
                    <td>${usuario.idUsuario}</td>
                    <td>${usuario.nombre}</td>
                    <td>${usuario.correo}</td>
                    <td>${usuario.rol}</td>
                </tr>
            </c:forEach>
        </tbody>
    </table>

    <c:if test="${empty usuarios}">
        <p>No existen usuarios registrados.</p>
    </c:if>

    <a class="btn" href="${pageContext.request.contextPath}/">Volver</a>
</body>
</html>
