/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perimetrerectangle;

import java.util.Scanner;

/**
 *
 * @author quim
 */
public class perimetreRectangleNOPOO {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int a = entrada.nextInt();
        int b = entrada.nextInt();
        
        while(a>0 && b>0){
            System.out.println(2*(a+b));
            a=entrada.nextInt();
            b=entrada.nextInt();
            
        };
        entrada.close();
        
    }

}
