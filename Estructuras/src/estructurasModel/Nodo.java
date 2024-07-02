/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estructurasModel;

/**
 *
 * @author Alexis
 */
public abstract class Nodo {
    protected String tag; 

    // Constructor
    public Nodo(String tag) {
        this.tag = tag;
    }


    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    @Override
    public String toString() {
        return "Nodo{" + "tag=" + tag + '}';
    }
 
}
