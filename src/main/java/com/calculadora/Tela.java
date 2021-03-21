package com.calculadora;

import java.awt.GridLayout;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Tela extends JPanel {
    private JTextField telaCampoTexto;

    public Tela() {
        initComponents();
    }
    
    private void initComponents() {
        this.setLayout(new GridLayout(1, 1));

        telaCampoTexto = new JTextField("0");
        telaCampoTexto.setHorizontalAlignment(SwingConstants.RIGHT);
        this.add(telaCampoTexto);
    }

    public void setValue(String value) {
        this.telaCampoTexto.setText(value);
    } 
}
