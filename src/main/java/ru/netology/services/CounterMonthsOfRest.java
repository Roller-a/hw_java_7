package ru.netology.services;

public class CounterMonthsOfRest {

    public int calcRest(int income, int expenses, int threshold) {
        int money = 0;
        int count = 0;
        for (int month = 0; month < 13; month++) {
            if (money < threshold) {
                money = money + income - expenses;
            } else {
                count = count + 1;
                money = money - threshold;
                money = Math.round(money / 3);
            }
        }
        return count;
    }
}
