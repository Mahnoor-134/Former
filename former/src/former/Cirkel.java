/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package former;

import java.awt.Graphics;

/**
 *
 * @author okama01
 */
public class Cirkel extends Form {

    private int area;
    private int radie;
    private int startX; 
    private int startY; 
    private boolean fylld; 
    

    @Override
    public double getArea() {
        return radie * radie * Math.PI;
    }

   

    public Cirkel(int x, int y, int r, boolean f) {
        super(x, y);
       
         this.radie = r;
         this.fylld = f; 

    }
    @Override
     public void Draw(Graphics g) {

    }
     public String  whatAmI ( ){
         return "Cirkel";
     }
}
