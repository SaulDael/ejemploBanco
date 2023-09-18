package com.Banco.Pruebas;

import com.Banco.Modelo.id_cuenta;

public class PruebaCuentas {
    public static void main(String[] args) {

        id_cuenta cuentas = new id_cuenta();
        cuentas.setNombreCliente("Saul Dael Guzman Hernandez");
        System.out.println(cuentas.getNombreCliente());

    }

}
