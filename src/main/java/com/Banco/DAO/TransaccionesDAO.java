/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.Banco.DAO;

import com.Banco.Modelo.Transacciones;
import java.util.List;

/**
 *
 * @author Saul
 */
public interface TransaccionesDAO {
    public void depositar (Transacciones transacciones) throws Exception;
    public void retirar (Transacciones transacciones) throws Exception;
    public List<Transacciones> listar() throws Exception;
}
