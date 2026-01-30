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
public class Rektangel extends Form {

    private int base;
    private int höjd;
    private int startX;
    private int startY;
    private boolean fylld;

    /**
     *
     * @return
     */
    @Override
    public double getArea() {
        return base * höjd;
    }

    public Rektangel(int x, int y, int b, int h, boolean f) {
        super(x, y);
        this.base = b;
        this.höjd = h;
        this.fylld = f;
        color = new Color((int) (Math.random() * 255), (int) (Math.random() * 255), (int) (Math.random() * 255));
    }

    @Override
    public void Draw(Graphics g) {
        g.setColor(color);
        g.fillRect(xPos, yPos, base, höjd);
      
    }

    @Override
    public String whatAmI() {
        return "En rektangel";
    }
}
