package com.calculadora;

import java.awt.EventQueue;

public class MainClass {

	//Alterar Classe interna anônima por Lambda
    public static void main(String[] args) {
        EventQueue.invokeLater(Calculadora::new);
    }
}
