package CodigosApunte.HerenciaYPolimorfismo;

public class Moto extends Vehiculo {

    private int cilindrada;

    // Constructor vacio
    public Moto() {
    }

    // Constructor con parámetros
    public Moto(String color, String marca, int modelo, int cilindrada, String combustible) {
        setColor(color);
        setMarca(marca);
        setModelo(modelo);
        setCilindrada(cilindrada);
        setCombustible(combustible);
    }

    // Getters y Setters
    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    // Vemos que el metodo acelerar de esta subclase es diferente al de la superclase Vehiculo y la subclase Auto.
    public void acelerar() {
        System.out.println("Girando la muñeca para acelerar la moto");
    }
}
