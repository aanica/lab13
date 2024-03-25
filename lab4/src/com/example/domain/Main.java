package com.example.domain;

public class Main {
    public static void main(String[] args) {
        Animal a;

        Cat c = new Cat("Мура");
        c.eat();
        c.walk();
        c.play();

        Rabbit r=new Rabbit("Ричард");
        r.eat();
        r.walk();
        r.play();
    }
}