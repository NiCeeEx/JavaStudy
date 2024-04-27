package org.example;


import java.time.LocalDate;
import java.time.Month;

public class Main {

    public static void main(String[] args) {
        Human dimon = new Human();
        dimon.work = new Work();
        dimon.work.instrument = new Instrument();
        dimon.work.instrument.instrumentName = "molotok";
        dimon.work.instrument.price = 400;
        System.out.println(dimon.work.instrument.instrumentName);
        dimon.work.workingTime = 220;
        dimon.work.totalWorkingTime = 225;
        dimon.name = "dima";
        dimon.birthday = LocalDate.of(2002, Month.APRIL, 16);
        System.out.println(dimon.isWorkingNow());
        dimon.doWork(5);
        System.out.println(dimon.isWorkingNow());

//        boolean isBirthday = dimon.isBirthday();
//        System.out.println(isBirthday);
  //      boolean birthday = dimon.isBirthday();

 //       System.out.println(birthday);
    }

}