package org.example.calculator;

public class Calculator {
    public Calculator() {
    }

    public Integer adunare(int a, int b) {
        return a + b;
    }

    public Integer scadere(int a, int b) {
        return a - b;
    }

    public Integer inmultire(int a, int b) {
        return a * b;
    }

    public Integer impartire(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Impartire la zero nu este permisa.");
        }
        return a / b;
    }

    public Integer adunare(int a, int b, int c) {
        return a + b + c;
    }
}