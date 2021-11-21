package Sesion4.clases;

import Sesion4.herencia.SmartPhone;
import Sesion4.herencia.SmartWatch;

public class Main {

    public static void main(String[] args) {

    //Crea objetos de cada clase utilizando el constructor con parámetros

        SmartDevice iPhone = new SmartDevice("Iphone", "6S", 288);
        SmartPhone samsung = new SmartPhone("Samsung", "S9", 399.50, "Android", "5G");
        SmartWatch garming = new SmartWatch("Garmin", "Fénix", 399.90,false, "Silicona");


     //Impresión de valores por consola

        System.out.println("Objeto Clase Principal SmartDevice");
        System.out.print(iPhone.marca+ " ");
        System.out.print(iPhone.modelo+ " ");
        System.out.println(iPhone.precio);
        System.out.println();

        System.out.println("Objeto Clase Hija SmartPhone");
        System.out.print(samsung.marca+ " ");
        System.out.print(samsung.modelo+ " ");
        System.out.print(samsung.precio+ " ");
        System.out.print(samsung.sistemaoperativo+ " ");
        System.out.println(samsung.conectividad+ " ");
        System.out.println();

        System.out.println("Objeto Clase Hija SmartWatch");
        System.out.print(garming.marca+ " ");
        System.out.print(garming.modelo+ " ");
        System.out.print(garming.precio+ " ");
        System.out.print(garming.simParaMusica+ " ");
        System.out.println(garming.tipoDeCorrea+ " ");



    }

}


