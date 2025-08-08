package ejemplos_sets.collections;

import ejemplos_sets.enums.Marcas;
import ejemplos_sets.models.Auto;

import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

public class EjMaps {

  public static void main(String[] args) {

    Auto auto1 = new Auto("1", "rojo", 2015, 563256, "Focus", Marcas.FORD);
    Auto auto2 = new Auto("2", "negro", 2019, 16000, "Sandero", Marcas.RENAULT);
    Auto auto3 = new Auto("5", "azul", 2022, 158000, "Etios", Marcas.TOYOTA);
    Auto auto4 = new Auto("8", "blanco", 2017, 64892, "Gol", Marcas.VW);

    //mapa de doble entrada: Integer, Valor: List<Auto>
    HashMap<Integer, List<Auto>> mapaAutos = new HashMap<>();

    HashMap<String, Auto> mapaAutosPorPatente = new HashMap<>();

    //agrego elementos con put
    mapaAutosPorPatente.put("2", auto2);
    mapaAutosPorPatente.put("5", auto3);

    //para verificar si esta un elemento por su clave
    System.out.println("Esta el auto con patente 9? ");
    System.out.println(mapaAutosPorPatente.containsKey("9"));

    //para verificar si esta un elemento por valor
    System.out.println("Esta el auto2? ");
    System.out.println(mapaAutosPorPatente.containsValue(auto2));

    //para obtener elemento por clave
    System.out.println(mapaAutosPorPatente.get("5"));

    //para recorrer el mapa (pares atributo-valor)
    //por cada put que use tengo una entrada en el mapa (1 par atributo-valor)

    for (Entry<String, Auto> fila : mapaAutosPorPatente.entrySet()) {
      //puedo mostrar el atributo y el valor de cada entrada
      System.out.println("Patente: " + fila.getKey());

      System.out.println("Auto: " + fila.getValue());

    }

  }
}
