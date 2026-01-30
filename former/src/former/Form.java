/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package former;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.io.Serializable;

/**
 *
 * @author okama01
 */
public abstract class Form implements Serializable {

    private int xPos;
    private int yPos;
    private boolean running;
    private boolean positiveRiktning;
    private Color color;

    public Form(int x, int y) {
        this.xPos = x;
        this.yPos = y;
    }

    public int getXPos() {
        return xPos;
    }

    public int getYPos() {
        return yPos;
    }

    public void setrunning(boolean running) {

    }

    public void move(int x, int y) {
    }

    public abstract double getArea();

    public abstract void Draw(Graphics g);

    public abstract String whatAmI();
    
    
    public double skrivUt(){
  
        return this.getArea(); 
    }
}
