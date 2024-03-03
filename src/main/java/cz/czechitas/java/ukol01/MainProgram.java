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

        newPositionFirstHouse();
        drawHouse();
        newPositionUp();
        drawHouse();
        drawRowOfHouses();
        newPositionLastHouse();
        drawHouse();

        newPositionName();
        writeName();
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

    public void drawRowOfHouses() {
        for (int i = 0; i < 4; i++) {
            newPositionRight();
            drawHouse();
        }
    }

    public void writeName() {
        drawLetterP();
        newPositionLetter();
        drawLetterA();
        newPositionLetter();
        drawLetterV();
        newPositionLetter();
        drawLetterK();
        newPositionLetter();
        drawLetterA();
    }

    public void drawLetterP() {
        zofka.move(100);
        zofka.turnRight(90);

        for (int i = 0; i < 5; i++) {
            zofka.move(10);
            zofka.turnRight(90);
            zofka.move(5);
            zofka.turnLeft(90);
        }
        zofka.turnRight(90);
        zofka.move(20);
        zofka.turnRight(90);

        for (int i = 0; i < 5; i++) {
            zofka.move(10);
            zofka.turnLeft(90);
            zofka.move(5);
            zofka.turnRight(90);
        }
        zofka.turnLeft(90);
        zofka.move(50);
        zofka.turnLeft(180);
    }

    public void drawLetterA() {
        zofka.turnRight(25);
        zofka.move(110);
        zofka.turnRight(135);
        zofka.move(105);
        zofka.turnRight(180);
        zofka.move(60);
        zofka.turnLeft(65);
        zofka.move(35);
        zofka.turnRight(180);
        zofka.move(35);
        zofka.turnRight(65);
        zofka.move(60);
        zofka.turnLeft(160);
    }

    public void drawLetterV() {
        zofka.turnLeft(25);
        zofka.move(100);
        zofka.turnLeft(180);
        zofka.move(100);
        zofka.turnLeft(135);
        zofka.move(100);
        zofka.turnLeft(180);
        zofka.move(100);
        zofka.turnRight(160);
    }

    public void drawLetterK() {
        zofka.move(100);
        zofka.turnRight(180);
        zofka.move(40);
        zofka.turnLeft(40);
        zofka.move(70);
        zofka.turnLeft(180);
        zofka.move(70);
        zofka.turnRight(85);
        zofka.move(50);
        zofka.turnRight(180);
        zofka.move(50);
        zofka.turnLeft(45);
        zofka.move(60);
        zofka.turnLeft(180);
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

    public void newPositionUp() {
        zofka.penUp();
        zofka.move(230);
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

    public void newPositionLastHouse() {
        zofka.penUp();
        zofka.turnLeft(180);
        zofka.move(230);
        zofka.turnLeft(180);
        zofka.penDown();
    }

    public void newPositionFirstHouse() {
        newPositionDown();
        newPositionLeft();
        zofka.penUp();
        zofka.turnRight(180);
        zofka.move(150);
        zofka.turnRight(180);
        zofka.penDown();
        zofka.turnRight(5);
    }

    public void newPositionName() {
        zofka.penUp();
        zofka.move(500);
        zofka.turnLeft(90);
        zofka.move(320);
        zofka.turnRight(90);
        zofka.penDown();
    }

    public void newPositionLetter() {
        zofka.penUp();
        zofka.turnRight(90);
        zofka.move(55);
        zofka.turnLeft(90);
        zofka.penDown();
    }

/*
    public void drawOctagon() {
    for (int i = 0; i < 8; i++) {
        zofka.turnRight(45);
        zofka.move(30);
    }
    zofka.turnLeft(5);
}
*/

}


