/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mpoop9;

/**
 *Clase que genera cuadrilateros
 * @author alumno
 */
public class  Cuadrilatero extends Poligono{

    private int alfa,beta;
    private float a,b;
    private float base,altura;

    public Cuadrilatero(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }
/**
 * Constructor vacio
 */
    public Cuadrilatero() {
    }

    public int getAlfa() {
        return alfa;
    }

    public int getBeta() {
        return beta;
    }

    public float getA() {
        return a;
    }

    public float getB() {
        return b;
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
  * Método que realiza e imprime el area de un cuadrilatero
  * @param base recibe la base del cuadrilatero
  * @param altura recibe la altura del cuadrilatero
  * @return la base por la altura
  */
    @Override
    public float area() {
return base*altura ;
    }
/**
 * Método que realiza e imprime el perimetro de un cuadrilatero
 * @param a recibe la medida del lado a
 * @param b recibe la medida del lado b
 * @return 2 veces a, más dos veces b
 */
    @Override
    public float perimetro() {
return 2*(a+b);
    }

    @Override
    public String toString() {
        return super.toString() + "Cuadrilatero{" + '}';
    }
    
}
