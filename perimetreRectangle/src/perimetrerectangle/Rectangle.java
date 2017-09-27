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
public class Rectangle {
   private Punt p1;
   private Punt p3;
   private double base; 
   private double altura;
    
    //constructor
    public Rectangle(Punt p1, Punt p3){
        
        this.p1= new Punt(p1.x,p1.y);
        this.p3= new Punt(p3.x,p3.y);
        this.base = p1.distanciaX(p3);
        this.altura =p1.distanciaY(p3);
    }
    
    
    public double Perimetre(){
        
        return 2*(base + altura);
    }
    
    public double Area(){
        return (base * altura);
    }
    
    public Punt Centre(){
        return new Punt(p1.x + base/2, p1.y + altura/2);
    }
    
    
    public Punt CentreV2(){
        return new Punt((p1.x+p3.x)/2,(p1.y+p3.y)/2);
    }
    
    public static void main(String[] args) {
        
        Punt p1 = new Punt(0,0);
        Punt p2 = new Punt(2,3);
        
        Rectangle r = new Rectangle(p1,p2);
     
        System.out.println(p1);
        System.out.println(p2); 
        
        System.out.println(r.Perimetre());
        
         }
        
}
