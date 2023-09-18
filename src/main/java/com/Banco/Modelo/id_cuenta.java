package com.Banco.Modelo;

public class id_cuenta {

    private Integer id_cuenta;
    private String nombreCliente;
    private float saldo;

    public id_cuenta() {
    }

    public id_cuenta(Integer id_cuenta, String nombreCliente, float saldo) {
        this.id_cuenta = id_cuenta;
        this.nombreCliente = nombreCliente;
        this.saldo = saldo;
    }

    public Integer getId_cuenta() {
        return id_cuenta;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setId_cuenta(Integer id_cuenta) {
        this.id_cuenta = id_cuenta;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Cuentas{" +
                "ID de Cuenta: " + id_cuenta +
                ", Cliente: " + nombreCliente + '\'' +
                ", Su saldo es: " + saldo +
                '}';
    }

}
