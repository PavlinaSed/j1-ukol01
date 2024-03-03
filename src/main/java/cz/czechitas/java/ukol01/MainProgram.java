package cz.czechitas.java.ukol01;

import cz.czechitas.java.ukol01.engine.Turtle;

import java.awt.*;

public class MainProgram {
    private Turtle zofka;

    public static void main(String[] args) {
        new MainProgram().start();
    }

    public void start() {
        zofka = new Turtle();

        zofka.setPenColor(Color.decode("100011"));

        drawPiglet();
    }

    public void drawPiglet() {
        zofka.turnLeft(90);

        drawHouse();
        zofka.move(150);
        zofka.turnLeft(55);

        drawLegs();
        zofka.turnRight(125);
        zofka.move(150);
        zofka.turnRight(125);

        drawLegs();
        zofka.turnRight(35);

        drawTail();
    }

    public void drawHouse() {
        for (int i = 0; i < 2; i++) {
            zofka.move(150);
            zofka.turnRight(90);
            zofka.move(100);
            zofka.turnRight(90);
        }
        zofka.move(150);
        zofka.turnRight(45);
        zofka.move(Math.sqrt(2) * 50);
        zofka.turnRight(90);
        zofka.move(Math.sqrt(2) * 50);
        zofka.turnRight(135);
        zofka.move(100);
        zofka.turnLeft(90);
        zofka.move(150);
        zofka.turnRight(180);
    }

    public void drawLegs() {
        zofka.move(30);
        zofka.turnRight(180);
        zofka.move(30);
        zofka.turnRight(110);
        zofka.move(30);
        zofka.turnLeft(180);
        zofka.move(30);
    }

    public void drawTail() {
        zofka.move(50);
        zofka.turnRight(90);
        zofka.move(30);
        zofka.turnRight(180);
        zofka.move(30);
        zofka.turnLeft(90);
        zofka.move(50);
        zofka.turnRight(180);
    }

}


