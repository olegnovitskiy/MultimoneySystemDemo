package com.fmdev.tdd.multimoney;

public class Money {
    protected int amount;

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

    public static Dollar dollar(int amount) {
        return new Dollar(amount);
    }
}
