package Ej_3;

import java.util.Iterator;
import java.util.TreeSet;
import Ej_3.Persona;
public class Main {
    public static void main(String[] args) {
        TreeSet<Integer> conjunto = new TreeSet<>();
        conjunto.add(3);
        conjunto.add(1);
        conjunto.add(2);

        /*Directamente podemos imprimir el contenido, pero el ejercicio nos pide que recorramos
        el TreeSet*/
        System.out.println("Orden ascendente");
        System.out.println(conjunto);
        for (Integer numero:conjunto) {
            System.out.println(numero);
        }
        // Vamos a recorrerlo de forma inversa
        System.out.println("Orden descendente");
        Iterator<Integer> it = conjunto.descendingIterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

        System.out.println("Orden ascendente");
        TreeSet<String> alumnos = new TreeSet<>();
        alumnos.add("yoyi");
        alumnos.add("yoyi3");
        alumnos.add("yoyi2");

        for (String alumno:alumnos) {
            System.out.println(alumno);
        }

        System.out.println("Orden descendente");
        Iterator<String> itN = alumnos.descendingIterator();
        while (itN.hasNext()){
            System.out.println(itN.next());
        }
    }
}
