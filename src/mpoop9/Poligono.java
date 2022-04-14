/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mpoop9;

/**
 * Clase Polígono
 * @author alumno
 */
public abstract class Poligono {
    /**
      Método abstracto que no devuelve nada.
     @return 0
     */
    public abstract float area();
    /**
     * Método abstracto que no devuelve nada.
     * @return 0
     */
    public abstract float perimetro();

    @Override
    public String toString() {
        return "Poligono{" + '}';
    }
    
}
