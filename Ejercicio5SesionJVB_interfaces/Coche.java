package Sesion45.interfaces;

public class Coche {

    // Creo la clase Coche

    //Atributos
    String color;
    String marca;
    String modelo;

    //Constructor vacio
    public Coche() {
    }
    //Constructor completo
    public Coche(String color, String marca, String modelo) {
        this.color = color;
        this.marca = marca;
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "Coche{" +
                "color='" + color + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                '}';
    }
}

