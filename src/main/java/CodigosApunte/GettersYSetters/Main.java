package CodigosApunte.GettersYSetters;

public class Main {

    public static void main(String[] args) {
        // Creación de instancias (objetos)
        Auto auto1 = new Auto();

        //Usamos el constructor con todos los parametros
        Auto auto2 = new Auto("Azul", "Ford", 2018, 5, "Gas");

        //Usamos el constructor con algunos parametros
        Auto auto3 = new Auto("Toyota", 2020, 5);

        //Esto nos muestra que el constructor vacio, crea un objeto con atributos nulos o en 0
        // Vemos que como los atributos son privados, no podemos acceder a ellos directamente
        // Por eso es que usamos los getters para obtener sus valores
        System.out.println("El auto 1 es un " + auto1.getMarca() + " de color " + auto1.getColor() + ", modelo " + auto1.getModelo() + ", con " + auto1.getCantidadPuertas() + " puertas y funciona con " + auto1.getCombustible() + ".");

        // Asignación de valores a los atributos del auto1
        // Como los atributos son privados, usamos los setters para asignar los valores
        auto1.setColor("Verde");
        auto1.setMarca("Chevrolet");
        auto1.setModelo(1986);
        auto1.setCantidadPuertas(3);
        auto1.setCombustible("Nafta");

        //Ahora si mostramos el auto1 nuevamente, ya con los atributos asignados
        System.out.println("El auto 1 es un " + auto1.getMarca() + " de color " + auto1.getColor() + ", modelo " + auto1.getModelo() + ", con " + auto1.getCantidadPuertas() + " puertas y funciona con " + auto1.getCombustible() + ".");
        // Mostramos los otros autos creados con los constructores
        System.out.println("El auto 2 es un " + auto2.getMarca() + " de color " + auto2.getColor() + ", modelo " + auto2.getModelo() + ", con " + auto2.getCantidadPuertas() + " puertas y funciona con " + auto2.getCombustible() + ".");
        System.out.println("El auto 3 es un " + auto3.getMarca() + " de color " + auto3.getColor() + ", modelo " + auto3.getModelo() + ", con " + auto3.getCantidadPuertas() + " puertas y funciona con " + auto3.getCombustible() + ".");
    }
}
