package Ej_10;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>();
        int n = 0;
        for(int i = 0; i != 10; i++){
            lista.add(n += 10);
        }

        System.out.println("Hacia delante:");
        ListIterator<Integer> lt = lista.listIterator();
        while (lt.hasNext()){
            Integer numero = lt.next();
            if (numero > 50){
                lt.set(numero*2);
            }
            if (numero < 30){
                lt.add(25);
                System.out.println("Elemento itroducido en el índice: " + lt.previousIndex());
            }
        }
        System.out.println(lista);
        System.out.println("Hacia atrás");
        while (lt.hasPrevious()){
            Integer numero = lt.previous();
            if (numero < 30){
                lt.add(25);
                System.out.println("Elemento itroducido en el índice: " + lt.previousIndex());
                if (lt.hasPrevious()){
                    lt.previous();
                }
            }
        }
        System.out.println(lista);

    }
}
