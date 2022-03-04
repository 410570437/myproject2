package com.turtle;

public class Scoring {
    public static void main(String[] args) {
        Student jack = new Student();
        jack.name = "jack";
        jack.english = 75;
        jack.math = 85;
        Student anny = new Student();
        anny.name = "anny";
        anny.english = 80;
        anny.math = 90;
        System.out.println(jack.name + jack.english + jack.math);
    }
}
