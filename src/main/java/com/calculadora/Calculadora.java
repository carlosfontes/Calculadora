package com.calculadora;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public final class Calculadora extends JFrame implements ActionListener {

    private double operador1;
    private boolean pontoPressionado = false;
    private final StringBuilder telaValor;
    private int operadorCount = 0;
    private Operador ultimoOperador = null;
    private Tela tela;

    private enum Operador {

        EQUAL, PLUS, MINUS, MULTIPLY, DIVIDE;
    }

    public Calculadora() {
        super("Calculadora");
        telaValor = new StringBuilder(32);
        initComponents();
        setSize(230, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    private void initComponents() {
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        tela = new Tela();
        panel.add(tela);

        panel.add(new Teclado(this));
        this.add(panel);
    }

    private void clearTela() {
        telaValor.delete(0, telaValor.length());
        tela.setValue("0");
    }

    private void pressedNumber(String number) {
        if (this.ultimoOperador == Operador.EQUAL) {
            ultimoOperador = null;
            clearTela();
            pontoPressionado = false;
        }

        telaValor.append(number);
        tela.setValue(telaValor.toString());
    }

    private void limparPressionado() {
        ultimoOperador = null;
        operador1 = 0;
        clearTela();
        operadorCount = 0;
    }

    private void calculate(Operador operator, double b) {
        switch (operator) {
            case PLUS:
                operador1 += b;
                break;
            case MINUS:
                operador1 -= b;
                break;
            case MULTIPLY:
                operador1 *= b;
                break;
            case DIVIDE:
                operador1 /= b;
                break;
        }
    }

    private void operadorPressionado(Operador operator) {

        double operador2 = telaValor.length() > 0
                ? Double.parseDouble(telaValor.toString()) : operador1;

        if (operator == Operador.EQUAL) {

            calculate(ultimoOperador, operador2);
            operadorCount = 0;

        } else {
            operadorCount++;
            if (operadorCount > 1) {
                calculate(operator, operador2);
            }else{
                operador1 = operador2;
            }
            clearTela();
        }
        if (pontoPressionado) {
            tela.setValue("" + operador1);
        } else {
            tela.setValue("" + (long) operador1);
        }
        this.ultimoOperador = operator;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        JButton src = (JButton) e.getSource();
        switch (src.getText()) {
            case "0":
            case "1":
            case "2":
            case "3":
            case "4":
            case "5":
            case "6":
            case "7":
            case "8":
            case "9":
                pressedNumber(src.getText());
                break;

            case "=":
                operadorPressionado(Operador.EQUAL);
                break;
            case "+":
                operadorPressionado(Operador.PLUS);
                break;
            case "-":
                operadorPressionado(Operador.MINUS);
                break;
            case "x":
                operadorPressionado(Operador.MULTIPLY);
                break;
            case "/":
                operadorPressionado(Operador.DIVIDE);
                break;
            case ".":
                if (!pontoPressionado) {
                    pontoPressionado = true;
                    telaValor.append('.');
                }
                break;
            case "C":
                limparPressionado();
                break;
        }
    }
}
