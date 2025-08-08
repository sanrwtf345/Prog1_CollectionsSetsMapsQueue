package ejemplos_sets.collections;

import ejemplos_sets.enums.Marcas;
import ejemplos_sets.models.Auto;

import java.util.Set;
import java.util.TreeSet;

public class EjTreeSet {

  public static void main(String[] args) {

    Auto auto1 = new Auto("1", "rojo", 2015, 563256, "Focus", Marcas.FORD);
    Auto auto2 = new Auto("2", "negro", 2019, 16000, "Sandero", Marcas.RENAULT);
    Auto auto3 = new Auto("5", "azul", 2022, 158000, "Etios", Marcas.TOYOTA);
    Auto auto4 = new Auto("8", "blanco", 2017, 64892, "Gol", Marcas.VW);

    //una forma de agregar
    //Set<Auto> treeSetAutos = Set.of(auto1, auto2, auto3, auto4);

    //forma de agregar de a uno
    Set<Auto> treeSetAutos = new TreeSet<>();
    treeSetAutos.add(auto1);
    treeSetAutos.add(auto2);
    treeSetAutos.add(auto3);
    treeSetAutos.add(auto4);

    for (Auto auto : treeSetAutos){
      System.out.println(auto.toString());
    }



  }
}
