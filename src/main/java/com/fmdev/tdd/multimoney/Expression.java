package com.fmdev.tdd.multimoney;

public interface Expression {
    Money reduce(Bank bank, String to);
}
