package app;

import Queue.*;

/**
 * @author Alejandra MArquez
 */
public class Main {

    private static Queue<Integer> queue;

    public static void main(String[] args) {
        queue = new QueueSimpleList<Integer>(5);
        
        queue.enqueue(7);
        queue.enqueue(8);
        queue.enqueue(1);
        queue.enqueue(1);
        queue.enqueue(4);
        System.out.println("Lista:");
        for (Integer i : queue) {
            System.out.print(i+" - ");
        }
        System.out.println("\n");
        System.out.println("Elemento eliminado: "+queue.dequeue());
        System.out.println("Siguiente a eliminar: "+queue.front());
        System.out.println("Último a eliminar: "+queue.last());
        System.out.println("Elemento eliminado: "+queue.dequeue());
        System.out.println("Siguiente a eliminar: "+queue.front());
        System.out.println("Último a eliminar: "+queue.last());
        queue.enqueue(4);
        queue.enqueue(5);
        queue.enqueue(9);  //Esta llamada produce un isFull exception
        System.out.println();
        System.out.println("Último a eliminar: "+queue.last());
        System.out.println("Elemento eliminado: "+queue.dequeue());
        System.out.println("Elemento eliminado: "+queue.dequeue());
        System.out.println("Elemento eliminado: "+queue.dequeue());
        System.out.println("Elemento eliminado: "+queue.dequeue());
        System.out.println("Elemento eliminado: "+queue.dequeue());
        System.out.println("Elemento eliminado: "+queue.dequeue()); //Esta llamada produce un isEmptyException
        System.out.println();
        System.out.println("Eliminando elementos de toda la lista . . . ");
        queue.removeAll();
        
        for (Integer i : queue) {
            System.out.print(i+" - ");
        }
        System.out.println("\n");
    }
}
