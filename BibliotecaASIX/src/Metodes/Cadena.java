/*
Hem creat un projecte ANT del tipus library.
Els mètodes els enganxem o creem aquí i els podrem utilitzar desde els nostres 
projectes.

Quan fem una nova cadena l'hem de compilar i netejar (martellet/granera)

Allí on necessitem utilitzar un mètode d'aquesta library el cridem: retornaCadenaBuida(); 
Ara el netbeans no el troba ja que no està al mateix projecte...
Hem d'obrir la pestanya Libraries del projecte on treballem i amb el botò dret add project i la llibreria
 */
package Metodes;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Cadena {
    
//---------------------------------------------------------------------------
    
    public static int buscaCadena(String primer, String segon, int pos) {

        //casos especials
        if (primer == null || segon == null) {
            return -1;
        }
        if (pos < 0) {
            pos = 0;
        }
        if (segon.length() == 0) {
            return pos < primer.length() ? pos : primer.length();
        }
        //el que vol dir és..: si pos és menor que llergada de primer retorna pos i si no retorna llergada primer
        if (pos >= primer.length()) {
            return -1;
        }

        return primer.indexOf(segon, pos); // indexOf ja retorna -1 si no el troba

    }
    
//----------------------------------------------------------------------------
    
    public static String insertaCadena(String primer, String segon, int posicio) {
        //tractem els casos especials:
        if (primer == null && segon == null) {
            return null;
        }
        if (primer == null && segon != null) {
            return segon;
        }
        if (primer != null && segon == null) {
            return primer;
        }
        if (posicio < 0) {
            posicio = 0;
        }
        if (posicio > primer.length()) {
            posicio = primer.length();
        }
        //declarem les variables:
        String resultat = "";

        //primer hem d'agafar el primer tros del primer string abans d'insertar el segon.
        //del primer caràcter fins l'anterior a "posicio". Si volem posar a la 4 hem d'agafar de la 0 a la 3.
        for (int i = 0; i < posicio; i++) {
            resultat = resultat + primer.charAt(i);
        }

        //versio curta 
        //resultat=primer.substring(0,posicio);
        resultat = resultat + segon;

        //ara concatenem el tros final de primer a continuació de la cadena.
        for (int i = posicio; i < primer.length(); i++) {
            resultat = resultat + primer.charAt(i);
        }

        return resultat;

    }
    
//----------------------------------------------------------------------
    
    public static String retornaCadenaBuida() {
        return "";
    }

    public static String llegirliniesfipunt(String missatge, char carFin) {
        Scanner ent = new Scanner(System.in);
        String text = "";
        System.out.println(missatge);
        do {

            String linia = ent.nextLine().trim(); //line

            //Mirem si la línia és buida .
            if (!linia.isEmpty());
            //concatenem la línia la text
            text = text + linia;
            //Mirem si és o no la última linia del text

            if (linia.endsWith(carFin + "")) {
                break; //si ho és sortim, concatenem per tal que accepti el char
            } else {
                text += "\n"; //si no és la última afegim un salt (si és la línia no la afegim).
            }

        } while (true);
        return text;
        //Métode que retorna  un vector d'enters que conté les posicions on apareix
        //la subcadena dins del text

    }

//-------------------------------------------------------------------------

// El mètode retornarà concatenades les cadenes començant per la primera i saltant 
// a les indicades pel número rebut com a paràmetre. A més, al principi de la cadena
//resultat posarà la suma de les longituds de les cadenes concatenades, havent 
//eliminat els espais en blanc, seguit del caràcter.
    //  si el número de salts és inferior a 1: retornarem "0".
    //  si el número de salts és superior o igual a 1, però:
    //no hi ha cap cadena de caràcters: retornarem "0".
    
    public static String juntaSaltejats(int num, String... cadenes) {

        int cont = 0;
        String resultat = "";
        int longitud=0;
        
        if (cadenes == null) return null;
        if (num < 1) return "0";
        if (cadenes.length == 0) return "0";
                

        for (int i = 0; i < cadenes.length; i++) {
            if (cadenes[i]==null) cadenes[i]="null";
        }

        for (int i = 0; i < cadenes.length; i += num) {
            resultat = resultat + cadenes[i];
            longitud += cadenes[i].trim().length();

        }

        return longitud + ":" + resultat;
    }

}
