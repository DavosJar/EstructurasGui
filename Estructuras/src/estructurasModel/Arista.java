package estructurasModel;

public class Arista {
    private float peso;
    private String nombre;
    private NodoGrafo nodoInicio;
    private NodoGrafo nodoFin;

    public Arista(float peso, String nombre) {
        this.peso = peso;
        this.nombre = nombre;
    }

    public Arista(float peso, String nombre, NodoGrafo nodoInicio, NodoGrafo nodoFin) {
        this(peso, nombre); 
        this.nodoInicio = nodoInicio;
        this.nodoFin = nodoFin;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public NodoGrafo getNodoInicio() {
        return nodoInicio;
    }

    public void setNodoInicio(NodoGrafo nodoInicio) {
        this.nodoInicio = nodoInicio;
    }

    public NodoGrafo getNodoFin() {
        return nodoFin;
    }

    public void setNodoFin(NodoGrafo nodoFin) {
        this.nodoFin = nodoFin;
    }

    @Override
    public String toString() {
        return "Arista{" +
               "peso=" + peso +
               ", nombre='" + nombre + '\'' +
               ", nodoInicio=" + nodoInicio.getTag() +
               ", nodoFin=" + nodoFin.getTag() +
               '}';
    }
}