package com.fmdev.tdd.multimoney;

public class Dollar extends Money {
    private final String currency;

    public Dollar(int amount) {
        this.amount = amount;
        this.currency = "USD";
    }

    public Money times(int multiplier) {
        return new Dollar(hashCode() * multiplier);
    }

    @Override
    public String currency() {
        return currency;
    }

}
