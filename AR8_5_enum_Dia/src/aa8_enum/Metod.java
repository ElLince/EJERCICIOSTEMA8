/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aa8_enum;

import java.util.Arrays;

/**
 *
 * @author jlu
 */
public abstract class Metod {
    
    Dia d[];
       
    
    public Metod(){
       d = new Dia[0];
    }

    public void insertar(Dia e){
        d=Arrays.copyOf(d,d.length+1);
        d[d.length-1]=e;
    }
    
    abstract void mostrar();
}
