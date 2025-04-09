package Ej_2;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set <String> nombresLinkedHashSet = new LinkedHashSet<>();
        Set <String> nombresHashSet = new HashSet<>();
        // Agregar nombres
        nombresLinkedHashSet.add("Yoyi");
        nombresLinkedHashSet.add("pere");
        nombresLinkedHashSet.add("pera");

        //  Imprimir nombres y ver tamaño del hash
        System.out.println(nombresLinkedHashSet);
        System.out.println("Tamaño: " + nombresLinkedHashSet.size());

        boolean agregar = nombresLinkedHashSet.add ("yoyi");
        System.out.println(agregar);
        System.out.println("Tamaño: " + nombresLinkedHashSet.size());

        nombresLinkedHashSet.add(null);
        System.out.println(nombresLinkedHashSet);
        nombresLinkedHashSet.add(null);
        System.out.println(nombresLinkedHashSet);// Sólo permite un null

        // foreach e iterator
        System.out.println("LinkedHashSet: ");
        imprimir(nombresLinkedHashSet);

        Iterator<String> it = nombresLinkedHashSet.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

        nombresHashSet.addAll(nombresLinkedHashSet);
        System.out.println("HashSet: ");

        imprimir(nombresHashSet);
    }
    /* Creamos una función para no tener que usar un for cada vez que queramos recorrer un
    nuevo HashSet*/
    static void imprimir (Set<String> s) {
        for (String nombre : s) {
            System.out.println("D. " + nombre);
        }

    }
}
