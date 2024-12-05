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
}
