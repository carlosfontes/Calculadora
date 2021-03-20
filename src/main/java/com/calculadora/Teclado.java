package com.calculadora;

import java.awt.GridLayout;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;

class Teclado extends JPanel{
    
    private final ActionListener actionListener;
    
    Teclado(ActionListener actionListener){
        this.actionListener = actionListener;
        initComponents();
    }
    
    private final String[][] mapaTeclas = {
        {"M+","M-","%","C"},
        {"7","8","9","/"},
        {"4","5","6","x"},
        {"1","2","3","-"},
        {"0",".","=","+"}
    };
    
    private void initComponents(){
        this.setLayout(new GridLayout(mapaTeclas.length,mapaTeclas.length));
        
        for(String[] line : mapaTeclas){
            for(String caption: line){
                JButton btn = new JButton(caption);
                btn.addActionListener(actionListener);
                this.add(btn);
            }
        }
    }   
}
