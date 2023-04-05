/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package AA8_18_Cola_Doble;

/**
 *
 * @author jlu
 */
public class AA8_18_Cola_Doble {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean confirma;
        ColaDoble cd = new ColaDoble();

        cd.encolarPrincipio(6);
        cd.encolarPrincipio(7);
        cd.encolarPrincipio(8);
        cd.mostrar();        
        cd.desencolarFinal();
        cd.mostrar();        
    }
    }
}
