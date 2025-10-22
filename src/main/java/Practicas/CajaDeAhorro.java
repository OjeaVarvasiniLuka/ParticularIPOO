package Practicas;

import java.util.Date;

public class CajaDeAhorro extends CuentaBancaria {

    public CajaDeAhorro() {

    }

    public CajaDeAhorro(String titular) {
        setTitular(titular);
        setSaldo(0.0);
        this.fechaCreacion = new Date();
    }

    public double extraer(double unMonto) {
        if (unMonto <= getSaldo()) {
            setSaldo(getSaldo() - unMonto);
        } else {
            System.out.println("Saldo insuficiente.");
        }
        return getSaldo();
    }

    public double depositar(double unMonto) {
        setSaldo(getSaldo() + unMonto);
        return getSaldo();
    }

    public double saldo() {
        return getSaldo();
    }

    public String nombreTitular() {
        return getTitular();
    }

}
