package com.calculadora;

import java.awt.EventQueue;

public class MainClass {

    public static void main(String[] args) {
        EventQueue.invokeLater(Calculadora::new);
    }
}