package com.utp.pdd.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public final class Conexion {

    private static final String URL =
            "jdbc:mysql://localhost:3306/pdd_utp"
            + "?useSSL=false"
            + "&serverTimezone=America/Lima"
            + "&allowPublicKeyRetrieval=true";

    private static final String USER = "root";
    private static final String PASSWORD = "";

    private Conexion() {
    }

    public static Connection getConnection() throws SQLException {
        try {
            // ESTA LÍNEA ES OBLIGATORIA EN TOMCAT PARA QUE ENCUENTRE EL DRIVER DE MYSQL
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new SQLException("No se encontró el driver de MySQL en el proyecto", e);
        }
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
