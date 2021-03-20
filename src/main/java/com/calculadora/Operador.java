package com.calculadora;

import java.util.Map;
import java.util.Optional;
import java.util.function.DoubleBinaryOperator;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toMap;

enum Operador {
    EQUAL   ("=", (x, y) -> {throw new UnsupportedOperationException();}),
    PLUS    ("+", (x, y) -> x + y),
    MINUS   ("-", (x, y) -> x - y),
    MULTIPLY("x", (x, y) -> x * y),
    DIVIDE  ("/", (x, y) -> x / y);
	
    private final String symbol;
    private final DoubleBinaryOperator operador;

    private Operador(String symbol, DoubleBinaryOperator operador) {
        this.symbol = symbol;
        this.operador = operador;
    }

    @Override
    public String toString() {
        return symbol;
    }

    public double apply(double x, double y) {
        return operador.applyAsDouble(x, y);
    }
    
    // Implementing a fromString method on an enum type
    private static final Map<String, Operador> stringToEnum = Stream.of(values())
            .collect(toMap(Object::toString, e -> e));

    // Returns Operation for string, if any
    public static Optional<Operador> fromString(String symbol) {
        return Optional.ofNullable(stringToEnum.get(symbol));
    }
}
