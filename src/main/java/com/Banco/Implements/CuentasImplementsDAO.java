package com.Banco.Implements;

import com.Banco.DAO.CuentasDAO;
import com.Banco.Factory.ConnectionFactory;
import com.Banco.Modelo.id_cuenta;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Saul
 */
public class CuentasImplementsDAO extends ConnectionFactory implements CuentasDAO{

    @Override
    public void registrar(id_cuenta cuentas) throws Exception {
        try {
            this.recuperaConexion();
            PreparedStatement statement = this.recuperaConexion().prepareStatement("INSERT INTO cuentas(nombreCliente) VALUES (?);");
            statement.setString(1, cuentas.getNombreCliente());
            
            statement.executeUpdate();
            statement.close();
        } catch (Exception e) {
            throw e;
        }
    }

    @Override
    public void modificar(id_cuenta cuentas) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void eliminar(id_cuenta cuentas) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<id_cuenta> listar() throws Exception {
        List<id_cuenta> lista = null;
        try {
             this.recuperaConexion();
            PreparedStatement statement = this.recuperaConexion().prepareStatement("SELECT * FROM Cuentas");
            
            lista = new ArrayList(); 
            ResultSet resultSet = statement.executeQuery();
            
            while(resultSet.next()){
                id_cuenta cuentas = new id_cuenta();
                cuentas.setId_cuenta(resultSet.getInt("id_cuenta"));
                cuentas.setNombreCliente(resultSet.getString("nombreCliente"));
                cuentas.setSaldo(resultSet.getFloat("saldo"));
                lista.add(cuentas);
            }
                
                resultSet.close();
                statement.close();
                
            
        } catch (Exception e) {
            throw e;
        }
        return lista;
    }

    @Override
    public List<id_cuenta> SaldoyNombre() throws Exception {
          List<id_cuenta> lista = null;
        try {
             this.recuperaConexion();
            PreparedStatement statement = this.recuperaConexion().prepareStatement("SELECT nombreCliente, saldo FROM Cuentas");
            
            lista = new ArrayList(); 
            ResultSet resultSet = statement.executeQuery();
            
            while(resultSet.next()){
                id_cuenta cuentas = new id_cuenta();
                cuentas.setNombreCliente(resultSet.getString("nombreCliente"));
                cuentas.setSaldo(resultSet.getFloat("saldo"));
                lista.add(cuentas);
            }
                
                resultSet.close();
                statement.close();
                
            
        } catch (Exception e) {
            throw e;
        }
        return lista;
    }
    
}
