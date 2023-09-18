package com.Banco.DAO;

import com.Banco.Modelo.id_cuenta;
import java.util.List;

/**
 *
 * @author Saul
 */
public interface CuentasDAO {
    
    public void registrar (id_cuenta cuentas) throws Exception;
    public void modificar (id_cuenta cuentas) throws Exception;
    public void eliminar (id_cuenta cuentas) throws Exception;
    public List<id_cuenta> listar() throws Exception;
    
    public List<id_cuenta> SaldoyNombre() throws Exception;
    
    
    
}
