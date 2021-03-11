/*
APUNTS SOLTS SOBRE LES LLIBRERIES
Hem creat un projecte ANT del tipus library.
Els mètodes els enganxem o creem aquí i els podrem utilitzar desde els nostres 
projectes.

Quan fem una nova cadena l'hem de compilar i netejar (martellet/granera)

Allí on necessitem utilitzar un mètode d'aquesta library el cridem: retornaCadenaBuida(); 
Si no l'hem importat o compilat el netbeans no el troba ja que no està al mateix projecte...
Hem d'obrir la pestanya Libraries del projecte on treballem i amb el botò dret add project i la llibreria.
Als programes que anirem fent i que necessitem d'aquesta llibreria, ens proposarà importar al cridar-la.
 */
package Metodes;

import java.util.Scanner;

/**Aquesta classe conté mètodes que fan referència a operacions amb Strings.
 *  
 * @author Albert_Ormazàbal
 */
public class Cadena {
    
//-----------------------------BUSCA CADENA-------------------------------------
    /**
     * El mètode retornarà un enter indicant la posició del segon String 
     * (subcadena) dins del primer (text) a partir de la posició especificada 
     * pel número, o -1 si no es  troba. 
     * <p>Els casos especials a tractar seran:
     * <p>1.-si els 2 Strings o algun d'ells són null el mètode retornarà -1,
     * <p>2.-si el número és negatiu se farà el mateix que si valgués 0,
     * <p>3.-si el segon text és la cadena buida se retornarà el valor més menut entre
     * el número i la llargada del primer text,
     * <p>4.-si el número és superior o igual a la llargada del primer String, se retornarà -1.   

     * @param primer la cadena on buscarem
     * @param segon la cadena que buscarem
     * @param pos la posició a partir de la que buscarem
     * @return un enter indicant la posició del segon string.
     */
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
    
//-------------------------------INSERTA CADENA---------------------------------
    /**
     * El mètode retornarà  un String resultat d'insertar el segon String en el 
     * primer a la posició especificada pel número indicat. (Iniciem en 0)
     *<p>Tractament de casos especials
     *<p>1.-si els 2 Strings són null el mètode retornarà null,
     *<p>2.-si només un d'ells és null retornarà l'String no null,
     *<p>3.-si el número és negatiu se farà el mateix que si valguès 0,
     *<p>4.-si el número és superior a la llargada del primer String, se farà el 
           mateix que si valgués la llargada.  
     * @param primer
     * @param segon
     * @param posicio
     * @return 
     */
    
    
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
    
//------------------------------CADENA BUIDA------------------------------------

   /**
    * El mètode és un absurd que fem servir de prova i que retorna una cadena buida,
    * no té cap paràmetre.
    * @return cadena buida, un String buit.
    */
    
    public static String retornaCadenaBuida() {
        return "";
    }
//-------------------------LLEGIR LÍNIES CARÀCTER FINAL-------------------------
    
    /**
     *Aquest mètode ens retorna un String que concatena les diferents entrades 
     * per part de l'usuari fins que introdueix el caràcter que indiquem com a final.
     * @param missatge cadena/cadenes de text introduïda per usuari.
     * @param carFin caràcter que assenyala el final.
     * @return un String resultat de concatenar les diferents cadenes fins al 
     * caràcter final. Si l'usuari fa salts de línia també els contempla, i si 
     * l'usuari introdueix cadena buida no la té en compte.
     */
    
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
        
        

    }

//------------------------------JUNTA SALTEJATS---------------------------------

    /**
     *  El mètode retornarà concatenades les cadenes començant per la primera i saltant 
     *a les indicades pel número rebut com a paràmetre. A més, al principi de la cadena 
     *resultat posarà la suma de les longituds de les cadenes concatenades, havent 
     *eliminat els espais en blanc, seguit del caràcter. 
     * <p>Casos especials:
     * <p>1.-si el número de salts és inferior a 1: retornarem "0".
     * <p>2.-si el número de salts és superior o igual a 1, però:
     * no hi ha cap cadena de caràcters: retornarem "0".
     * <p>3.- Si la cadena és null retorna null.
     * <p>4.- si una de les cadenes és null, la tracta convertint el null a text i 
     * el mostra com si es tractés d'una cadena amb el text "null".
     * 
     * @param num enter que indica el nombre de cadenes que saltem.
     * @param cadenes Strings de nombre variable que s'han d'introduïr.
     * @return El mètode retorna un enter que indica la suma de les longituds de
     * les cadenes  (sense tenir en compte els espais) concatenat amb un separador
     * ":" a la cadena resultant de la concatenació de les cadenes afectades pels 
     * salts escollits.
     */
    public static String juntaSaltejats(int num, String... cadenes) {

        int cont = 0;
        String resultat = "", resultatrim = "";
        int longitud;
        
        if (cadenes == null) return null;
        if (num < 1) return "0";
        if (num >= 1 && cadenes.length == 0) return "0";
                
        String[] vector = new String[cadenes.length];
        for (int i = 0; i < vector.length; i++) {
            if (cadenes[i]==null) cadenes[i]="null ";
            vector[i] = cadenes[i];
        }

        for (int i = 0; i < vector.length; i += num) {
            resultat = resultat + vector[i];
            resultatrim = resultatrim + vector[i].trim();
        }
        longitud = resultatrim.length();

        return longitud + ":" + resultat;
    }

//---------------------------BUSCA CADENA MÚLTIPLE------------------------------
    /**
     * Aquest mètode busca quantes vegades apareix una subcadena dintre d'un text.
     * @param cadena text on hem de cercar i on pot aparèixer la subcadena.
     * @param subcadena subcadena a cercar dintre el text cadena.
     * @return Aquest mètode ens retorna n vector d'enters que conté les posicions 
     * on apareix la subcadena dins del text. 
     * 
     * Si no apareix retornem un vector de 0 caselles
     */
    
    
    public static int[] buscaCadenaMultiple(String cadena, String subcadena){
        int cont=0, index=0, 
                i;    //l'índex del vector
        int[] resultat=null;
        
        //Compto quantes aparicions hi ha per poder declarar la dimensió del vector
        do{
            index=buscaCadena(cadena,subcadena,index);
            if(index==-1) break;
            cont++;
            //Incrementem l'index per evitar el bucle infinit
            index++;
        }while(true);
        //Instancio el vector en el número de caselles indicat per la variable cont
        resultat=new int[cont];
        
        //Torno a inicialitzar les variables
        index=0;
        i=0;    //inicialitzo a 0 per què omplirem el vector d'esquerra a dreta 
        do{
            index=buscaCadena(cadena,subcadena,index);
            if(index==-1) break;
            resultat[i++]=index;
            //Incrementem l'index per evitar el bucle infinit
            index++;
        }while(true);
        
        return resultat;
        
    }
    
//---------------------------BUSCA CADENA MÚLTIPLE------------------------------
    /**
    * El mètode retornarà un String producte d'eliminar totes les aparicions del segon 
    *  String del primer a partir de la posició especificada pel número. 
    * <p>Els casos especials a tractar seran:

    *<p>1.- si el primer o el segon String són null o la cadena buida, el mètode retornarà 
    *<p>    el primer String,
    *<p>2.- si el número és negatiu se farà el mateix que si val 0,
    *<p>3.- si el número és superior a la llargada del primer String, se farà el mateix que 
    *<p>4.- si valgués la llargada, per tant retornarem el primer String.  
     * @param primer text inicial on hem de cercar el segon text
     * @param segon text a cercar , comptabilitzar i eliminar del text1
     * @param pos 
     * @return 
     */
    public static String eliminaCadena(String primer, String segon, int pos){
       //Tractament de casos especials
       
        if(primer==null || segon==null || primer.isBlank() || segon.isBlank()) return primer;
        if(pos<0) pos=0;
        if(pos>=primer.length()) return primer;
        
        //Tractament de casos normals
        String resultat=""; //hem de concatenar per mostrar al final
        
        
        int posIni=0;
        //aquest mètode ja el tenim fet abans
        //aquest retorna un enter en la posició de la cadena buscada i si no està -1
        while((pos=buscaCadena(primer,segon,pos))!=-1){
        
            resultat+=primer.substring(posIni,pos);
            //ara he de buscar la segona aparició si existeix
            //per a això li sumen la llargada de lo trobat i seguim buscant a 
            //apartir d'aquets posició
            pos+=segon.length();
            posIni=pos;
        
        
        } 
        
        //Arreglat
        resultat+=primer.substring(posIni);
        
       
        return resultat;
    }
    
}
