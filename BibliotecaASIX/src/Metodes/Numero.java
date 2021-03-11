/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metodes;

/**Aquesta classe conté mètodes que fan referència a operacions amb números.
 *
 * @author Albert Ormazàbal
 */
public class Numero {
    
//--------------------------MÀXIM COMÚ DIVISOR RECURSIU-------------------------
    /**
     * Aquest mètode retorna de forma recursiva el màxim comú divisor dels 2 enters
     * donats com a paràmetres a i b.
     * <p>Casos especials tractats:
     * <p>1.- Si algun dels paràmetres és 0 retorna 0.
     * 
     * @param a el primer enter.
     * @param b el segon enter.
     * @return  El màxim comú divisor dels 2 números passats com a paràmetre.
     */
    //exercici 29 moodle
    public static int mcdRecursiu(int a, int b){
        //mirem si nhi ha en negatiu i el pasem a positiu
        if(a<0) a=a*-1;
        if(b<0) b=b*-1;
        
        
        if (a==b) return a;
        if (a>b) return mcdRecursiu(a-b,b);
        
        //a només pot ser =,< o > que b...llavors dos casos els tractem dalt
        //la tercera possibilitat a<b la tractem a continuació:
        return mcdRecursiu (a,b-a);
    }
    
    
//--------------------------MÀXIM COMÚ DIVISOR ITERATIU-------------------------   
    /**
     * Aquest mètode retorna fent-ho de forma iterativa el màxim comú divisor dels 2 enters
     * donats com a paràmetres a i b.
     * @param a el primer enter.
     * @param b el segon enter.
     * @return El màxim comú divisor dels 2 números passats com a paràmetre.
     */
    
    
    public static int mcdIteratiu(int a, int b){
        //mirem si nhi ha en negatiu i el pasem a positiu
        if(a<0) a=a*-1;
        if(b<0) b=b*-1;
        
        
        while (a!=b){
             if (a>b) a=a-b;
             else b=b-a;
        }
        return a;
                     
    }
    
    
//-------------------------------SUMA DE NATURALS-------------------------------
/**
 * El mètode relaitza la suma desde el número donat com a paràmetre fins a 0.
 * 
 * @param n     el valor inicial .
 * @return      ens retorna la suma dels naturals entre el paràmetre i el 0 (ambdós 
 *              inclosos).
 * @throws     StackOverflowError  si el paràmetre {@code num}
 *             és massa gran.
 */    
    //exercici 30 moodle
    public static int sumaNaturals(int n) {
        //cas especial
        if (n<0) return -1;
        //cas de parada
        if (n==0) return 0;
        
        //cas iteratiu
        return n+sumaNaturals(n-1);
    }
    
//---------------------SUMA NATURALS ITERATIU-----------------------------------   

    /**
     * Calcula la suma dels números naturals des de un natural paràmetre n a 0.
     * <p>Casos especials:
     * <p>1.- Si el paràmetre és negatiu retorna -1.
     * <p>2.- Si retorna -2 significa que el valor del paràmetre és massa gran. 
     * @param n natural paràmetre inicial 
     * @return La suma dels nombres naturals entre n i 0 (amdós iclosos).
     */
    
    public static int sumaNaturalsIteratiu(int n) {
        
        if (n<0) return -1;
        int suma=0;
        
        while (n!=0){
            if (suma+n<suma) return -2;
            suma=suma+n;
            n=n-1;
        }
        
        
        return suma;
    }
    
    
//-------------------------FACTORIAL RECURSIU-----------------------------------
    /**
     * El mètode realitza un factorial de manera recursiva d'un enter num.
     * @param num enter paràmetre a qui se li fa el factorial.
     * @return ens retorna un enter que es el factorial del paràmetre num.
     */
    //fem un factorial
    //RECORDO QUE ÉS UN FACTORIAL:
    //Cantidad que resulta de la multiplicación de determinado número natural 
    //por todos los números naturales que le anteceden excluyendo el cero; se 
    //representa por n!
    //el factorial de 4 es 24 (producto de 4 x 3 x 2 x 1)
    
    public static int factorial (int num){
        if(num<0) return -1;
        if(num==0) return 1;
        return num*factorial(num-1);
    }
    
//-------------------------FACTORIAL ITERATIU-----------------------------------    
    /**
     * El mètode realitza un factorial de manera iterativa d'un enter num.
     * @param num enter paràmetre a qui se li fa el factorial.
     * @return ens retorna un enter que es el factorial del paràmetre num.
     */
    
    //fem un factorial iteratiu 
    public static int factorialIteratiu (int num){
        int resultat=1;
        if(num<0) return -1;
        
        while (num>1){
            resultat=resultat*num;
            num=num-1;
        }
        return resultat;
    }
//---POTÈNCIA------------------BASE (DOUBLE) ELEVADA A EXPONENT------------------    
    /**
     * Aquest mètode anomenat potenciaRec calcula de forma recursiva la potència 
     * d'un double base elevat a l'enter exponent:
     * <p>L'algorisme recursiu és el següent:
     * <p>x 0 = 1
     * <p>x n = x * x n-1 , si n>0
     * <p>x n = 1/ x -n , si n<0

     * @param base parámetre de la base que és un número double. 
     * @param exponent enter exponent. 
     * @return el mètode ens retorna un double que és el valor d'una base donada
     * pel paràmetre base, elevada a ,'exponent donat pel paràmetre exponent.
     */
    //exrecici 31 moodle
    public static double potenciaRec(double base, int exponent){
        
        if (exponent<0) return 1/potenciaRec(base,exponent*-1);
        if (exponent==0) return 1;
        return base*potenciaRec(base,exponent-1);
        
    }
    
    
//---------------EL NÚMERO e APROXIMACIÓ-------dos paràmetres-------------------    
    /**
     *El mètode potenciaE rep un enter com a paràmetre x i retorna la potència 
     * d'℮ elevat al paràmetre especificat. 
     * <p>Aproximació al número ℮:
     * <p>℮ ≈ 2,71828182845904523536028747135266249775724709369995… 
     * @param x enter paràmetre
     * @return retornar un  número semblant al número e. 
     */
    
    //el fem en un sol paràmetre
    public static double potenciaE (int x){
        double resultat=1.0;
        return potenciaE2Params(x,11);
        //el 11 ens el diu Santi que és el que millor s'aproxima
    }
//---------------EL NÚMERO e APROXIMACIÓ---------un paràmetre-------------------    
    
    /**
     * El mètode potenciaE rep un enter com a paràmetre x i un segon paràmetre n 
     * i retorna la potència d'℮ elevat al paràmetre especificat. 
     * <p>Aproximació al número ℮:
     * <p>℮ ≈ 2,71828182845904523536028747135266249775724709369995… 
     * 
     * @param x enter paràmetre
     * @param n potència
     * @return retornar un  número semblant al número e. 
     * 
     */
    
    //exercici 34 moodle , utilitzem altres mètodes fets abans
    public static double potenciaE2Params (int x,int n){
        double resultat=1.0;
        
        for (int i = 1; i <= n; i++) { //aranquem en 1 per que la fòrmula eleva primer a 1
            resultat= resultat+potenciaRec(x,i)/factorial(i);
        }
        return resultat;
    }
    
//---------------ÉS UN NÚMERO PRIMER??------------------------------------------    
    
    /**
     * El mètode ens diu si un número és primer o no, retornant un booleà. 
     * 
     * 
     * @param num enter paràmetre
     * 
     * @return true si és primer i false en cas contrari. 
     * 
     */
    
    public static boolean primer(int num){    
        int cont=0;
        if (num<2) return false;
                       
        else { //mirem els num>=2
            for (int i=num; i >0 ; i--) {
                if (num%i==0) cont++;
                               
            }
            if (cont==2) return true;
            else return false;
         }
    }
    
//---------------SEGÜENT NÚMERO PRIMER------------------------------------------    
    
    /**
     * El mètode ens retorna el següent número primer. 
     * 
     * 
     * @param num enter paràmetre
     * 
     * @return el següent número primer al introduït en paràmetre.. 
     * 
     */
    
    public static int seguentPrimer(int num){    
       
        if (num<2) return 2;
        
        num=num+1;
        while(!primer(num))num=num+1;
        return num;
    }
    
//---------------SEGÜENT NÚMERO PRIMER------------------------------------------    
    
    /**
     * El mètode salta de primer en primer fins el que ens han dit (el enessim primer). 
     * 
     * 
     * @param num enter enéssim (el enéssim primer de una successió (ordinals)).
     * 
     * @return l'enèssim primer. 
     * 
     */
    //n major o igual que 1. Sinó fem com si valgués 1
    public static int primerEnessim(int n){
        if(n<=1) return 2;
        int primer=2;
        
        while(--n>0) {
            primer=seguentPrimer(primer);
        }
        return primer;
    }
}
