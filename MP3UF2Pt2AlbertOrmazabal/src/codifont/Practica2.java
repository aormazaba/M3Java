/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codifont;

import static Metodes.Cadena.juntaSaltejats;

/**
 *
 * @author alumne
 */
public class Practica2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
       
       System.out.println("Només introduïm un valor negatiu (-25):");
       System.out.println(juntaSaltejats(-25));
       System.out.println("\nNomés introduïm un valor positiu (3):");
       System.out.println(juntaSaltejats (3));
       System.out.println("\nIntroduïm el valor (0) i els 7 Strings La ,teua ,resposta ,no ,és ,la ,correcta.:");
       System.out.println(juntaSaltejats(0,"La ","teua ","resposta ","no ","és ","la ","correcta."));
       System.out.println("\nIntroduïm el valor (1) i els 7 Strings La ,teua ,resposta ,no ,és ,la ,correcta.:");
       System.out.println(juntaSaltejats(1,"La ","teua ","resposta ","no ","és ","la ","correcta."));
       System.out.println("\nIntroduïm el valor (2) i els 7 Strings La ,teua ,resposta ,no ,és ,la ,correcta.:");
       System.out.println(juntaSaltejats(2,"La ","teua ","resposta ","no ","és ","la ","correcta."));
       System.out.println("\nIntroduïm el valor (3) i els 7 Strings La ,teua ,resposta ,no ,és ,la ,correcta.:");
       System.out.println(juntaSaltejats(3,"La ","teua ","resposta ","no ","és ","la ","correcta."));
       System.out.println("\nIntroduïm el valor (4) i els 7 Strings La ,teua ,resposta ,no ,és ,la ,correcta.:");
       System.out.println(juntaSaltejats(4,"La ","teua ","resposta ","no ","és ","la ","correcta."));
       System.out.println("\nIntroduïm el valor (5) i els 7 Strings La ,teua ,resposta ,no ,és ,la ,correcta.:");
       System.out.println(juntaSaltejats(5,"La ","teua ","resposta ","no ","és ","la ","correcta."));
       System.out.println("\nIntroduïm el valor (6) i els 7 Strings La ,teua ,resposta ,no ,és ,la ,correcta.:");
       System.out.println(juntaSaltejats(6,"La ","teua ","resposta ","no ","és ","la ","correcta."));
       System.out.println("\nIntroduïm el valor (7) i els 7 Strings La ,teua ,resposta ,no ,és ,la ,correcta.:");
       System.out.println(juntaSaltejats(7,"La ","teua ","resposta ","no ","és ","la ","correcta."));
       System.out.println("\nIntroduïm el valor (8) i els 7 Strings La ,teua ,resposta ,no ,és ,la ,correcta.:");
       System.out.println(juntaSaltejats(8,"La ","teua ","resposta ","no ","és ","la ","correcta."));
       System.out.println("\nIntroduïm el valor (9) i els 7 Strings La ,teua ,resposta ,no ,és ,la ,correcta.:");
       System.out.println(juntaSaltejats(9,"La ","teua ","resposta ","no ","és ","la ","correcta."));
       System.out.println("\nIntroduïm el valor (3) i l'String null");
       System.out.println(juntaSaltejats (3,null));
       System.out.println("\nIntroduïm el valor (1) i dintre els string un amb valor null:");
       System.out.println(juntaSaltejats(1,"La ","teua ","resposta ",null,"és ","la ","correcta."));
        System.out.println("");
       
    }
    
}
