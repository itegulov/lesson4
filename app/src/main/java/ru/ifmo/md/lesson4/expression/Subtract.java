package ru.ifmo.md.lesson4.expression;

public class Subtract extends BinaryOperator {
    public Subtract(Expression left, Expression right) {
        super(left, right, "-");
    }

    @Override
    protected double operation(double a, double b) {
        return a - b;
    }
}
