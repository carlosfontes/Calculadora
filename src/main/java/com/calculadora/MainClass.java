package com.calculadora;

import java.awt.EventQueue;

public class MainClass {

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {

                Calculadora calc = new Calculadora();
                calc.setVisible(true);
            }
        });
    }
}
