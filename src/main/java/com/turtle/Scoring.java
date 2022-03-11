package com.turtle;

public class Scoring {
    public static void main(String[] args) {
        Student jack = new Student("jack");
        jack.name = "jack";
        jack.english = 75;
        jack.math = 85;
        Student hank = new Student("hank", 60 ,50);
        Student s = new Student();
        GraduateStudent jane = new GraduateStudent("jane",80,90,58);
        jane.name = "Jane";

        jack.print();
        hank.print();
        jane.print();
    }
}
