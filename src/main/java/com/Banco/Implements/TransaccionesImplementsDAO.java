/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Banco.Implements;

import com.Banco.DAO.TransaccionesDAO;
import com.Banco.Factory.ConnectionFactory;
import com.Banco.Modelo.Transacciones;
import java.sql.PreparedStatement;
import java.util.List;

/**
 *
 * @author Saul
 */
public class TransaccionesImplementsDAO extends ConnectionFactory implements TransaccionesDAO{

    @Override
    public void depositar(Transacciones transacciones) throws Exception {
          try {
            this.recuperaConexion();
            PreparedStatement statement = this.recuperaConexion().prepareCall("{call deposito(?, ?)}");
            statement.setInt(1, transacciones.getId_cuenta());
            statement.setFloat(2, transacciones.getMonto());
            
            statement.executeUpdate();
            statement.close();
        } catch (Exception e) {
            throw e;
        }
    }

    @Override
    public void retirar(Transacciones transacciones) throws Exception {
        try {
            this.recuperaConexion();
            PreparedStatement statement = this.recuperaConexion().prepareCall("{call retiros(?, ?)}");
            statement.setInt(1, transacciones.getId_cuenta());
            statement.setFloat(2, transacciones.getMonto());
            
            statement.executeUpdate();
            statement.close();
        } catch (Exception e) {
            throw e;
        }
    }

    @Override
    public List<Transacciones> listar() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
