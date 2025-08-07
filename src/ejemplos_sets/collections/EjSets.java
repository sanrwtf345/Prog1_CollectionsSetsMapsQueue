package ejemplos_sets.collections;

import ejemplos_sets.enums.Marcas;
import ejemplos_sets.models.Auto;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class EjSets {
  public static void main(String[] args) {

    Auto auto1 = new Auto("1", "rojo", 2015, 563256, "Focus", Marcas.FORD);
    Auto auto2 = new Auto("2", "negro", 2019, 16000, "Sandero", Marcas.RENAULT);
    Auto auto3 = new Auto("5", "azul", 2022, 158000, "Etios", Marcas.TOYOTA);
    Auto auto4 = new Auto("8", "blanco", 2017, 64892, "Gol", Marcas.VW);

    //creo set
    Set<Auto> setAutos = new HashSet<>();
    //agrego elementos
    //si agrego duplicados no seran agrgados gracias a la comparacion
    setAutos.add(auto4);
    setAutos.add(auto1);
    setAutos.add(auto2);
    setAutos.add(auto3);
    setAutos.add(auto4);
    //recorro y muestro
    System.out.println("Recorro el set con un for");

    mostrarAutos(setAutos);

    System.out.println("Recorro con el iterator");
    Iterator<Auto> it = setAutos.iterator();
    while (it.hasNext()){
      Auto a = it.next();
      System.out.println(a.toString());
    }

    //ver si contiene un elemento
    System.out.println("Esta el etios en lalista?" + setAutos.contains(auto2));

    setAutos.clear();
    System.out.println("Recorro luego del clear para ver si se borraron los elementos");
    mostrarAutos(setAutos);

  }

  private static void mostrarAutos(Set<Auto> setAutos) {
    for (Auto a : setAutos){
      System.out.println(a.toString());
    }
  }
}
