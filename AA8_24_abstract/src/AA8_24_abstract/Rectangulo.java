/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AA8_24_abstract;

/**
 *
 * @author jlu
 */
public class Rectangulo extends Poligono {
    
    Rectangulo(double r1, double r2){
        super(r1,r2);
    }
    public double area(){
        double area;
        area= base*altura;
        System.out.println("El area del rectangulo es: " + area);
        return area;
    }
    
}
