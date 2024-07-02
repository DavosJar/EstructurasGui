package estructurasModel;

import java.util.ArrayList;
import java.util.List;

public class Grafo {
    private int tamnio;
    private int orden;
    private int valencia;
    private final List<NodoGrafo> nodos;
    private final List<Arista> aristas;

    public Grafo(String tag) {
        this.nodos = new ArrayList<>();
        this.aristas = new ArrayList<>();
        NodoGrafo nodoInicial = new NodoGrafo(tag);
        this.nodos.add(nodoInicial);  // Añadir el nodo inicial al grafo
    }


    public int getNumNodos() {
        return nodos.size();  // Devuelve el tamaño de la lista de nodos
    }

    public int getNumAristas() {
        return aristas.size();  // Devuelve el tamaño de la lista de aristas
    }

    public List<NodoGrafo> getNodos() {
        return nodos;
    }

    public List<Arista> getAristas() {
        return aristas;
    }

    public int getTamnio() {
        return tamnio;
    }

    public int getOrden() {
        return orden;
    }

    public int getValencia() {
        return valencia;
    }
    
    @Override
    public String toString() {
        return "Grafo{" +
               "numNodos=" + nodos.size() +
               ", numAristas=" + aristas.size() +
               ", nodos=" + nodos +
               ", aristas=" + aristas +
               '}';
    }
}