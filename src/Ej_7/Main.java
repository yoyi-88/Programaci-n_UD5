package Ej_7;


import Ej_3.Persona;

import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Persona pepe = new Persona("Pepe","gonzalez", 34);
        Persona mario = new Persona("Mario", "Ramírez", 28);
        Persona enzo = new Persona("enzo", "vaquero", 32);
        Persona izan = new Persona("izan", "ramirez", 23);
        Persona eizan = new Persona("eizan", "romero", 19);

        Set<Persona> personas = new TreeSet<>();
        personas.add(pepe);
        personas.add(mario);
        personas.add(enzo);
        personas.add(izan);
        personas.add(eizan);


        //Primera persona del conjunto
        Iterator<Persona> it = personas.iterator();
        if (it.hasNext()){
            System.out.println("Primero en el set: " + it.next());
        }

        SortedSet<Persona> ss = new TreeSet<>(personas);
        System.out.println("Primero en el SortedSet: " + ss.first());
        System.out.println("Ultimo en el SortedSet: " + ss.last());
        System.out.println("Anteriores a enzo: " + ss.headSet(enzo));



    }
}
