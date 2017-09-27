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

/*
A partir d’aquesta classe feu una classe polígon per representar un polígon tancat. 
Cal emmagatzemar la llista de punts fins el darrer punt, que ha de ser el mateix que el primer.
Podeu fer servir un array. 
Heu de calcular el perímetre d’aquest polígon.

 */
public class Poligon {
    
    
Punt punts[];
int numCostats;
int puntActual;


//constructor que crea un poligon apartir d'un array.
    public Poligon(Punt punts[]) {
        this.punts = punts;
        this.numCostats = punts.length;
        this.puntActual = numCostats;
    }
    
    //constructor per omplir l'array punts[] amb el num de costats.
    
    //inicialitzem variables;
    public Poligon(int numCostats){
        
        this.numCostats = numCostats;
        punts = new Punt[numCostats];
        this.puntActual = 0;
    }
    
    public void afegirPunt (Punt p){
        if(this.puntActual < this.numCostats){
            punts[this.puntActual++] = p;
        } else {
            System.out.println("Massa punts");
        }
    }
    
    
    //
    public double calcularPerimetre(){
        double perimetre=0.0;
        
                            //this.numCostats                
        for (int i = 0; i < punts.length; i++) {
            int j = i+1;
            // si j és mes gran o igual que la longitud de l'array, es posa j = 0;
            if(j>=punts.length){
                j=0;
            }
            //sumo el calcul entre els punts.
            perimetre += punts[i].distanciaPunt(punts[j]);
        }
        
        //retorno el resultat.
        return perimetre;
    }
    

    
    
    public static void main(String[] args) {
      
        //aqui estem crear un array de punts
        Punt punts[] = {new Punt (0,0), new Punt (0,2), new Punt(2,2), new Punt(2,0)};
        
        //passo l'array de punts al constructor Poligon (el que accepta arrays)
        Poligon p = new Poligon(punts);
        
        //mostro el resultat de p.
        System.out.println(p.calcularPerimetre());
        
        Poligon p1 = new Poligon(4);
        
        p1.afegirPunt( new Punt (0,0));
        p1.afegirPunt( new Punt (0,2));
        p1.afegirPunt( new Punt (2,2));
        p1.afegirPunt( new Punt (2,0));

        System.out.println(p1.calcularPerimetre());
    }

}
