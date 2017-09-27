/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perimetrerectangle;

/**
 *
 * @author quim
 */
public class Punt2 {
 double x;
 double y;
    
    
    public Punt2(){
        
        this.x=0;
        this.y=0;
        
    }
    
    public Punt2(double x, double y){
        this.x=x;
        this.y=y;
    }
    
    
    public double distanciaX2(Punt2 p){
        
        return p.x - this.x;
    }
    
    public double distanciaY2(Punt2 p){
        return p.y - this.y;
        
    }
    
    public double distanciaPunt2(Punt2 p){
        return Math.sqrt(Math.pow(p.x-this.x,2)+Math.pow(p.y-this.y,2));
    }
    

   
    
}
