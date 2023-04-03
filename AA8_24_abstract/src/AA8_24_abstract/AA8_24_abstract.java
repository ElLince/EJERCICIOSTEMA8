/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package AA8_24_abstract;

/**
 *
 * @author jlu
 */
public class AA8_24_abstract {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Triangulo t = new Triangulo(2.0,3.0);
        
        double a=0;
        a=t.area();
        System.out.println("Area es: "+a);
        
        Rectangulo r = new Rectangulo(2,4);
        a=r.area();
        System.out.println("Area es: "+a);

//       La siguiente linea de error porque la clase Poligono no puede ser inicializada
//        Poligono p = new Poligono(1,2);
        
    }
}
