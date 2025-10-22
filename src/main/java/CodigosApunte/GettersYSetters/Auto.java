package CodigosApunte.GettersYSetters;

public class Auto {

    // Atributos, lo correcto normalmente es ponerlos en private para no "Romper el encapsulamiento"
    private String color;
    private String marca;
    private int modelo;
    private int cantidadPuertas;
    private String combustible;

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
        this.color = "Rojo"; // Valor por defecto
        this.marca = marca;
        this.modelo = modelo;
        this.cantidadPuertas = cantidadPuertas;
        this.combustible = "Electricidad"; // Valor por defecto
    }

    // Getters y Setters
    //No tienen un orden en especifico, en este caso estan ordenados asi por comodidad.
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public int getCantidadPuertas() {
        return cantidadPuertas;
    }

    public void setCantidadPuertas(int cantidadPuertas) {
        this.cantidadPuertas = cantidadPuertas;
    }

    public String getCombustible() {
        return combustible;
    }

    public void setCombustible(String combustible) {
        this.combustible = combustible;
    }

    public void acelerar() {
        System.out.println("Pisando el acelerador del Auto");
    }
}
