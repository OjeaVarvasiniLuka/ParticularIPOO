package CodigosApunte.ClaseYObjeto;

public class Main {

    public static void main(String[] args) {
        // Creación de instancias (objetos)
        Auto auto1 = new Auto();
        Auto auto2 = new Auto();
        Auto auto3 = new Auto();

        // Asignación de valores a los atributos
        auto1.color = "Verde";
        auto1.marca = "Chevrolet";
        auto1.modelo = 1986;
        auto1.cantidadPuertas = 3;
        auto1.combustible = "Nafta";

        auto2.color = "Azul";
        auto2.marca = "Ford";
        auto2.modelo = 2018;
        auto2.cantidadPuertas = 5;
        auto2.combustible = "Gas";

        auto3.color = "Rojo";
        auto3.marca = "Toyota";
        auto3.modelo = 2020;
        auto3.cantidadPuertas = 5;
        auto3.combustible = "Electricidad";

        System.out.println("El auto 1 es un " + auto1.marca + " de color " + auto1.color + ", modelo " + auto1.modelo + ", con " + auto1.cantidadPuertas + " puertas y funciona con " + auto1.combustible + ".");
        System.out.println("El auto 2 es un " + auto2.marca + " de color " + auto2.color + ", modelo " + auto2.modelo + ", con " + auto2.cantidadPuertas + " puertas y funciona con " + auto2.combustible + ".");
        System.out.println("El auto 3 es un " + auto3.marca + " de color " + auto3.color + ", modelo " + auto3.modelo + ", con " + auto3.cantidadPuertas + " puertas y funciona con " + auto3.combustible + ".");
    }
}
