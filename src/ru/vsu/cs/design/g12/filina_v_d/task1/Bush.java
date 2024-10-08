package ru.vsu.cs.design.g12.filina_v_d.task1;

import java.awt.*;

public class Bush {
    private int x;
    private int y;
    private int w;
    private int h;
    private int r;
    private Color bush;

    public Bush(int x, int y, int r, int w, int h, Color bush) {
        this.x = x;
        this.y = y;
        this.r = r;
        this.w = w;
        this.h = h;
        this.bush = bush;
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

    public int getW() {
        return w;
    }

    public void setW(int w) {
        this.w = w;
    }

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    public Color getBush() {
        return bush;
    }

    public void setBush(Color bush) {
        this.bush = bush;
    }

    public void draw(Graphics2D g) {
        g.setPaint(bush);
        g.fillArc(x,y+r/4, r,r,0,180);
        g.fillArc(x+r/2,y, r,3*r/2, 0,180);
        g.fillArc(x+r,y+r/4, r,r,0,180);
    }
}
