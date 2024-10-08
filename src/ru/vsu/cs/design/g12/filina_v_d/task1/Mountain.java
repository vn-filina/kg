package ru.vsu.cs.design.g12.filina_v_d.task1;

import java.awt.*;

public class Mountain {
    private int x;
    private int y;
    private int w;
    private int h;
    private Color snow, mount;

    public Mountain(int x, int y, int w, int h, Color snow, Color mount) {
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
        this.snow = snow;
        this.mount = mount;
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

    public Color getSnow() {
        return snow;
    }

    public void setSnow(Color snow) {
        this.snow = snow;
    }

    public Color getMount() {
        return mount;
    }

    public void setMount(Color mount) {
        this.mount = mount;
    }

    public void draw(Graphics2D g) {
        g.setPaint(mount);
        Polygon mountC = new Polygon();
        mountC.addPoint(x, y);
        mountC.addPoint(x+w/2, y-h);
        mountC.addPoint(x+w, y);
        g.fillPolygon(mountC);


        g.setPaint(mount.darker());
        g.drawPolygon(mountC);

        g.setPaint(snow);
        Polygon triangle2 = new Polygon();
        triangle2.addPoint(x+w/2-w/10-1, y-h+h/5);
        triangle2.addPoint(x+w/2, y-h-h/10);
        triangle2.addPoint(x+w/2+w/10+1, y-h+h/5);
        g.fillPolygon(triangle2);

    }
}
