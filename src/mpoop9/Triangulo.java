/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mpoop9;

/**
 Clase que genera tríangulos
  @author alumno
 */
public class Triangulo extends Poligono{
    
    private int alfa, beta, gama;
    private float a, b, c;
    private float base, altura;

    public Triangulo(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }
/**
 * Contructor vacio
 */
    public Triangulo() {
    }

    public int getAlfa() {
        return alfa;
    }

    public int getBeta() {
        return beta;
    }

    public int getGama() {
        return gama;
    }

    public float getA() {
        return a;
    }

    public float getB() {
        return b;
    }

    public float getC() {
        return c;
    }

    public float getBase() {
        return base;
    }

    public float getAltura() {
        return altura;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
    /**
      * Método que realiza e imprime el perimetro de un triangulo
      * @param base recibe la base del triangulo
      * @param altura recibe la altura del triangulo
      * @return La base por la atura entre dos
     */
    @Override
    public float area() {
        return base * altura/2;
    }
/**
 * Método que realiza e imprime el perimetro de un triangulo
 * @param a recibe el lado a del triangulo
 * @param b recibe el lado b del triangulo
 * @param c recibe el lado c del triangulo
 * @return la suma de a, b y c
 */
    @Override
    public float perimetro() {
        return a+b+c;
    }

    @Override
    public String toString() {
        return super.toString() + "Triangulo{" + '}';
    }
    
    
    
}
