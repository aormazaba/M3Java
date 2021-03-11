/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metodes;

import java.util.Scanner;

/**Aquesta classe fa referència a mètodes relacionats amb els escacs.
 *
 * @author alumne
 */
public class Ajedrez {
    
   
    /**
     * El mètode agafa la coordenada X (de 1 a 8) del tablero d'escacs i la coordenada
     * Y (de 1 a 8) per convertir-les a X (de a fins h) i la Y (de 1 a 8).
     * 
     * <p>En cas que un dels dos sigui 0,negatiu o major que 8 retorna "ERROR".
     * <p>
     * <p>Per finalitzar s'ha d'introduïr 0 0.
     * 
     * @param eixX
     * @param eixY 
     * @return String de les coordenades on X va de a a h i on Y va de 1 a 8.
     */
    public static void coordenadesMoviment(int eixX,int eixY) {
        
    
        Scanner ent = new Scanner(System.in);
        String casella="ERROR";      
                
        
        
            if (!(eixX == 0 && eixY == 0)){
            switch(eixX) {  
            case 1:
                casella="h"+eixY;
                break;
            case 2:
                casella="g"+eixY;
                break;
            case 3:
                casella="f"+eixY;
                break;
            case 4:
                casella="e"+eixY;
                break;
            case 5:
                casella="d"+eixY;
                break;
            case 6:
                casella="c"+eixY;
                break;
            case 7:
                casella="b"+eixY;
                break;
            case 8:
                casella="a"+eixY;
                break;
                }
                System.out.println(casella);
            }
        
        
}
  
}
