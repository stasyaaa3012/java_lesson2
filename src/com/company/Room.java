package com.company;

public class Room extends House {

    float length, height, wight;
    int num_windows;
    boolean finishing;

    public Room() {

    }

    public Room(float length, float height, float wight, int num_windows, boolean finishing) {
        this.length = length;
        this.height = height;
        this.wight = wight;
        this.num_windows = num_windows;
        this.finishing = finishing;
    }

    public void getSquare (float wight, float length) {
        System.out.print("Общая площадь команты составляет: " + wight*length + " кв.м.");
    }

}
