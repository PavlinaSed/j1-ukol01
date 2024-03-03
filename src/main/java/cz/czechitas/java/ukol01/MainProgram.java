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

        newPositionDown();
        newPositionRight();

        drawPiglet();

        newPositionSun();
        drawSun();

        newPositionRight();
        newPositionRight();
        drawOctagon();
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

    public void newPositionRight() {
        zofka.penUp();
        zofka.turnRight(90);
        zofka.move(150);
        zofka.turnLeft(90);
        zofka.penDown();
    }

    public void newPositionDown() {
        zofka.penUp();
        zofka.turnLeft(180);
        zofka.move(400);
        zofka.turnLeft(180);
        zofka.penDown();
    }

    public void newPositionLeft() {
        zofka.penUp();
        zofka.turnLeft(90);
        zofka.move(100);
        zofka.turnRight(90);
        zofka.penDown();
    }

    public void newPositionSun() {
        zofka.penUp();
        for (int i = 0; i < 4; i++) {
            this.newPositionLeft();
        }
        zofka.penUp();
        zofka.move(550);
        zofka.penDown();
    }

    public void drawSun() {
        for (int i = 0; i < 18; i++) {
            zofka.turnRight(20);
            zofka.move(20); //proportionally increases or decreases the size of the sun
            drawSunbeam();
        }
        zofka.turnLeft(5);
    }

    public void drawSunbeam() {
        zofka.turnLeft(90);
        zofka.move(40);
        zofka.turnLeft(180);
        zofka.move(40);
        zofka.turnLeft(90);
    }

public void drawOctagon() {
    for (int i = 0; i < 8; i++) {
        zofka.turnRight(45);
        zofka.move(30);
    }
    zofka.turnLeft(5);
}


}


