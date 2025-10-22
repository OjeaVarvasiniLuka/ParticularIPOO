package CodigosApunte.HerenciaYPolimorfismo;

//En este caso, Auto es una subclase de Vehiculo, por lo tanto hereda sus atributos y metodos
public class Auto extends Vehiculo {

    // Atributos, lo correcto normalmente es ponerlos en private para no "Romper el encapsulamiento"
    //En este caso, como color, marca, modelo y combustible ya estan en la superclase Vehiculo, solo ponemos el atributo que es distintivo de esta subclase
    private int cantidadPuertas;

    // Constructor vacio
    // Se crea automáticamente si no se define ningún constructor
    // Sirve para crear objetos sin inicializar atributos
    public Auto() {
    }

    // Constructor con parámetros
    // Sirve para crear objetos inicializando sus atributos
    public Auto(String color, String marca, int modelo, int cantidadPuertas, String combustible) {
        //Dentro de este constructor usaremos los setters, en lugar de asignar directamente a los atributos
        //Aunque ambas son validas
        setColor(color);
        setMarca(marca);
        setModelo(modelo);
        setCantidadPuertas(cantidadPuertas);
        setCombustible(combustible);
    }

    //Constructor con algunos parametros
    //En este caso, digamos que queremos solo crear autos Rojos y electricos, entonces no necesitamos esos
    //parametros en el constructor, porque ya los sabemos
    public Auto(String marca, int modelo, int cantidadPuertas) {
        setColor("Rojo"); // Valor por defecto
        setMarca(marca);
        setModelo(modelo);
        this.cantidadPuertas = cantidadPuertas;
        setCombustible("Electricidad");// Valor por defecto
    }

    // Getters y Setters
    public int getCantidadPuertas() {
        return cantidadPuertas;
    }

    public void setCantidadPuertas(int cantidadPuertas) {
        this.cantidadPuertas = cantidadPuertas;
    }
}
