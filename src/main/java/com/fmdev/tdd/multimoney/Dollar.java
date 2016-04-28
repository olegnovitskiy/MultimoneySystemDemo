package com.fmdev.tdd.multimoney;

public class Dollar extends Money {
    public Dollar(int amount, String currency) {
        this.amount = amount;
        this.currency = "USD";
    }

    public Money times(int multiplier) {
        return new Dollar(hashCode() * multiplier, null);
    }

}
