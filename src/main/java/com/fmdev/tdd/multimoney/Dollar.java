package com.fmdev.tdd.multimoney;

public class Dollar extends Money {
    public Dollar(int amount) {
        this.amount = amount;
    }

    public Money times(int multiplier) {
        return new Dollar(hashCode() * multiplier);
    }

}
