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

    }

    @Override
    public void Draw(Graphics g) {
        //  g.setColor(Color.RED);
        //    g.drawOval(55, 50, 50, 50);
        //  g.fillOval(55, 50, 50, 50);
         

       // super.Draw(g);
        

        Color Color = new Color(0, 0, 0);
        g.setColor(Color);
        g.fillRect(40, 40, 80, 150);

    }

    public String whatAmI() {
        return "Triangel";
    }
}
