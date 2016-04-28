package com.fmdev.tdd.multimoney;

public class Franc extends Money {
    public Franc(int amount) {
        this.amount = amount;
    }

    public Franc times(int multiplier) {
        return new Franc(amount * multiplier);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Money money = (Money) o;

        return amount == money.amount;

    }

    @Override
    public int hashCode() {
        return amount;
    }
}
