/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menornumerosumadigits;

import java.util.Scanner;

/**
 *
 * @author quim
 */
public class MenorNumeroSumaDigits {


    public static String sumatoriDigits(int num) {
        
        //si el numero és més petit que 10, retorno el numero concatenat amb una cadena
        //buida ja que la funció retorna un String.
        
        if (num < 10) {
            return num + "";
        }
        
        //declaro una cadena per al resultat.
        String resultat = "";
        
        //faig la divisió de num / 9 per saber el numero de 9 que he de concatenar al resultat.
        // només afago la part entera, NO la decimal.
        int compt = num / 9;
        
        //faig el mòdul per 9 saber el numero que he de concatenar al resultat.
        if (num % 9 != 0) {
            resultat = "" + num % 9;
        }

        //faig un bucle per concatenar tants 9 com sigui el resultat de la variable compt
        while (compt != 0) {
            resultat = resultat + 9;

            compt--;
        }

        //retorno el resultat
        return resultat;

    }
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner entrada = new Scanner(System.in);
        int num = entrada.nextInt();

        while (num != 0) {

            System.out.println(sumatoriDigits(num));
            num = entrada.nextInt();

        }

    }

}
