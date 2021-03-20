package com.calculadora;

import java.awt.GridLayout;
import javax.swing.JPanel;
import javax.swing.JTextField;

 class Tela extends JPanel {
    private JTextField tela;

     Tela() {
        initComponents();
    }
    
    private void initComponents() {
        this.setLayout(new GridLayout(1, 1));

        tela = new JTextField("0");
        tela.setHorizontalAlignment(JTextField.RIGHT);
        this.add(tela);
    }

     void setValue(String value) {
        this.tela.setText(value);
    } 
}
