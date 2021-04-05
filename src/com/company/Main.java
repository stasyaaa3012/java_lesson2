package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        Scanner in = new Scanner(System.in);

        Girl girl = new Girl("зелеными", "брюнетка", 1.65f, "Мария", 24);
        System.out.println("Клиент: прекрасная " + girl.age + "-летняя " + girl.color_hair + ", по имени " + girl.name + ", с прекрасными " +
                girl.color_eyes + " глазами и ростом " + girl.height + " м.");
        System.out.println("=========================");
        House house = new House(3, "кирпич", "коттеджа", 145.76f, false, 78);
        if (house.parking == true)
            System.out.println("Вы находитесь у " + house.variety + " с отделкой под " + house.finishing_house +
                    ". В данном доме, площадью " + house.square_house + " кв.м., " + house.floor + " этажа. Парковка имеется. Цена за кв.м. "
                    + house.price_square + " тыс.руб.");
        else
            System.out.println("Вы находитесь у " + house.variety + " с отделкой под " + house.finishing_house +
                    ". В данном доме, площадью " + house.square_house + " кв.м., " + house.floor + " этажа. Парковка отсутствует. Цена за кв.м. "
                    + house.price_square + " тыс.руб.");
        house.cost();
        house.house_open_close(1);
        girl.go_to_house();
        System.out.println("=========================");
        System.out.println("Что вы хотите посмотреть?");
        System.out.println("=========================");
        System.out.println("1. Посмотреть жирафа");
        System.out.println("2. Пройти комнату");
        System.out.println("3. Познакомиться с соседом");
        System.out.println("=========================");
        System.out.print("Введите номер варианта: ");
        String str1 = in.nextLine();
        int num;

        switch(num = Integer.parseInt(str1)) {
            case 1:
                Giraffe giraffe = new Giraffe(2, Gender.FEMALE, 3.23f, 12, "orange");
                System.out.println("Здесь на специально отведенном месте находится жираф в возрасте " + giraffe.age + ", ростом "
                        + giraffe.height + " метра. Это " + giraffe.gender.getPol() + " и цвет её шерсти - " + giraffe.color);
                System.out.print("Хотите ли вы подойти поближе и погладить жирафа? Введите 'Да' или 'Нет': ");
                String str2 = in.nextLine();
                if ("Да".equalsIgnoreCase(str2)) {
                    girl.walk();
                    Thread.sleep(1000);
                    girl.petting();
                    giraffe.voice();
                }
                else if ("Нет".equalsIgnoreCase(str2)) {
                    System.out.println("Если вам страшно, тогда я дам команду жирафу оставаться на своём месте.");
                    Thread.sleep(500);
                    giraffe.commanding(3);
                }
                break;
            case 2:
                Room room = new Room(23.1f, 2.56f, 16.5f, 2, true);
                System.out.println("Тогда пройдемте в гостиную.");
                girl.go_to_room();
                Thread.sleep(1000);
                if (room.finishing == true)
                    System.out.println("Итак, данная гостиная комната имеет следующие размеры: длина - " + room.length + " м., высота потолка - "
                            + room.height + " м., ширина - " + room.wight + ". В комнате окон - " + room.num_windows + ". Отделка базовая.");
                else
                    System.out.println("Итак, данная гостиная комната имеет следующие размеры: длина - " + room.length + " м., высота потолка - "
                            + room.height + " м., ширина - " + room.wight + ". В комнате окон - " + room.num_windows + ". Отделка отсутствует.");
                girl.explore_the_room();
                Thread.sleep(1000);
                room.getSquare(room.wight, room.length);
                break;
            case 3:
                Boy boy = new Boy("стоматолог-хирург", "брюнет", 1.98f, "Антон", 26);
                System.out.println("Познакомтесь, это " + boy.color_hair + " " + boy.name + ". Ему " + boy.age + " лет. Он " + boy.profession + ".");
                System.out.print(girl.name +", ");
                girl.speak();
                boy.speak();
                break;
            default:
                System.out.println("Такого варианта не существует! Попробуйте снова.");
                break;
        }
    }
}
