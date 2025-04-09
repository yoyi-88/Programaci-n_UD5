package Ej_11;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Aparatado 1
        LinkedList<String> ll = new LinkedList<>();
        ll.addLast("Lavar los platos");
        ll.addLast("Hacer la compra");
        ll.addLast("Estudiar Java");
        ll.addLast("Ir al gimnasio");
        ll.addLast("Leer un libro");

        // Apartado 2
        for (String pendientes: ll){
            System.out.println(pendientes);
        }

        // Apartado 3
        String nuevaTarea;
        System.out.print("Introduce una nueva tarea: ");
        nuevaTarea = sc.nextLine();
        ll.addLast(nuevaTarea);
        for (String pendientes: ll){
            System.out.println(pendientes);
        }

        // Apartado 4
        System.out.println("Tarea completada: " + ll.getFirst());
        ll.removeFirst();
        for (String pendientes: ll){
            System.out.println(pendientes);
        }

        // Apartado 5
        System.out.println("La proxima tarea que debe realizarse es: " + ll.getFirst());

        // Apartado 6
        String nuevaTareaUrgente;
        System.out.print("Introduce una nueva tarea urgente: ");
        nuevaTareaUrgente = sc.nextLine();
        ll.addFirst(nuevaTareaUrgente);

        // Apartado 7
        for (String pendientes: ll) {
            System.out.println(pendientes);
        }
    }
}
