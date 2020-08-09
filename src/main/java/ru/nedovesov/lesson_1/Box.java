package ru.nedovesov.lesson_1;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class Box<T extends Fruit> {
    private List<T> fruitBox = new ArrayList<T>();

    public Box(List<T> fruitBox) {
        this.fruitBox = fruitBox;
    }

    public Box(@NotNull T... fruit) {
        for (T i:fruit){
            fruitBox.add(i);
        }
    }

    public void addFruitToBox(T fruit){
        fruitBox.add(fruit);
    }

    public float getWeight(){
        float weightBox = 0.0f;
        for (int i = 0; i < fruitBox.size(); i++){
            weightBox += fruitBox.get(i).getWEIGHT();
        }
        return weightBox;
    }

    public boolean compareBoxFruit(@NotNull Box box){
        return this.getWeight() == box.getWeight();
    }

    public void containsThisBoxToAnotherBox(Box<T> anotherBox){
        for (int i = 0; i < fruitBox.size(); i++) {
            anotherBox.addFruitToBox(fruitBox.get(i));
        }
        fruitBox.clear();
    }
}
