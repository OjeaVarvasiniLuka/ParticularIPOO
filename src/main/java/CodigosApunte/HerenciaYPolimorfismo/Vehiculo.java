package CodigosApunte.HerenciaYPolimorfismo;

public class Vehiculo {

    private String color;
    private String marca;
    private int modelo;
    private String combustible;

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

    public String getCombustible() {
        return combustible;
    }

    public void setCombustible(String combustible) {
        this.combustible = combustible;
    }
}
