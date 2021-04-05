package com.company;

public class House implements Open_Close{

    int floor;
    String finishing_house;
    String variety;
    float square_house;
    boolean parking;
    int price_square;

    public House() {

    }

    public House(int floor, String finishing_house, String variety, float square_house, boolean parking, int price_square) {
        this.floor = floor;
        this.finishing_house = finishing_house;
        this.variety = variety;
        this.square_house = square_house;
        this.parking = parking;
        this.price_square = price_square;
    }

    @Override
    public void house_open_close(int a) {
        if (a == OPEN)
            System.out.println("Дом открыт! Добро пожаловать!");
        else if (a == CLOSE)
            System.out.println("Дом закрыт!");
    }

    public void cost() {
        System.out.println("Общая стоимость дома составляет: " + price_square*square_house + " тыс.рублей");
    }

}
