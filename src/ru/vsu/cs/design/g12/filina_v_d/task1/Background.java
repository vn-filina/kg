package ru.vsu.cs.design.g12.filina_v_d.task1;

import java.awt.*;

public class Background {
    private int x;
    private int y;
    private int w;
    private int h;
    private Color sky, grass;


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

    public Color getSky() {
        return sky;
    }

    public void setSky(Color sky) {
        this.sky = sky;
    }

    public Color getGrass() {
        return grass;
    }

    public void setGrass(Color grass) {
        this.grass = grass;
    }

    public Background(int x, int y, int w, int h, Color sky, Color grass) {
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
        this.sky = sky;
        this.grass = grass;
    }

    public void draw(Graphics2D g){
        g.setPaint(sky);
        g.fillRect(x,y,w,h);

        g.setPaint(grass);
        g.fillRect(x,y+h,w,2*h);
    }

}
