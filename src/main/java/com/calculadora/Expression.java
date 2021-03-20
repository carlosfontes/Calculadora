package com.calculadora;

import java.util.OptionalDouble;

class Expression {

    private double operand;
    private int operandCount;
    private Operador operador = null;

    private double calculate(Operador newOperador, double newOperand) {

        if (newOperador == Operador.EQUAL) {
            operand = this.operador.apply(operand, newOperand);
            operandCount = 0;
        } else {
            operandCount++;
            operand = operandCount > 1 ? this.operador.apply(operand, newOperand)
                    : newOperand;
            this.operador = newOperador;
        }
        return operand;
    }

    double calculate(Operador newOperador, OptionalDouble newOperand) {
        return calculate(newOperador, newOperand.orElse(operand));
    }

    void clear(){
        operand = 0.0;
        operandCount = 0;
        operador = null;
    }
}