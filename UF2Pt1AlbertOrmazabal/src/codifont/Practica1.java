package codifont;
import java.util.Arrays;
import java.util.Scanner;

/**
 AQUESTA LÍNIA LA MODIFICO DESDE EL GITHUB REMOT 
 
 AFEGEIXO UNA SEGONA LÍNIA ARA EN LOCAL

 AFEGEIXO UNA TERCERA LINIA DESDE UNA BRANCA NOVA BRANCH2

 */
public class Practica1 {

    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int[] v = new int[]{1, 2, 3, 4};
        int[] proves;
        int[] v2 = null;
        int num = 0, selectBool = 0, caselles = 0, valors, cont = 0, tipusVector, manAuto;
        boolean opcio = true;

//Vols fer prova manual o automàtica?
        System.out.println("PREM ( 1 ) SI VOLS FER PROVA MANUAL.");
        System.out.println("PREM ( 2 ) SI VOLS QUE FACI LES PROVES AUTOMÀTICAMENT.");

        do {
            manAuto = ent.nextInt();
            if (manAuto != 1 && manAuto != 2) {
                System.out.println("Opció no vàlida!");

            } else {
                break;
            }
        } while (true);

//-----------------BLOC DE PROVES AUTOMÀTIQUES----------------------------- 
        if (manAuto == 2) {
            //----------------TEST 1--------------
            System.out.println("---------Test 1--------- ");
            System.out.println("v [1,2,3,4]");
            System.out.println("PARÀMETRES INRODUÏTS: (v, 2, true)");
            int[] mostrar = operaVector(v, 2, true);
            System.out.println("\nEl vector inicial és :" + Arrays.toString(v));
            System.out.println("El mètode retorna: " + Arrays.toString(mostrar));

            //----------------TEST 2--------------
            System.out.println("\n---------Test 2--------- ");
            System.out.println("v [1,2,3,4]");
            int[] vTest2 = new int[]{1, 2, 3, 4};
            System.out.println("PARÀMETRES INRODUÏTS: (v, 2, false)");
            int[] mostrar2 = operaVector(vTest2, 2, false);
            System.out.println("\nEl vector inicial és :" + Arrays.toString(vTest2));
            System.out.println("El mètode retorna: " + Arrays.toString(mostrar2));

            //----------------TEST 3--------------
            System.out.println("\n---------Test 3--------- ");
            System.out.println("v null");
            int[] vTest3 = null;
            System.out.println("PARÀMETRES INRODUÏTS: (null, 2, true)");
            int[] mostrar3 = operaVector(null, 2, true);
            System.out.println("\nEl vector inicial és :" + Arrays.toString(vTest3));
            System.out.println("El mètode retorna: " + Arrays.toString(mostrar3));

            //----------------TEST 4--------------
            System.out.println("\n---------Test 4--------- ");
            System.out.println("v null");
            int[] vTest4 = null;
            System.out.println("PARÀMETRES INRODUÏTS: (null, 2, false)");
            int[] mostrar4 = operaVector(null, 2, false);
            System.out.println("\nEl vector inicial és :" + Arrays.toString(vTest4));
            System.out.println("El mètode retorna: " + Arrays.toString(mostrar4));

        } else //-----------------BLOC DE PROVES MANUALS----------------------------- 
        if (manAuto == 1) {
            // Li demano a l'usuari si vol usar vector o null
            System.out.println("\nSEL·LECCIONA OPCIÓ 1, 2 o 3 :\n");
            System.out.println("1 VECTOR INICIAL \n2 NULL\n3 INTRODUÏR EL VECTOR D'ENTERS");

            do {
                tipusVector = ent.nextInt();
                if (tipusVector != 1 && tipusVector != 2 && tipusVector != 3) {
                    System.out.println("Opció no vàlida!");

                } else {
                    break;
                }
            } while (true);
            if (tipusVector == 1) {

                System.out.println("VECTOR INICIAL: " + Arrays.toString(v));
            }
            if (tipusVector == 2) {
                v = null;
                System.out.println("VECTOR INICIAL: NULL");
            }

            if (tipusVector == 3) {
                System.out.println("QUANTS ENTERS VOLS INTRODUÏR?");
                do {
                    caselles = ent.nextInt();
                    if (caselles < 0) {
                        System.out.println("Opció no vàlida");
                    } else {
                        break;
                    }
                } while (true);

                v2 = new int[caselles];
                System.out.println("INTRODUEIX ELS ENTERS DEL VECTOR:");
                do {

                    valors = ent.nextInt();
                    v2[cont] = valors;
                    cont++;
                } while (cont < caselles);

            }

            // Li demanem un enter a sumar (li deixo que sigue positiu o negatiu):
            System.out.println("ENTER A SUMAR (POT SER NEGATIU): ");
            num = ent.nextInt();

            // Li demano a l'usuari si vol conservar el vector original o modificar-lo
            System.out.println("1 TRUE - NO CONSERVAR \n2 FALSE - CONSERVAR");

            do {
                selectBool = ent.nextInt();
                if (selectBool != 1 && selectBool != 2) {
                    System.out.println("Opció no vàlida!");

                } else {
                    break;
                }
            } while (true);
            if (selectBool == 1) {
                opcio = true;
            }
            if (selectBool == 2) {
                opcio = false;
            }
//-----------------------RESULTATS MANUALS----------
//Mostra el resultat true amb vector personalitzat
            if (selectBool == 1 && tipusVector == 3) {
                int[] mostrar = operaVector(v2, num, opcio);
                System.out.println("\n\n\nEl vector inicial és :" + Arrays.toString(v2));
                System.out.println("El mètode retorna: " + Arrays.toString(mostrar));
            }
//Mostra el resultat true amb vector null o vector per defecte        
            if (selectBool == 1 && (tipusVector == 1 || tipusVector == 2)) {
                int[] mostrar = operaVector(v, num, opcio);
                System.out.println("\n\n\nEl vector inicial és :" + Arrays.toString(v));
                System.out.println("El mètode retorna: " + Arrays.toString(mostrar));
            }
//Mostra el resultat false amb vector personalitzat
            if (selectBool == 2 && tipusVector == 3) {
                int[] mostrar = operaVector(v2, num, opcio);
                System.out.println("\n\n\nEl vector inicial és :" + Arrays.toString(v2));
                System.out.println("El mètode retorna: " + Arrays.toString(mostrar));
            }
//Mostra el resultat false amb vector per defecte
            if (selectBool == 2 && (tipusVector == 1 || tipusVector == 2)) {
                int[] mostrar = operaVector(v, num, opcio);
                System.out.println("\n\n\nEl vector inicial és :" + Arrays.toString(v));
                System.out.println("El mètode retorna: " + Arrays.toString(mostrar));
            }
        }
    }

//--------------------------MÈTODE operaVector--------------------------------
    public static int[] operaVector(int[] vectorMetode, int quantitat, boolean conservaVector) {

//declaro un vector que serà el que contindrà el resultat de la suma         
        int[] resultat;

//tracto el cas de null
        if (vectorMetode != null) {

            if (conservaVector) {

                //recorro el vector sumant la quantitat al contingut de les caselles    
                for (int i = 0; i < vectorMetode.length; i++) {
                    vectorMetode[i] = vectorMetode[i] + quantitat;

                }
                //finalment tenim el vector resultat i sortim retornant null 

                return null;

            } else {
                
                //declarem un vector copia amb la mateixa mida         
                int[] suma = new int[vectorMetode.length];
                
                //el recorrem i l'omplim del resultat de vector original+enter
                for (int i = 0; i < vectorMetode.length; i++) {
                    suma[i] = vectorMetode[i] + quantitat;
                }

                //retornem el vector còpia resultant sense afectar a l'original
                return suma;
            }
//si és nul retorna null directament        

        } else {
            return null;
        }
    }

}
