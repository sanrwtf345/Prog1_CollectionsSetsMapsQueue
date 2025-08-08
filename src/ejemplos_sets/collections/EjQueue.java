package ejemplos_sets.collections;

import ejemplos_sets.enums.Marcas;
import ejemplos_sets.models.Auto;

import java.util.ArrayDeque;
import java.util.Queue;

public class EjQueue {

  public static void main(String[] args) {

    Auto auto1 = new Auto("1", "rojo", 2015, 563256, "Focus", Marcas.FORD);
    Auto auto2 = new Auto("2", "negro", 2019, 16000, "Sandero", Marcas.RENAULT);
    Auto auto3 = new Auto("5", "azul", 2022, 158000, "Etios", Marcas.TOYOTA);
    Auto auto4 = new Auto("8", "blanco", 2017, 64892, "Gol", Marcas.VW);

    ArrayDeque<Auto> queueAutos = new ArrayDeque<>();
    //para agregar elementos uso add (collections)
    queueAutos.add(auto1);
    queueAutos.add(auto2);
    // para agregar elementos uso offer (Queue)
    queueAutos.offer(auto3);
    // agregar al principio de la cola
    queueAutos.offerFirst(auto4);
    //offerLast para agregar al final
    //RECORDAR en las colas no se pueden agregar objetos null
    //toma el primer elemento de la tabla
    System.out.println("Element: " + queueAutos.element().toString());
    System.out.println("Peek: " + queueAutos.peek().toString());
    System.out.println("Peek primero: " + queueAutos.peekFirst().toString());
    System.out.println("Peek ultimo: " + queueAutos.peekLast().toString());

    //el primer elemento que se agrego es el primero que se elimina
    while (!queueAutos.isEmpty()){
      //poll saca elementos de la cola
      System.out.println("Elimino con poll: " + queueAutos.poll().toString());
    }

    System.out.println("Esta vacia?" + queueAutos.isEmpty());

    /*
    para recorrer de forma tradicional
    for (Auto auto : queueAutos){
      System.out.println(auto.toString());
     */
    }
  }

