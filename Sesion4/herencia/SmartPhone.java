package Sesion4.herencia;

import Sesion4.clases.SmartDevice;

public class SmartPhone extends SmartDevice {

    //1. Atributos clase hija SmartPhone

    public String sistemaoperativo;
    public String conectividad;

    //2. Constructores

    public SmartPhone() {      //Vacio
    }

    public SmartPhone(String marca, String modelo, double precio, String sistemaoperativo, String conectividad) {  //Con todos los parámetros
        super(marca, modelo, precio);
        this.sistemaoperativo = sistemaoperativo;
        this.conectividad = conectividad;
    }
}
