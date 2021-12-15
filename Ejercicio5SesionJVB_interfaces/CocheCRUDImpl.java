package Sesion45.interfaces;

/*Creo una implementación mediante una clase llamada CocheCRUDImpl
añadiendo "implements"+nombre de la interface tras el nombre de esta clase.
Me da fallo, paso por encima de CocheCRUD con el cursor y en la ventana
selecciono Implement methods, con lo que IntelliJ me genera los métodos vacíos,
listos para rellenarlos.
 */


import java.util.List;

public class CocheCRUDImpl implements CocheCRUD{


    @Override
    public void save(Coche coche) {
        System.out.println("Método save");

    }

    @Override
    public List<Coche> findAll() {
        System.out.println("Método findAll");
        return null;

    }

    @Override
    public void delete(Coche coche) {
        System.out.println("Método delete");

    }
}
