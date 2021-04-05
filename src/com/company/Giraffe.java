package com.company;

public class Giraffe extends Animal implements TranningAnimal {

    int weight, age;
    float height;
    Gender gender;
    String color;

    public Giraffe(){

    }

    public Giraffe(int weight, Gender gender, float height, int age, String color){
        this.weight = weight;
        this.gender = gender;
        this.height = height;
        this.age = age;
        this.color = color;
    }

    @Override
    public void eat() {
        System.out.println("Жираф ест...");
    }

    @Override
    public void sleep() {
        System.out.println("Sleeping zz-z-z-z...");
    }

    @Override
    public void voice() {
        System.out.println("Жираф издет какие-то свои звуки...");
    }

    @Override
    public void walk() {
        System.out.println("Жираф гуляет");
    }

    @Override
    public void run() {
        System.out.println("Жираф бегает");
    }

    @Override
    public void commanding(int n) {
        switch (n) {
            case STAND:
                System.out.println("Жираф выполняет команду СТОЯТЬ!");
                break;
            case TO_ME:
                System.out.println("Жираф выполняет команду КО МНЕ!");
                break;
            case VOTE:
                voice();
                break;
            case PLACE:
                System.out.println("Жираф выполняет команду МЕСТО!");
                break;
        }
    }
}
