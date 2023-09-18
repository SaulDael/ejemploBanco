package com.Banco.Pruebas;

import com.Banco.Factory.ConnectionFactory;

import java.sql.Connection;
import java.sql.SQLException;

public class PruebaConexion {
    public static void main(String[] args) throws SQLException {
        Connection connection = new ConnectionFactory().recuperaConexion();

        System.out.println("Cerrando Conexion");

        connection.close();
    }
}
