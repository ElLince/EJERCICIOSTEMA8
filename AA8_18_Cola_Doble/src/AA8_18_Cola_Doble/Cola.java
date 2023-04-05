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
public class Cola extends Lista {

    public boolean insertar(int nuevo){
        boolean insertado=false;
 //       if (!repetido(nuevo)){
            tabla = Arrays.copyOf(tabla,tabla.length+1);
            tabla[tabla.length-1]=nuevo;
            insertado=true;
//        }
        return insertado;
    }


    void eliminar(){
         System.arraycopy(tabla , 1 ,tabla ,0 , tabla.length-1);
         mostrar();
         tabla = Arrays.copyOf(tabla,tabla.length-1);

    }

    
}
