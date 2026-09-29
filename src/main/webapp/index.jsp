<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <title>PDD - UTP</title>
    <style>
        body { font-family: Arial, sans-serif; max-width: 900px; margin: 50px auto; }
        a { display:inline-block; margin:8px 0; padding:10px 16px; background:#0e7490; color:white; text-decoration:none; border-radius:6px; }
    </style>
</head>
<body>
    <h1>Aplicación PDD - UTP</h1>
    <p>Proyecto de práctica: DAO + DTO + Fachada + Controller + JSP/JSTL/EL.</p>
    <a href="${pageContext.request.contextPath}/usuarios">Ver usuarios</a>
    <br>
    <a href="${pageContext.request.contextPath}/usuarios?id=1">Buscar usuario ID 1</a>
</body>
</html>
