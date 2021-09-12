package com.company;

public class Contribution {
    double pledge(double amount, int period, double percent) {
        return ((amount*percent*period)/365)/100;
    }
}
