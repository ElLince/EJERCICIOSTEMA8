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
public class Lista {

    int tabla[] = new int[0];        ;
    
    public Lista(){
    
   }    

    
    public boolean insertarElemento(int nuevo){
        boolean insertado=false;
        if (!repetido(nuevo)){
            tabla = Arrays.copyOf(tabla,tabla.length+1);
            tabla[tabla.length-1]=nuevo;
            insertado=true;
        }
        return insertado;
    }

    public boolean repetido(int nuevo){
        boolean b=false;
        
        for (int i=0; i<tabla.length; i++){
            if (tabla[i]==nuevo){
                b=true;
            }
        }
        return b;
    }

    void eliminarElemento(int elemento){
         for (int i=0; i<tabla.length; i++){
             if (tabla[i]==elemento){
                System.arraycopy(tabla , i+1 ,tabla ,i , tabla.length-i-1);
                tabla = Arrays.copyOf(tabla,tabla.length-1);
                }
            }
        
    }

    
    static Lista union(Lista c1, Lista c2){
        Lista resultado = new Lista();
        for (int e : c1.tabla){
            resultado.insertarElemento(e);
        }
        for (int e : c2.tabla){
            resultado.insertarElemento(e);
        }
        return resultado;
    }

    public boolean pertenece(Lista c){
        boolean pertenece=true;
        for (int e : c.tabla){
            if (Arrays.binarySearch(this.tabla,e)<0){
                pertenece=false;
            }
        }
        return pertenece;
    }

    public boolean eliminaConjunto(Lista c1){
        boolean eliminado=false;
        for (int e : c1.tabla){
            int n1=Arrays.binarySearch(this.tabla,e);
            if (Arrays.binarySearch(this.tabla,e)>=0){
                eliminarElemento(e);
                eliminado=true;
            }
        }
        return eliminado;
    }

    
    
    void mostrar(){
        System.out.println(Arrays.toString(tabla));
    }

    void numeroElementos(){
        System.out.println("El numero de elementos son: " +tabla.length);
    }
    

}
