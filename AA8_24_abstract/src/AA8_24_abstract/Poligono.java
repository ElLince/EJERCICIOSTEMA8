/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AA8_24_abstract;

/**
 *
 * @author jlu
 */
public abstract class Poligono {
    
    double base;
    double altura;
    
    Poligono(double a, double b){
        base = a;
        altura= b;
    }
    
    public abstract double area();
       
    
}
