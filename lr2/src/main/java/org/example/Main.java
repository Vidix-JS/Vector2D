package org.example;

public class Main {
    public static void main(String[] args) {
        Vector2D vA = new Vector2D();
        Vector2D vB = new Vector2D(1.0, 3.0);
        Vector2D vC = new Vector2D(vB);
        vA.print();
        vA.add(vB);
        vA.print();
        System.out.println(vB.length());
        vA.sub(vC);
        vA.print();
        vC.scale(2);
        vC.print();
    }
}