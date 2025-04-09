package Ejemplos;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class EjemploListIterator {
    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>();
        lista.add(1);
        lista.add(2);
        lista.add(3);

        ListIterator<Integer> it = lista.listIterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println(it.previous());
    }
}
