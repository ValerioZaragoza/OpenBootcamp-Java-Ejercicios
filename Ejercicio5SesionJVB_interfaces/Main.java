package Sesion45.interfaces;

public class Main {

    static CocheCRUD cocheCrud = new CocheCRUDImpl();

    public static void main(String[] args) {


//Creando un objeto coche

        Coche coche1 = new Coche("Gris","Ford","Mustang");

//Llamando a cada uno de los métodos

        cocheCrud.save(coche1);

        cocheCrud.findAll();

        cocheCrud.delete(coche1);

        /**README
         * Ejercicio 5
         *
         * Crear una interfaz CocheCRUD.
         *
         * Crear una implementación CocheCRUDImpl que implemente la interfaz CocheCRUD.
         *
         * Como métodos de CocheCRUD podemos poner:
         *
         * save()
         * findAll()
         * delete() que simplemente impriman por consola el nombre del propio método.
         *
         *
         * Desde una clase Main, Crear un objeto de tipo CocheCRUDImpl y llamar a cada uno de los métodos.
         *
         * Ejemplo: CocheCRUD cocheCrud = new CocheCRUDImpl()
         */



    }
}
