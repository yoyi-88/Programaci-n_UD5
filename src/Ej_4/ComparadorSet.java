package Ej_4;

import com.sun.source.tree.Tree;

import java.util.*;
import java.util.Iterator;
import java.util.TreeSet;
import java.util.Random;
public class ComparadorSet {
    public static void main(String[] args) {


        // Crear instancias de cada tipo de Set
        Set<String> hashSet = new HashSet<>();
        Set<String> treeSet = new TreeSet<>();
        Set<String> linkedHashSet = new LinkedHashSet<>();

        SortedSet<Integer> aleatorio = new TreeSet<>();
        aleatorio.addAll(Arrays.asList(2,5,8,34,95,62,51));
        System.out.println(aleatorio);
        Iterator<Integer> itRemove = aleatorio.iterator();
        Integer e;
        while(itRemove.hasNext()){
            e = itRemove.next();
            if (e%2==0){
                itRemove.remove();
            }
            //aleatorio.add(1000);
        }
        System.out.println(aleatorio);

        // Agregar elementos a cada Set
        String[] elementos = {"Java", "Python", "C++", "JavaScript", "Ruby", "Java"};
        for (String elemento : elementos) {
            hashSet.add(elemento);
            treeSet.add(elemento);
            linkedHashSet.add(elemento);
        }

        // Imprimir cada Set
        System.out.println("HashSet: " + hashSet);
        System.out.println("TreeSet: " + treeSet);
        System.out.println("LinkedHashSet: " + linkedHashSet);

        // Parte 5, iteración básica
        mostrarElementosConIterador(hashSet);
        mostrarElementosConIterador(treeSet);
        mostrarElementosConIterador(linkedHashSet);

        // Medir tiempo de inserción para cada Set
        medirTiempoInsercion(new HashSet<>());
        medirTiempoInsercion(new TreeSet<>());
        medirTiempoInsercion(new LinkedHashSet<>());
    }

    private static void medirTiempoInsercion(Set<Integer> set) {
        long inicio = System.nanoTime();
        for (int i = 0; i < 100000; i++) {
            set.add(i);
        }
        long fin = System.nanoTime();
        System.out.println("Tiempo de inserción para " + set.getClass().getSimpleName() + ": " + (fin - inicio) + " ns");

    }

    public static void mostrarElementosConIterador(Set<String> s){
        Iterator<String> it = s.iterator();
        System.out.println(s.getClass().getSimpleName());
        int i = 1;
        while (it.hasNext()){
            System.out.println("Elemento: #" + it.next());
        }
    }



}
