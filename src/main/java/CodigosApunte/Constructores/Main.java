package CodigosApunte.Constructores;

public class Main {

    public static void main(String[] args) {
        // Creación de instancias (objetos)
        Auto auto1 = new Auto();

        //Usamos el constructor con todos los parametros
        Auto auto2 = new Auto("Azul", "Ford", 2018, 5, "Gas");

        //Usamos el constructor con algunos parametros
        Auto auto3 = new Auto("Toyota", 2020, 5);

        //Esto nos muestra que el constructor vacio, crea un objeto con atributos nulos o en 0
        System.out.println("El auto 1 es un " + auto1.marca + " de color " + auto1.color + ", modelo " + auto1.modelo + ", con " + auto1.cantidadPuertas + " puertas y funciona con " + auto1.combustible + ".");

        // Asignación de valores a los atributos del auto1
        auto1.color = "Verde";
        auto1.marca = "Chevrolet";
        auto1.modelo = 1986;
        auto1.cantidadPuertas = 3;
        auto1.combustible = "Nafta";

        //Ahora si mostramos el auto1 nuevamente, ya con los atributos asignados
        System.out.println("El auto 1 es un " + auto1.marca + " de color " + auto1.color + ", modelo " + auto1.modelo + ", con " + auto1.cantidadPuertas + " puertas y funciona con " + auto1.combustible + ".");
        // Mostramos los otros autos creados con los constructores
        System.out.println("El auto 2 es un " + auto2.marca + " de color " + auto2.color + ", modelo " + auto2.modelo + ", con " + auto2.cantidadPuertas + " puertas y funciona con " + auto2.combustible + ".");
        System.out.println("El auto 3 es un " + auto3.marca + " de color " + auto3.color + ", modelo " + auto3.modelo + ", con " + auto3.cantidadPuertas + " puertas y funciona con " + auto3.combustible + ".");
    }
}
