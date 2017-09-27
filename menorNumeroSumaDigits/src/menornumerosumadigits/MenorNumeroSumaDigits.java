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

        if (num < 10) {
            return num + "";
        }
        String resultat = "";
        int compt = num / 9;
        if (num % 9 != 0) {
            resultat = "" + num % 9;

        }

        while (compt != 0) {
            resultat = resultat + 9;

            compt--;
        }

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
