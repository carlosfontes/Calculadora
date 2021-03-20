package com.calculadora;

import java.awt.GridLayout;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Tela extends JPanel {
    private JTextField tela;

    public Tela() {
        initComponents();
    }
    
    private void initComponents() {
        this.setLayout(new GridLayout(1, 1));

        tela = new JTextField("0");
        tela.setHorizontalAlignment(JTextField.RIGHT);
        this.add(tela);
    }

    public void setValue(String value) {
        this.tela.setText(value);
    } 
}
