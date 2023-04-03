/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AA8_24_abstract;

/**
 *
 * @author jlu
 */
public class Triangulo extends Poligono {

    Triangulo(double a1, double a2){
        super(a1,a2);
    }

    public double area(){
        double area;
        area=base*altura/2;
//        System.out.println("El area del triangulo es "+area);
        return area;
       }
    
}
