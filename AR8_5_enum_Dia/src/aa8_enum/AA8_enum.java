/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aa8_enum;


/**
 *
 * @author jlu
 */
public class AA8_enum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Dia labor[] = {Dia.LU, Dia.MA, Dia.MI};
        Laboral l = new Laboral();
        for (Dia v:labor){
            l.insertar(v);
        }

        l.mostrar();

    
    }
    
}
