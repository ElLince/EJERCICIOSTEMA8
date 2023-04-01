/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package AA8_19_extend_Lista;

/**
 *
 * @author jlu
 */
public class AA8_19_extend_Lista {

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
        
        Conjunto c = new Conjunto();
        c.insertarElemento(3);
        c.insertarElemento(4);
        c.insertarElemento(3);        
        c.mostrar();
    }
}
