package com.company;

public class Girl extends Human {

    String name;
    String color_eyes;
    String color_hair;
    int age;
    float height;


    public Girl() {

    }

    public Girl(String color_eyes, String color_hair, float height, String name, int age) {
        this.color_eyes = color_eyes;
        this.color_hair = color_hair;
        this.height = height;
        this.name = name;
        this.age = age;
    }

    @Override
    public void go_to_house() {
        System.out.println("Проходим в дом...");
    }

    @Override
    public void petting() {
        System.out.println("Девушка гладит жирафа");
    }

    @Override
    public void speak() {
        System.out.println("приятно познакомиться!");
    }

    @Override
    public void walk() {
        System.out.println("Прогуливаемся до жирафа...");
    }

    @Override
    public void explore_the_room() {
        System.out.println("Осматривают комнату...");
    }

    @Override
    public void go_to_room() {
        System.out.println("Проходим в комнату...");
    }
}
