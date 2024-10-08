package ru.vsu.cs.design.g12.filina_v_d.task1;

import java.awt.*;

public class Cloud {
    private int x;
    private int y;
    private int r;
    private Color c;

    public Cloud(int x, int y, int r, Color c) {
        this.x = x;
        this.y = y;
        this.r = r;
        this.c = c;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    public Color getC() {
        return c;
    }

    public void setC(Color c) {
        this.c = c;
    }

    public void draw(Graphics2D g) {
        g.setPaint(c);
        g.fillArc(x, y, r, r, 0, 180);
        g.fillArc(x + r, y, r, r, 0, 180);
        g.fillArc(x + r / 2, y, r, r, 0, 180);
        g.fillArc(x + r / 2, y - r / 4, r, r, 0, 180);
    }

}