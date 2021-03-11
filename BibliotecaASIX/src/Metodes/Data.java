/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metodes;

/**
 *
 * @author alumne
 */
public class Data {
    
    public static boolean esBixest(int any){
    
        return any>1582 && (any%400==0 || (any%4==0 && any%100!=0)); 
    
    }
    
    
    public static boolean dataCorrecta(int dia, int mes, int any){
    
        int[] mesos=new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
        //Tractar dia
        if(dia<1 || dia>31) return false;
        
        //Tractar mes
        if(mes<1 || mes>12) return false;
        
        //Demanar any i mirem si és bixest
        //Si és bixest i han triat el febrer, actualitzem els dies a 29
        if(esBixest(any) && mes==2) mesos[1]=29;
        
        
        //Mirem si la data és correcta --> dia està entre 1 i 31
        return dia<=mesos[mes-1];
    
    }
    
    public static int[] diaSeguent(int dia, int mes, int any){
        //Primer comprovem si la data rebuda per paràmetre és correcta
        if(dataCorrecta(dia,mes,any)==false) return null;
        
        //A partir d'aquí se que la data és correcta
        
        //Primer miro si sumant un al dia tinc una data correcta, i en cas
        //afirmatiu retorna esta nova data
        if(dataCorrecta(dia+1,mes,any)) return new int[]{dia+1,mes,any};
        
        //Ara ja sabem que estem a final de mes.Mirem si sumant.li un al mes i
        //situant-nos al dia 1 la data és correcta
        if(dataCorrecta(1,mes+1,any)) return new int[]{1,mes+1,any};
        
        //Ara sabem que estem a l'últim dia de l'any
        return new int[]{1, 1, any+1};
        
    }
    
    /**
     * Retorna 1 si la primera data és major que la segona, 0 si són iguals, i 
     * -1 si la primera és menor que la segona. A més, si alguna de les dates no 
     * és correcta retorna -2.
     * @param dia1 dia de la primera data a comparar
     * @param mes1 mes de la primera data a comparar
     * @param any1 any de la primera data a comparar
     * @param dia2 dia de la segona data a comparar
     * @param mes2 mes de la segona data a comparar
     * @param any2 any de la segona data a comparar
     * @return Retorna 1 si la primera data és major que la segona, 0 si són 
     * iguals, i -1 si la primera és menor que la segona.
     */
    public static int comparaDates(int dia1, int mes1, int any1, int dia2, int mes2, int any2){
        if(!dataCorrecta(dia1,mes1,any1) || !dataCorrecta(dia2,mes2,any2)) return -2;
        
        //Comprovem els anys
        if(any1<any2) return -1;
        else if(any1>any2) return 1;
        
        //Comprovo els mesos, sabent que l'any és el mateix a les 2 dates
        if(mes1<mes2) return -1;
        else if(mes1>mes2) return 1;
        
        //Comprovo els dies, sabent que l'any i mes és el mateix a les 2 dates
        if(dia1<dia2) return -1;
        else if(dia1>dia2) return 1;
        
        //Sé que l'any ,mes i dia són els mateixos a les 2 dates
        return 0;
    }
    
    
    public static int diferenciaDies(int dia1, int mes1, int any1, int dia2, int mes2, int any2){
        int dies=0;         //comptador de dies entre les dates
        
        switch(comparaDates(dia1,mes1,any1,dia2,mes2,any2)){
            case -2:    //Hi ha alguna data incorrecta, per tant acabem retornant -1
                return -1;
            case -1:    //La primera data és inferior a la segona, per tant iterem
                        //des de la primera fins la segona
                
                while(comparaDates(dia1,mes1,any1,dia2,mes2,any2)!=0){
                    int[] dema=diaSeguent(dia1, mes1, any1);
                    dia1=dema[0];
                    mes1=dema[1];
                    any1=dema[2];
                    dies++;
                }
                return dies;
            case 0:     //Les dates són idèntiques, per tant hi ha 0 dies de diferència 
                return 0;
            case 1:      //La primera data és major que la segona, per tant iterem
                        //des de la segona fins la primera
                while(comparaDates(dia1,mes1,any1,dia2,mes2,any2)!=0){
                    int[] dema=diaSeguent(dia2, mes2, any2);
                    dia2=dema[0];
                    mes2=dema[1];
                    any2=dema[2];
                    dies++;
                }
                return dies;
        }
    
        return 0;
    }
    
    
    
}
