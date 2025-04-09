package Ejemplos;

import Ej_3.Persona;

import java.util.SortedSet;
import java.util.TreeSet;

public class EjemploComparable {
    public static void main(String[] args) {
        SortedSet<Persona> personas = new TreeSet<>();
        Persona yoyi = new Persona("ale", 50, 1.90);
        Persona rigoberto = new Persona("ale", 20, 1.65);
        personas.add(yoyi);
        personas.add(rigoberto);
        for (Persona p:
                personas){
            System.out.println(p);
        }

    }
}
