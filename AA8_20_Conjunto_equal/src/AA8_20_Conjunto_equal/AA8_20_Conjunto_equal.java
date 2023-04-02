/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package AA8_20_Conjunto_equal;

/**
 *
 * @author jlu
 */
public class AA8_20_Conjunto_equal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean confirma;
        Lista l1 = new Lista();
        

        l1.insertarElemento(1);
        l1.insertarElemento(2);
        l1.insertarElemento(1);        
        l1.mostrar();        
        Conjunto c1 = new Conjunto();
        c1.insertarElemento(3);
        c1.insertarElemento(4);
        c1.insertarElemento(3);        
        c1.mostrar();
        Conjunto c2 = new Conjunto();
        c2.insertarElemento(3);
        c2.insertarElemento(4);
//        c2.insertarElemento(1);        
        c2.mostrar();
        boolean iguales=c1.equals(c2);
        System.out.println("¿Son iguales c1 y c2? "+iguales);
        
    }
}
