package ru.nedovesov.lesson_1;

public abstract class Fruit {
    private final float WEIGHT;

    protected Fruit(float weight) {
        WEIGHT = weight;
    }

    public float getWEIGHT() {
        return WEIGHT;
    }
}
