/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codifont;
import java.util.Scanner;

/*El problema que se'ns planteja l'entenc com un disseny de Recorregut d'una 
 *sequència. 
 *En aquest cas no estem cercant cap element en concret ni que acompleixi cap 
 *requisit determinat.
 *L'usuari mou unes fitxes dels escacs i nosaltres hem de transcriure la seva 
 *posició independent de la fitxa que sigue i la posició en que es trobi.
 *L'únic cas especial que podríem trobar és que l'usuari ens mogués dues fitxes 
 *del mateix color, però no ens demanen res al respecte a l'enunciat.
 *Ens trobem devant d'un cas clar de recòrrer o tractar tots els elements de la
 *sequència per igual (no cal tractar diferent el primer).
 *Descarto la cerca dins de la sequència i l'únic dubte que podríem tindre és 
 *si tractem o no el primer element, no té cap dada especial i no influeix en el
 *resultat del nostre programa aquest primer element.Ni tansols ens fa variar el
 *funcionament si l'ordre de les coordenades rebudes s'intercanviés malgrat 
 *la partida seria un desastre... :)   
 *
 *   inicialitzarVariables(); //No el faré servir (podria amb l'String casella.)
 *   fer
 *   tractarElement();
 *   mentre no elementFinal();
 *   fimentre
 *   tractamentFinal(); //No el faré servir
 *
 */

public class Practica3 {
    
    //Declaro les variables globals
    
    static Scanner ent = new Scanner(System.in);
    static int eixX;
    static int eixY;
    static String casella;    

    public static void main(String[] args) {   
    
        do{
        tractarElement();
        
     } while (!elementFinal());    
    }
    
    //Captura i tractament de les coordenades
    
    private static void tractarElement() {
        
    /*Com la recollida de les posicions les realitza una màquina no caldria tractar
     *casos especials, però els deixaré tractats i comentats per si en un futur
     *la introducció de dades fos manual i pugués haver errors.
     *   
     *EN CAS DE VOLER TRACTAR-HO DESCOMENTAR LÍNIES 64,67 i 115 A 130.   
     *
     *En cas que un dels dos sigui 0,negatiu o major que 8.
     *
     */         
//            do {
                eixX = ent.nextInt();
                eixY = ent.nextInt();
//            } while (casEspecial());

            //podria haver fet l'exercici amb vectors però tenint en compte que
            //es podria presentar al domjudge, i sent sempre 8 caselles...ho he
            //fet amb switch.

            if (!elementFinal()){
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
    //Tractament de l'element de sortida
    
    private static boolean elementFinal() {
        
        //Quan els dos valors introduits siguin 0 retornem true 
        
        if (eixX==0 && eixY == 0) return true;
        return false;        
    }
    
    //Tractament de casos especials (possible error en introducció per usuari)
    
//    private static boolean casEspecial() {
//        if ((eixX == 0 || eixY == 0) && eixX != eixY) {
//            System.out.println("Els valors han d'estar entre 1 i 8.");
//            return true;
//        }
//        if (eixX < 0 || eixY < 0) {
//            System.out.println("Els valors han d'estar entre 1 i 8.");
//            return true;
//        }
//        if (eixX > 8 || eixY > 8){ 
//            System.out.println("Els valors han d'estar entre 1 i 8.");
//            return true;
//        }
//        
//        return false;
//    }

    
}