package org.example;

import java.time.LocalDate;

public class Human {
    LocalDate birthday;
    String name;
    Work work;

    public Human(LocalDate birthday, String name) {
        this.birthday = birthday;
        this.name = name;
    }

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

    public boolean isWorkingNow() {
        int hours = work.getHours();
        boolean a = 0 < hours;
        return a;


    }

    public void doWork(int time) {
        work.instrument.doWork();
        work.workingTime = time + work.workingTime;

    }
}
