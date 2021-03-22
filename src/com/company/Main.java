package com.company;

public class Main {

    public static void main(String[] args) {
     int yearOfBirthday = 2002;
     int monthOfBirthday = 4;
     int dayOfBirthday = 14;
     int sum = yearOfBirthday + monthOfBirthday + dayOfBirthday;
        System.out.println("Сумма моего года, месяца и дня рождения: "+sum);
        boolean monthBiggerDay = monthOfBirthday > dayOfBirthday;
        System.out.println("Месяц моего рождения больше даты рождения: "+monthBiggerDay);
        char[] name = {'н','и','к','и','т','а'};
        System.out.print("Массив с моим именем: ");
        for (int i = 0; i < 6 ;i++)
        {
            System.out.print(name[i]);
        }
        System.out.println();
        double myAge = 18;
        double partYear = 11.0 / 12.0;
        double sum2 = myAge + partYear;
        System.out.println("Мне "+sum2+" лет");
    }
}

