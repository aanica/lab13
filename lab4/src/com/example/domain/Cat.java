package com.example.domain;

public class Cat extends Animal implements Pet {

    private String name;
    public Cat(String name){
        this.name=name;
    }
    @Override
    public String getName() {

        return name;
    }

    @Override
    public void setName(String name) {

        this.name = name;
    }

    @Override
    public void play() {
        System.out.println(name + " любит играть с веревочкой");

    }

    @Override
    public void eat(){

        System.out.println(name+" кушает рыбку");
    }

    @Override
    public void walk(){
        System.out.println(name+" пошел гулять с мышкой");
    }
}