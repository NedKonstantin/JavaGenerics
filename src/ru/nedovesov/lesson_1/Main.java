package ru.nedovesov.lesson_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        taskOneAndTwo();
        taskThree();

    }

    public static void taskOneAndTwo(){
        ArrayParameters<Integer> firstObj = new ArrayParameters<Integer>(20, 30, 40, 54, 24, 12, 33);
        System.out.println(Arrays.toString(firstObj.getArr()));
        firstObj.changePlaceElements(2, 0);
        System.out.println(Arrays.toString(firstObj.getArr()));
        List<Integer> firstObjArrayList = firstObj.arrayToArrayList(firstObj.getArr());
        System.out.println(Arrays.toString(firstObjArrayList.toArray()));
    }

    public static void taskThree(){
        Box<Apple> appleBox1 = new Box<Apple>(new Apple(1.2f), new Apple(1.1f), new Apple(1.3f));
        Box<Apple> appleBox2 = new Box<Apple>(new Apple(1.0f), new Apple(1.4f), new Apple(1.5f));
        Box<Orange> orangeBox1 = new Box<Orange>(new Orange(1.5f), new Orange(1.6f), new Orange(1.7f));
        Box<Orange> orangeBox2 = new Box<Orange>(new Orange(1.4f), new Orange(1.3f), new Orange(1.4f));
        System.out.println(appleBox1.getWeight());
        System.out.println(appleBox2.getWeight());
        System.out.println(orangeBox1.getWeight());
        System.out.println(orangeBox2.getWeight());
        appleBox1.addFruitToBox(new Apple(1.1f));
        System.out.println(appleBox1.getWeight());
        System.out.println(appleBox1.compareBoxFruit(orangeBox2));
        appleBox1.containsThisBoxToAnotherBox(appleBox2);
        System.out.println(appleBox1.getWeight());
        System.out.println(appleBox2.getWeight());
    }
}
