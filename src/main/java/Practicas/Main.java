package Practicas;

public class Main {

    public static void main(String[] args) {
        CajaDeAhorro cuenta = new CajaDeAhorro("Juan Perez");
        System.out.println("Titular: " + cuenta.nombreTitular());
        System.out.println("Saldo inicial: " + cuenta.saldo());

        cuenta.depositar(1000);
        System.out.println("Saldo despues del deposito: " + cuenta.saldo());

        cuenta.extraer(500);
        System.out.println("Saldo despues de la extraccion: " + cuenta.saldo());

        cuenta.extraer(600); // Intento de extraccion con saldo insuficiente
        System.out.println("Saldo final: " + cuenta.saldo());
    }
}
