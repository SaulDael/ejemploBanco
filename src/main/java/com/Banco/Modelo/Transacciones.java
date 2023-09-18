/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Banco.Modelo;

import java.sql.Date;

/**
 *
 * @author Saul
 */
public class Transacciones {
    
    private int id_transaccion;
    private String tipo;
    private float monto;
    private Date fecha;
    private int id_cuenta;

    public Transacciones() {
    }

    public Transacciones(int id_transaccion, String tipo, float monto, Date fecha, int id_cuenta) {
        this.id_transaccion = id_transaccion;
        this.tipo = tipo;
        this.monto = monto;
        this.fecha = fecha;
        this.id_cuenta = id_cuenta;
    }
    
    

    public int getId_transaccion() {
        return id_transaccion;
    }

    public void setId_transaccion(int id_transaccion) {
        this.id_transaccion = id_transaccion;
    }

    public String getTipo() {
        return tipo;
    }

    public int getId_cuenta() {
        return id_cuenta;
    }

    public void setId_cuenta(int id_cuenta) {
        this.id_cuenta = id_cuenta;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public float getMonto() {
        return monto;
    }

    public void setMonto(float monto) {
        this.monto = monto;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }



    @Override
    public String toString() {
        return "Transacciones{" + "id_transaccion=" + id_transaccion + ", tipo=" + tipo + ", monto=" + monto + ", fecha=" + fecha + ", cuentas=" + id_cuenta + '}';
    }
    
    
}
