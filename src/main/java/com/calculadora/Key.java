package com.calculadora;

import java.util.function.BiConsumer;

enum Key {
    // Numbers
    ZERO    ("0", Calculadora::pressedNumber),
    ONE     ("1", Calculadora::pressedNumber),
    TWO     ("2", Calculadora::pressedNumber),
    THREE   ("3", Calculadora::pressedNumber),
    FOUR    ("4", Calculadora::pressedNumber),
    FIVE    ("5", Calculadora::pressedNumber),
    SIX     ("6", Calculadora::pressedNumber),
    SEVEN   ("7", Calculadora::pressedNumber),
    EIGHT   ("8", Calculadora::pressedNumber),
    NINE    ("9", Calculadora::pressedNumber),
    // Operadors
    DIVIDE  ("/", Calculadora::pressedOperador),
    MULTIPLY("x", Calculadora::pressedOperador),
    MINUS   ("-", Calculadora::pressedOperador),
    EQUAL   ("=", Calculadora::pressedOperador),
    PLUS    ("+", Calculadora::pressedOperador),
    // Other Keys
    MPLUS   ("M+",Calculadora::pressedEmpty),
    MMINUS  ("M-",Calculadora::pressedEmpty),
    PERCENT ("%", Calculadora::pressedEmpty),
    DOT     (".", Calculadora::pressedDot),
    CLEAR   ("C", Calculadora::pressedClear);

    private String caption;
    private BiConsumer<Calculadora,String> action;

    Key(String caption, BiConsumer<Calculadora,String> action){
        this.caption = caption;
        this.action = action;
    }

    @Override
    public String toString() {
        return caption;
    }

    public BiConsumer<Calculadora, String> getAction() {
        return action;
    }
}
