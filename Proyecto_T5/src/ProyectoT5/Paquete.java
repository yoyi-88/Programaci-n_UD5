package ProyectoT5;
public class Paquete implements Comparable<Paquete> {  

    private String codigo;  
    private double peso;     
    private String destino;  
    private int prioridad;   

    public Paquete(String codigo, double peso, String destino, int prioridad) {
        this.codigo = codigo;
        this.peso = peso;
        this.destino = destino;
        this.prioridad = prioridad;
    }

    public int getPrioridad() {
        return prioridad;
    }

    // Comparamos paquetes para ordenarlos por prioridad
    @Override
    public int compareTo(Paquete otro) {
        return Integer.compare(this.prioridad, otro.prioridad); 
    }

    // Representamos el objeto paquete con toString para facilitar su impresión
    @Override
    public String toString() {
        return "Paquete{" + "codigo=" + codigo +  ", peso=" + peso + "kg"+ ", destino=" + destino + ", prioridad=" + prioridad + '}';
    }
}
