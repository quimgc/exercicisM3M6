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
public class Punt {

    //les coordenades són reals per tant s'ha d'utilitzar float o double (double és mes efectiu).
    
    public double x;
    public double y;

    
    //per crear el Punt es necessita un constructor.
    
    public Punt() {
        
        //si no indiquem res es crea el Punt 0,0.
        this.x=0;
        this.y=0;
        
    }
    
    //es pot crear tots els constructors que vulguem.
    public Punt(double x, double y){
        this.x=x;
        this.y=y;
        
    }
    
    public double distanciaPunt(Punt p){
        return Math.sqrt(Math.pow(p.x-this.x,2)+Math.pow(p.y-this.y,2)); 
        
    }
    
    public double distanciaX(Punt p){
        return p.x - this.x; 
    }
    
    //Math.abs agafa el valor absolut sense el signe, si es negatiu retornara el valor sense el signe menys.
    
    public double distanciaY (Punt p){
        return p.y - this.y;
    }
    
    //
    public static Punt demanarPunt (){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digues un punt (x,y):");
        double x=entrada.nextDouble();
        double y=entrada.nextDouble();
        return new Punt(x,y);
    }
    
    //aquest parametre retorna el que nosaltres volem que retorni.
    
    public String toString(){
        
        return "(" + this.x + "," + this.y+ ")";
        
    }
    
    
    
    
     public static void main(String[] args) {
         
         Punt p1 = Punt.demanarPunt();
         Punt p2= Punt.demanarPunt();
         
         System.out.println(p1.distanciaX(p2));
         System.out.println(p1.distanciaY(p2));
         
         
         
         
         
         
         
         
         
         
         
         
         /*
         Punt p = new Punt();
         
         System.out.println(p);
         
         Punt p1 = new Punt(4,4);
         
         System.out.println(p.distanciaPunt(p1));
         
         
         System.out.println(p.distanciaX(p1));
         
         
         System.out.println(p.distanciaY(p1));
         */
     }
    
}
