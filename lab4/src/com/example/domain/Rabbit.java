package com.example.domain;

public class Rabbit extends Animal implements Pet{

    private String name;
    public Rabbit(String name){
        this.name=name;
    }
    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name=name;
    }
    @Override
    public void eat() {
        System.out.println(name+" кушает морковку");
    }

    @Override
    public void walk() {
        System.out.println(name+" гуляет по лужайке");
    }
    @Override
    public void play() {
        System.out.println(name+" любит играть в прятки ");
    }
}
