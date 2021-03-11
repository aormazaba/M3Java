/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codifont;

import static Metodes.Ajedrez.coordenadesMoviment;
import static codifont.Practica3.casella;
import java.util.Scanner;

/**
 * Repeteixo l'exercici utilitzant un mètode de la biblioteca, ho faig així per
 * que no puc mantenir l'estructura dels apunts i he d'inicialitzar les variables
 * dintre del bucle.
 * 
 * 
 * @author alumne
 */
public class Practica3ImportBiblio {
    
    static Scanner ent = new Scanner(System.in);
    static int eixX;
    static int eixY;
    
    public static void main(String[] args) {
        
        do{
        inicialitzarVariables(); 
    
        coordenadesMoviment(eixX,eixY);
            
     } while (!elementFinal());
        

    }
     
    private static boolean elementFinal() {
        
        //Quan els dos valors introduits siguin 0 retornem true 
        
        if (eixX==0 && eixY == 0) return true;
        return false;
        
    }
    private static void inicialitzarVariables() {
          
                eixX = ent.nextInt();
                eixY = ent.nextInt();        
    }
    
    

    
}
