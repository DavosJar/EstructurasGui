package estructurasModel;

import java.util.ArrayList;
import java.util.List;

public class NodoGrafo extends Nodo {
    private final List<Arista> aristas; // Lista de aristas
    private final int valencia; // Valencia del nodo

    public NodoGrafo(String tag) {
        super(tag);
        this.aristas = new ArrayList<>(); // Inicializa la lista de aristas
        this.valencia = 0; // Inicializa la valencia en 0 al crear un nodo nuevo
    }
    
    public int getValencia() {
        return valencia;
    }

    public List<Arista> getAristas() {
        return aristas;
    }

    @Override
    public String toString() {
        return "NodoGrafo{" +
               "tag='" + tag + '\'' +
               ", valencia=" + valencia +
               ", aristas=" + aristas +
               '}';
    }
}