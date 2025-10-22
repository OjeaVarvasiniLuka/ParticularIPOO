package Practicas;

import java.util.Date;
import java.util.List;

public abstract class CuentaBancaria {

    private String titular;
    private double saldo;
    private List<Transaccion> transacciones;

    Date fechaCreacion;

    public String getTitular() {
        return titular;
    }

    public void setTitular(String t) {
        this.titular = t;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double s) {
        this.saldo = s;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date f) {
        this.fechaCreacion = f;
    }

    public List<Transaccion> getTransacciones() {
        return transacciones;
    }

    public void setTransacciones(List<Transaccion> t) {
        this.transacciones = t;
    }

    public abstract double extraer(double unMonto);

    public double depositar(double unMonto) {
        setSaldo(getSaldo() + unMonto);
        //Crear una transaccion, y guardarla en una lista de transacciones
        transacciones.add(new Transaccion(new Date(), unMonto, "Deposito"));
        return getSaldo();
    }

    public double saldo() {
        return getSaldo();
    }

    public String nombreTitular() {
        return getTitular();
    }

}
