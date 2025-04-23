package ProyectoT5;

public class CentroLogistico {
    public static void main(String[] args) {
        // Creamos una instancia del GestorPaquetes, que es nuestra clase personalizada para gestionar los paquetes
        GestorPaquetes gestor = new GestorPaquetes();  

        gestor.recibirPaquete(new Paquete("AB545", 10.5, "Ubrique", 2)); 
        gestor.recibirPaquete(new Paquete("KL458", 5.0, "Prado del Rey", 1));  
        gestor.recibirPaquete(new Paquete("HG547", 8.3, "Puerto Serrano", 3));  

        System.out.println("Procesando paquetes:");
        
        gestor.procesarPaquetes();  
    }
}
