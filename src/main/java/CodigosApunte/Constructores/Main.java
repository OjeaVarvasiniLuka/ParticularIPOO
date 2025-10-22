package CodigosApunte.Constructores;

public class Main {

    public static void main(String[] args) {
        // Creación de instancias (objetos)
        Auto auto1 = new Auto();
        Auto auto2 = new Auto("Azul", "Ford", 2018, 5, "Gas");
        Auto auto3 = new Auto("Toyota", 2020, 5);

        System.out.println("El auto 1 es un " + auto1.marca + " de color " + auto1.color + ", modelo " + auto1.modelo + ", con " + auto1.cantidadPuertas + " puertas y funciona con " + auto1.combustible + ".");
        // Asignación de valores a los atributos
        auto1.color = "Verde";
        auto1.marca = "Chevrolet";
        auto1.modelo = 1986;
        auto1.cantidadPuertas = 3;
        auto1.combustible = "Nafta";

        System.out.println("El auto 1 es un " + auto1.marca + " de color " + auto1.color + ", modelo " + auto1.modelo + ", con " + auto1.cantidadPuertas + " puertas y funciona con " + auto1.combustible + ".");
        System.out.println("El auto 2 es un " + auto2.marca + " de color " + auto2.color + ", modelo " + auto2.modelo + ", con " + auto2.cantidadPuertas + " puertas y funciona con " + auto2.combustible + ".");
        System.out.println("El auto 3 es un " + auto3.marca + " de color " + auto3.color + ", modelo " + auto3.modelo + ", con " + auto3.cantidadPuertas + " puertas y funciona con " + auto3.combustible + ".");
    }
}
