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
public class Rectangle2 {
    private Punt2 p1;
    private Punt2 p2;
    private double base2;
    private double altura2;
    
    public Rectangle2(Punt2 p1, Punt2 p2){
        this.p1 = new Punt2(p1.x,p1.y);
        this.p2 = new Punt2(p2.x,p2.y);
        base2 = p1.distanciaX2(p2);
        altura2 = p1.distanciaY2(p2);
    }
    
    
    public double perimetre2(){
        
        return 2 * (base2 + altura2);
    }
    
 
     public static void main(String[] args) {
         Punt2 p1 = new Punt2(3,2);
         Punt2 p2 = new Punt2(5,77);
         
         Rectangle2 r = new Rectangle2(p1,p2);
         
         System.out.println(r.perimetre2());
     }
    
}
