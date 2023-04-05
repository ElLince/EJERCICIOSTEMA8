/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AA8_18_Cola_Doble;

import java.util.Arrays;

/**
 *
 * @author jlu
 */
public class ColaDoble extends Cola {
    
    void encolarPrincipio(int nuevo){
     tabla = Arrays.copyOf(tabla,tabla.length+1);
     System.arraycopy(tabla , 0 ,tabla ,1 , tabla.length-1);
     tabla[0]=nuevo;

    }
    
    public int desencolarFinal(){
    int n=tabla[tabla.length-1];
    tabla = Arrays.copyOf(tabla,tabla.length-1);        
    return n;
    }
    
}
