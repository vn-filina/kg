package ru.vsu.cs.design.g12.filina_v_d.task1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.Random;

public class DrawPanel extends JPanel {

    private static final Random rnd = new Random();
    private Sun sun;
    private Background back;
    private java.util.List<Mountain> mountain = new ArrayList<>();
    private java.util.List<Cloud> cloud = new ArrayList<>();
    private java.util.List<Flower> flower = new ArrayList<>();
    private Balloon balloon;
    private java.util.List<Bush> bush = new ArrayList<>();

    private static final Color[] COLORS = {Color.RED, Color.MAGENTA, Color.PINK};

    private Timer t = new Timer(170, new AbstractAction() {
        @Override
        public void actionPerformed(ActionEvent e) {
            for (Cloud cloud : cloud) {
                cloud.setX(cloud.getX() + 1);
            }
            balloon.setX(balloon.getX()+1);
            repaint();

        }
    });

    public DrawPanel() {
        sun = new Sun(200, 14, 56, 94, 17, new Color(255, 213, 3, 247));

        back = new Background(0, 0, 900, 470, new Color(143, 228, 245, 116), new Color(82, 213, 36, 166));

        for (int i = 0; i < 3; i++) {
            cloud.add(new Cloud(rnd.nextInt(800), rnd.nextInt(170), 90, new Color(255, 255, 255, 255)));

        }

        for (int i = 0; i < 7; i++) {
            mountain.add(new Mountain(-100 + rnd.nextInt(800), 470, 100 + rnd.nextInt(100), 150 + rnd.nextInt(350), new Color(255, 255, 255, 250), new Color(73, 39, 11, 255)));
        }


        for (int i = 0; i < 35; i++) {
            flower.add(new Flower(10 + rnd.nextInt(600), 470 + rnd.nextInt(320), 5, 25, 9, new Color(144, 103, 166, 250)));
        }

        bush.add(new Bush(70, 510, 120, 100, 50, new Color(35, 173, 63, 250)));
        bush.add(new Bush(510, 490, 170, 100, 70, new Color(35, 173, 63, 250)));

        balloon = new Balloon(30, 100, 100, 80, 45, COLORS[rnd.nextInt(COLORS.length)], new Color(250, 115, 4), Color.BLACK);

        t.start();
    }


    @Override
    public void paint(Graphics g) {
        super.paint(g);

        back.draw((Graphics2D)g);

        sun.draw((Graphics2D)g);

        for (Mountain mountain : mountain) {
            mountain.draw((Graphics2D) g);
        }

        for (Cloud cloud : cloud) {
            cloud.draw((Graphics2D) g);
        }

        for (Flower flower : flower) {
            flower.draw((Graphics2D) g);
        }

        for (Bush bush : bush) {
            bush.draw((Graphics2D) g);
        }

        balloon.draw((Graphics2D)g);

    }
}



