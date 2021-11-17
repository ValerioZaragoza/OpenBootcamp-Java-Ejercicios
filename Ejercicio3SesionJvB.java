public class Ejercicio3SesionJvB {

    /* Crear un bucle que permita concatenar textos e imprima el resultado
    final por consola, teniendo en cuenta que los textos puedan venir de un
    array tipo String. Por ejemplo: String [] = {"", "" , ""}
    Se puede usar el método concat o si no el operador +
    Ejemplo "Pepe", "Juan", "Anthony" Resultado:
     Pepe Juan Anthony (en la misma línea)
     */

    public static void main(String[] args) {

        String[] palabras = {"Palabra1", "Palabra2", "Palabra3"};
        String palabrota = "";

        for (int i = 0; i < palabras.length; i++) {

            palabrota = palabrota + " " + palabras[i];      //Se añade así misma cada uno de los valores de palabra[i]

            if (i + 1 == palabras.length) {                 //Si el index llega al final (=longitud 3) entonces imprime

                System.out.println(palabrota);
            }
        }
    }
}

