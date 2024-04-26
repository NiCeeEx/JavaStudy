package org.example;

import java.time.LocalDate;
import java.time.Month;

public class Human {
    LocalDate birthday;
    String name;


    public boolean isBirthday() {
        LocalDate now = LocalDate.now();

        return now.getMonth() == birthday.getMonth()
                && now.getDayOfMonth() == birthday.getDayOfMonth();
    }

    public int getAge() { // задаем функцию
        LocalDate now = LocalDate.now(); // присваеваем к переменной результат функции
        int nowYear = now.getYear();
        int birthdayYear = birthday.getYear();
        int age = nowYear - birthdayYear;

        return age;
    }

    public int getAgeInMonth() {
        int res = getAge() * 12;
        return res;

    }

    public int getAgeInDays() {
        int a = getAgeInMonth() * 365;
        return a;
    }
}
