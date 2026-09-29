<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <title>Resultado</title>
    <style>
        body { font-family: Arial, sans-serif; max-width: 700px; margin: 40px auto; }
        .card { border:1px solid #ddd; border-radius:10px; padding:20px; }
        .btn { display:inline-block; margin-top:15px; padding:9px 14px; background:#0e7490; color:white; text-decoration:none; border-radius:5px; }
    </style>
</head>
<body>
    <h1>Resultado de búsqueda</h1>

    <c:choose>
        <c:when test="${not empty resultado}">
            <div class="card">
                <p><strong>ID:</strong> ${resultado.idUsuario}</p>
                <p><strong>Nombre:</strong> ${resultado.nombre}</p>
                <p><strong>Correo:</strong> ${resultado.correo}</p>
                <p><strong>Rol:</strong> ${resultado.rol}</p>
            </div>
        </c:when>
        <c:otherwise>
            <p>No se encontró el usuario solicitado.</p>
        </c:otherwise>
    </c:choose>

    <a class="btn" href="${pageContext.request.contextPath}/usuarios">Ver todos</a>
</body>
</html>
