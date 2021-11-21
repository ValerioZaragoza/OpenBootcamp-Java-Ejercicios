package Sesion4.herencia;

import Sesion4.clases.SmartDevice;

public class SmartWatch extends SmartDevice {

    //1. Atributos clase hija Smartwatch

    public boolean simParaMusica;
    public String tipoDeCorrea;

    //2. Constructores

    public SmartWatch() {  //Constructor vacío
    }

    public SmartWatch(String marca, String modelo, double precio, boolean simParaMusica, String tipoDeCorrea) {  //Con todos los parámetros
        super(marca, modelo, precio);
        this.simParaMusica = simParaMusica;
        this.tipoDeCorrea = tipoDeCorrea;
    }
}
