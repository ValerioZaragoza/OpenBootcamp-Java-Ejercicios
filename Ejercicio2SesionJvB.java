public class Ejercicio2SesionJvB {

    //Crear una función que reciba un precio y devuelva el precio con IVA incluido

    public static void main(String[] args) {

        double precio = 32.32d;
        double precioFinal = precioConIva(precio);

        System.out.println( "El precio es" + precio);
        System.out.println("El precio con IVA es " + precioFinal);
        System.out.println("El precio con IVA es " + precioConIva(precio)); //Otra forma, sin crear precioFinal

    }
    static double precioConIva(double precio){   //Función que calcula el IVA
        return precio*1.21;
    }
}