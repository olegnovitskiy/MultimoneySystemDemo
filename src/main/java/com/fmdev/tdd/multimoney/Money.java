package com.fmdev.tdd.multimoney;

public abstract class Money {
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

    public static Money dollar(int amount) {
        return new Dollar(amount);
    }

    public abstract Money times(int amount);

    public static Money franc(int amount) {
        return new Franc(amount);
    }
}
