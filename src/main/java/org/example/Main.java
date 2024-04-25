package org.example;


import java.time.LocalDate;
import java.time.Month;

public class Main {

    public static void main(String[] args) {
        //привет андрей
        //привет санек
        Human dimon = new Human();
        dimon.name = "dima";
        dimon.birthday = LocalDate.of(2002, Month.APRIL, 16);
        System.out.println(dimon.getAge());
//        boolean isBirthday = dimon.isBirthday();
//        System.out.println(isBirthday);
        boolean birthday = dimon.isBirthday();

        System.out.println(birthday);
    }

}