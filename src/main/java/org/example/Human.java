package org.example;

import java.time.LocalDate;

public class Human {
    LocalDate birthday;
    String name;


    public boolean isBirthday() {
        LocalDate now = LocalDate.now();

        return now.getMonth() == birthday.getMonth()
                && now.getDayOfMonth() == birthday.getDayOfMonth();
    }
}
