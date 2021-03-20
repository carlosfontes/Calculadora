package com.calculadora;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

public final class Calculadora extends JFrame implements ActionListener {

    private final Expression expression = new Expression();
    private Tela tela;

    public Calculadora() {
        super("Calculadora");
        initComponents();
        setSize(300, 350);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    private void initComponents() {
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        tela = new Tela();
        panel.add(tela);

        panel.add(new Keypad(this));
        this.add(panel);
    }

    void pressedNumber() {
        tela.append(number);
    }

    void pressedClear() {
        expression.clear();
        tela.clear();
    }

    void pressedOperador(String operador) {
        Operador.fromString(operador)
                .map(op->expression.calculate(op,tela.getValue()))
                .ifPresent(tela::setValue);
    }

    void pressedDot(String dot) {
        tela.dotPressed();
    }

    void pressedEmpty(String empty){
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Command command = (Command) e.getSource();
        command.execute();
    }
}