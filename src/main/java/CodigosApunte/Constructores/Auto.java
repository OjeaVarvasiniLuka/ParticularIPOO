package CodigosApunte.Constructores;

public class Auto {

    // Atributos, lo correcto normalmente es ponerlos en private
    String color;
    String marca;
    int modelo;
    int cantidadPuertas;
    String combustible;

    // Constructor vacio
    // Se crea automáticamente si no se define ningún constructor
    // Sirve para crear objetos sin inicializar atributos
    public Auto() {
    }

    // Constructor con parámetros
    // Sirve para crear objetos inicializando sus atributos
    public Auto(String color, String marca, int modelo, int cantidadPuertas, String combustible) {
        this.color = color;
        this.marca = marca;
        this.modelo = modelo;
        this.cantidadPuertas = cantidadPuertas;
        this.combustible = combustible;
    }

    //Constructor con algunos parametros
    //En este caso, digamos que queremos solo crear autos Rojos y electricos, entonces no necesitamos esos
    //parametros en el constructor, porque ya los sabemos
    public Auto(String marca, int modelo, int cantidadPuertas) {
        this.color = "Rojo"; // Valor por defecto
        this.marca = marca;
        this.modelo = modelo;
        this.cantidadPuertas = cantidadPuertas;
        this.combustible = "Electricidad"; // Valor por defecto
    }
}
