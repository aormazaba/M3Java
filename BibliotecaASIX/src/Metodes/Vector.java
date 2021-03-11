/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metodes;

/**Aquesta classe conté mètodes que fan referència a oepracions amb Vectors.
 *
 * @author Albert Ormazàbal
 */
public class Vector {
   
//-----------------------OMPLE VECTOR AMB FLOATS--------------------------------    
    /**
     * Mètode en Java anomenat ompleVectorFloats que rebigue un número variable 
     * de paràmetres formals de tipo real (float) i retorne un vector contenint 
     * el valor dels paràmetres. 
     * <p>Cas especial:
     * <p>1.- Si no se li passa cap paràmetre retornarà null. 
     * @param valors valors float per ser continguts al vector.
     * @return  un vector contenint el valor dels paràmetres.
     */
    
    public static float[] ompleVectorFloats(float... valors){
        //Casos especials
        if(valors==null || valors.length==0) 
            return null; //Casos en que hem rebut null o no hem rebut paràmetre 
                         //o hem rebut un vector buit  

        //Versió llarga                 
//        float[] resultat=new float[valors.length];
//        for (int i = 0; i < resultat.length; i++) {
//            resultat[i]=valors[i];
//        }
                         
//        return resultat;
        
        //Versió curta
        return valors;
    
    }
    
//-------------------------MODIFICAR MÚLTIPLOS VECTOR---------------------------  
    /**
     * mètode que rebigue com a paràmetre un vector d'enters i un número enter, 
     * i borre del vector totes aquelles caselles que continguen números que no 
     * siguen múltiples del número passat com a paràmetre, dixant a les primeres
     * posicions del vector només aquells que sí ho siguen. 
     * <p>En acabar el procés, les posicions no ocupades del vector han de contenir
     * un –1.

     * @param v vector d'enters 
     * @param num enter per esborrar de v els que no siguen mútiples d'ell
     * @return no retorna res, però modifica el valor del vector amb -1 a les 
     * modificacions.
     * 
     */
    public static void eliminaNoMultiples(int[] v, int num){
        //Casos especials
        if(v==null || num==0) return;
        
        int i=0, iM=0;
    
        while(i<v.length){
            if(v[i]%num==0){
                v[iM]=v[i];
                if(i!=iM) v[i]=-1;
                iM++;
            }else v[i]=-1;
            i++;
        }
    
    }
//----------------------------MODIFICAR MÚLTIPLOS VECTOR NUEVO------------------
    /**
     * mètode que rebigue com a paràmetre un vector d'enters i un número enter, 
     * i borre del vector totes aquelles caselles que continguen números que no 
     * siguen múltiples del número passat com a paràmetre, dixant a les primeres
     * posicions del vector només aquells que sí ho siguen.
     * <p>AQUESTA ACCIÓ LA FA SOBRE UN VECTOR NOU DEIXANT INTACTE EL VECTOR INICIAL PARÀMETRE.
     * 

     * @param v vector d'enters 
     * @param num enter per esborrar de v els que no siguen mútiples d'ell
     * @return vector resultat de la modificació 
     */
    public static int[] eliminaNoMultiplesV2(int[] v, int num){
        //Casos especials
        if(v==null || num==0) return v;
        
        //Declaració de variables
        int i=0, iM=0;
        int[] res=new int[v.length]; //vector del mateix tipo i llargada que v
    
        while(i<v.length){
            if(v[i]%num==0){
                res[iM]=v[i];
                if(i!=iM) res[i]=-1;
                iM++;
            }else res[i]=-1;
            i++;
        }
        
        return res;
    
    }
    
//-----------------------------EXERCICI PRÀCTICA 1------------------------------

/**
 * El mètode incrementarà els enters de dins del vector paràmetre amb l'enter 
 * paràmetre quantitat i en funció del valor del booleà paràmetre modifica, crearà
 * i modificarà el vector inicial o incrementarà el vector resultant però no 
 * modificarà l'original.
 * <p>Casos especials:
 * <p>1.- si el vector és null retornarà null
 * <p>2.- si param modifica és true incrementa sobre el param vector i retorna null
 * <p>3.- si param modifica és false no modifiquem el param vector i creem un vector
 * amb l'increment que serà el retorn del vector.
 * @param vector
 * @param quantitat
 * @param modifica
 * @return retorna un vector resultat d'enters resultat d'haver incrementat el vector 
 * paràmetre amb el paràmetre quantitat o no, en funció del valor del booleà 
 * paràmetre modifica.
 */    
    public static int[] operaVector(int[] vector, int quantitat, boolean modifica){
        //Casos especials
        if(vector==null) return null;
        
        //Declaració de variables
        int[] resultat=null;
        
        //Segur que vector no null
        if(modifica){
            
            for (int i = 0; i < vector.length; i++) {
                vector[i]+=quantitat;
            }
            
            
        }else{
            resultat=new int[vector.length];
            for (int i = 0; i < resultat.length; i++) {
                resultat[i]=vector[i]+quantitat;
            }
        }
        
        return resultat;
        
    }
     
}
