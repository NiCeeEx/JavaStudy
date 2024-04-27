package org.example;

import java.time.LocalDate;

public class Work {
    int totalWorkingTime;
    int workingTime;

    public int getHours(){
        int hours = totalWorkingTime - workingTime;
        return hours;
    }


}
