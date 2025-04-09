package Ej_6;

import Ej_3.Persona;

import java.util.SortedSet;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Persona yoel24 = new Persona("yoel", "gomezlvarez", 24);
        Persona yoel = new Persona("yoel", "benitez", 20);
        Persona rigobert = new Persona("rigobert", "alvarez", 21);

        System.out.println("Ordenar por edad");
        ComparadorPorEdad comparadorPorEdad = new ComparadorPorEdad();
        SortedSet<Persona> personas = new TreeSet<>(comparadorPorEdad);
        personas.add(yoel);
        personas.add(rigobert);
        personas.add(yoel24);
        for (Persona p: personas){
            System.out.println(p);
        }

        System.out.println("Ordenar por apellidos");
        ComparadorPorApellidos comparadorPorApellidos = new ComparadorPorApellidos();
        SortedSet<Persona> personasPorApellido = new TreeSet<>(comparadorPorApellidos);
        for (Persona p2: personasPorApellido){
            System.out.println(p2);
        }

        SortedSet<Persona> personasPorApellidosNombreEdad = new TreeSet<>();
        for (Persona p3: personasPorApellidosNombreEdad){
            System.out.println(p3);
        }

        // Ej_7 - 1
        System.out.println("Ej 7 apartado 1");
        System.out.println(personas.first());




    }
}
