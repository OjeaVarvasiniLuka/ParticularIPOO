package Practicas;

import java.util.Date;

public class CuentaCorriente extends CuentaBancaria {

    private int maximoExtracciones;
    private int extraccionesHoy;

    public CuentaCorriente() {

    }

    public CuentaCorriente(String titular) {
        setTitular(titular);
        setSaldo(0.0);
        this.maximoExtracciones = 3;
        this.fechaCreacion = new Date();
        this.extraccionesHoy = 0;
    }

    public int getMaximoExtracciones() {
        return maximoExtracciones;
    }

    public void setMaximoExtracciones(int m) {
        this.maximoExtracciones = m;
    }

    public int getExtraccionesHoy() {
        return extraccionesHoy;
    }

    public void setExtraccionesHoy(int e) {
        this.extraccionesHoy = e;
    }

    public double extraer(double unMonto) {
        if (getExtraccionesHoy() <= getMaximoExtracciones()) {
            setSaldo(getSaldo() - unMonto);
            //Crear una transaccion, y guardarla en una lista de transacciones
            getTransacciones().add(new Transaccion(new Date(), unMonto, "extraccion"));
        } else {
            System.out.println("Ha superado el maximo de extracciones diarias.");
        }
        return getSaldo();
    }

}
