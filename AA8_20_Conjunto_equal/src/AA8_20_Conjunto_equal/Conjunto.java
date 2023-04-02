/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AA8_20_Conjunto_equal;

import java.util.Arrays;

/**
 *
 * @author jlu
 */
public class Conjunto extends Lista {
    
    public Conjunto(){
        super();
    }

    /**
     *
     * @param nuevo
     */
    public boolean insertarElemento(int nuevo){
        return super.insertarElemento(nuevo);
    }

    public boolean equals(Conjunto c2){
        boolean igual=true;
        if (this.tabla.length==c2.tabla.length){
        for (int e : this.tabla){
            if (Arrays.binarySearch(c2.tabla,e)<0){
                igual=false;
            }
        }
        }else { 
            igual = false;
            }
        return igual;
    }
    
    void mostrar(){
    super.mostrar();
    }

}
    

