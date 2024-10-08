package ru.vsu.cs.design.g12.filina_v_d.task1;

import java.awt.*;

public class Balloon {
    private int x;
    private int y;
    private int r;
    private int w;
    private int h;
    private Color balloon;
    private Color basket;
    private Color rope;

    public Balloon(int x, int y, int r, int w, int h, Color balloon, Color basket, Color rope) {
        this.x = x;
        this.y = y;
        this.r = r;
        this.w = w;
        this.h = h;
        this.balloon = balloon;
        this.basket = basket;
        this.rope = rope;
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

    public Color getBalloon() {
        return balloon;
    }

    public void setBalloon(Color balloon) {
        this.balloon = balloon;
    }

    public Color getBasket() {
        return basket;
    }

    public void setBasket(Color basket) {
        this.basket = basket;
    }

    public Color getRope() {
        return rope;
    }

    public void setRope(Color rope) {
        this.rope = rope;
    }

    public void draw(Graphics2D g) {
        g.setPaint(balloon);
        g.fillOval(x, y, r * 2, r * 2);


        g.setPaint(rope);
        g.drawLine(x + r / 2, y + r * 2 - 13, x + r - w / 2, y + r * 2 + h);
        g.drawLine(x + r * 3 / 2, y + r * 2 - 13, x + r + w / 2, y + r * 2 + h);

        g.setPaint(basket);
        g.fillRect(x + r - w / 2, y + r * 2 + h, w, h);
    }
}

