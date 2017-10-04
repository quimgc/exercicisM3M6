/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menornumero;

import java.util.Scanner;

/**
 *s
 * @author quim
 */
public class MenorNumero {

    int numeroMesPetit = Integer.MAX_VALUE;

    int primerNumero;

    public MenorNumero(int num) {
        this.primerNumero = num;

    }
    
    
    
    
    
    
    
    

    /**
     * *
     * Demano numeros amb un interval de 1 i 1000. 0 per acabar. El primer While
     * fa que si num és més gran que 0, entri. El segon While fa que si num és
     * superior a 1000 torni a demanar un numero i indica amb un missatge que el
     * numero ha sigut superior a 1000. Per ultim envio el num al mètode
     * convertirNumToString.
     */
    public void comprovarNums(int num, int suma) {
        if (suma==primerNumero) {
            if(num<numeroMesPetit){
                this.numeroMesPetit=num;
            }
        }

    }
    
    
    
    
    

    /**
     * *
     * Passo per parametre l'string anterior (conté el numero). recorro l'string
     * i sumo els numeros, si és igual a el primer numero, aguardo l'string
     * passat.
     *
     * @param num
     */
    public int sumarNumeros(int num) {
        //converteixo a String el numero passat per parametre.
        String numero = Integer.toString(num);

        int sumatori = 0;

        for (int i = 0; i < numero.length(); i++) {
            sumatori += Integer.parseInt("" + numero.charAt(i));
        }

        return sumatori;
     
    }
    
    
    
    
    
    
    
    /***
     * Retorno el numeroMesPetit
     * @return 
     */
    public int numMesPetit(){
        return numeroMesPetit;
    }

    public static void main(String[] args) {
        // TODO code application logic here

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digues numeros entre 1 i 1000 (0 per acabar): ");
        int num = entrada.nextInt();
        MenorNumero obj = new MenorNumero(num);

        while (num != 0) {
            num = entrada.nextInt();

            if (!(num > 1000)) {

                obj.comprovarNums(num,obj.sumarNumeros(num));

            }

        }

        System.out.println(obj.numMesPetit());

    }

}
