package ProyectoT5;

import java.util.*;

public class GestorPaquetes {

    private List<Paquete> paquetes = new ArrayList<>();

    public void recibirPaquete(Paquete paquete) {
        paquetes.add(paquete);  
    }

    public void procesarPaquetes() {
        // Ordenamos los paquetes por prioridad (de menor a mayor)
        Collections.sort(paquetes);

        // Recorremos la lista para imprimirla
        for (Paquete p : paquetes) {
            System.out.println("Procesado: " + p);  
        }
    }
}
