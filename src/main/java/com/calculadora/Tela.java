package com.calculadora;

import java.awt.*;
import java.util.OptionalDouble;
import javax.swing.JPanel;
import javax.swing.JTextField;

class Tela extends JPanel {

    private JTextField tela;
    private final StringBuilder telaValor;

    Tela() {
        initComponents();
        telaValor = new StringBuilder(32);
    }

    private void initComponents() {
        this.setLayout(new GridLayout(1, 1));

        tela = new JTextField("0");
        tela.setFont(new Font("Consolas", Font.PLAIN, 40));
        tela.setFocusable(false);
        tela.setHorizontalAlignment(JTextField.RIGHT);
        tela.setMaximumSize(tela.getPreferredSize());
        this.add(tela);
    }

    private boolean hasFraction(double value) {
        return Math.round(value) != value;
    }

    void setValue(double value) {
        tela.setText(hasFraction(value)
                ? Double.toString(value)
                : Long.toString((long) value));
    }

    OptionalDouble getValue() {
        if(hasValue()){
            double value = Double.parseDouble(telaValor.toString());
            this.clear();
            return OptionalDouble.of(value);
        }
        return OptionalDouble.empty();
    }

    void append(String number) {
        telaValor.append(number);
        tela.setText(telaValor.toString());
    }

    private boolean hasValue() {
        return telaValor.length() > 0;
    }

    void clear() {
        telaValor.delete(0, telaValor.length());
        tela.setText("0");
    }

    void dotPressed() {
        if (telaValor.indexOf(".") == -1)
            telaValor.append('.');
    }
}