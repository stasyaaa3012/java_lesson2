package com.company;

public class Boy extends Human {

    String name;
    String profession;
    String color_hair;
    int age;
    float height;

    public Boy() {

    }

    public Boy(String profession, String color_hair, float height, String name, int age) {
        this.profession = profession;
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
        System.out.println("Парень гладит жирафа");
    }

    @Override
    public void speak() {
        System.out.println("Приятно познакомиться!");
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
