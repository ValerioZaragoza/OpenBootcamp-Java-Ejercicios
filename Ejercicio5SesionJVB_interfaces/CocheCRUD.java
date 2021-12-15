package Sesion45.interfaces;

import java.util.List;

public interface CocheCRUD {

    /* Las interface SOLO DECLARAN MÉTODOS, no los implementan.
    Proporcionan una manera común de hacer algo, son como "contratos tipo",
    "órdenes" que hay que hacer.
     */

    //MÉTODOS:

   void save(Coche coche);     //Declaro que guarde un coche

   List<Coche> findAll();      //Declaro que encuentre un coche

   void delete (Coche coche);  //Declaro que borre un coche

}
