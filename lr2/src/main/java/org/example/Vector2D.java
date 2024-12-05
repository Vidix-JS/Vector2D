package org.example;

import java.util.Locale;

public class Vector2D {
    private double vX; // Значение проекции вектора оси
    private double vY; // Значение проекции вектора оси

    public Vector2D(){ // конструктор без параметров
        this.vX = 1;
        this.vY = 1;
    }

    public Vector2D(double vX, double vY){
        this.vX = vX;
        this.vY = vY;
    }
    public Vector2D(Vector2D v){ // конструктор копирования
        this.vX = v.vX;
        this.vY = v.vY;
    }

    public void print(){ // метод для вывода
        System.out.print("(");
        System.out.print(String.format(Locale.US, "%.2f", vX));
        System.out.print(", ");
        System.out.print(String.format(Locale.US, "%.2f", vY) + ")\n");
    }

    public double getvX() {
        return vX;
    }

    public void setvX(double vX) {
        this.vX = vX;
    }

    public double getvY() {
        return vY;
    }

    public void setvY(double vY) {
        this.vY = vY;
    }
    public void add(Vector2D v){ //Метод прибавляющий вектор, указанный в аргументе, к текущему.
        this.vX = this.vX + v.vX;
        this.vY = this.vY + v.vY;
    }
    public double length(){
        return Math.sqrt((Math.pow(this.vX, 2) + Math.pow(this.vY, 2)));
    }
}
