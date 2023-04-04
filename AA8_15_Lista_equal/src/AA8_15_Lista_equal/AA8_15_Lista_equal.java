/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package AA8_15_Lista_equal;

/**
 *
 * @author jlu
 */
public class AA8_15_Lista_equal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean confirma;
        Lista l1 = new Lista();
        Lista l2 = new Lista();        

        l1.insertarElemento(1);
        l1.insertarElemento(2);
        l1.insertarElemento(1);        
        l1.mostrar();        
        l2.insertarElemento(1);
        l2.insertarElemento(2);
        l2.insertarElemento(3);        
        l2.mostrar();        
        confirma =l1.equals(l2);
        System.out.println("¿Son l1 y l2 iguales? " +confirma);
    }
}
