/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package former;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author okama01
 */
public class Triangle extends Form {

    private int base;
    private int höjd;
    private int startX;
    private int startY;
    private boolean fylld;

    @Override
    public double getArea() {
        return (base * höjd) / 2;
    }

    public Triangle(int x, int y, int b, int h, boolean f) {
        super(x, y);
        this.base = b;
        this.höjd = h;
        this.fylld = f;
        color = new Color((int) (Math.random() * 255), (int) (Math.random() * 255), (int) (Math.random() * 255));

    }

    @Override
    public void Draw(Graphics g) {
        
        g.setColor(color);
        int [] xPoint ={xPos, xPos + base / 2, xPos + base}; 
        int [] yPoint ={yPos, yPos - höjd, yPos };
        g.fillPolygon(xPoint, yPoint, 3);
        g.drawPolygon(xPoint, yPoint, 3);
     
    }

    public String whatAmI() {
        return "En triangel";
    }
}
