package com.calculadora;


import java.awt.*;
import java.util.Arrays;
import java.util.function.BiConsumer;
import javax.swing.JButton;
import javax.swing.JPanel;

import static com.calculadora.Key.*;

class Teclado extends JPanel {

    private final Calculadora calculadora;

    Teclado(Calculadora calculadora) {
        this.calculadora = calculadora;
        initComponents();
    }

    private void initComponents() {
        this.setLayout(new GridLayout(keyMap.length, keyMap.length));

        Arrays.stream(keyMap)
                .flatMap(Arrays::stream)
                .map(KeyButton::new)
                .forEach(this::add);
    }

    private final Key[][] keyMap = {
            {MPLUS, MMINUS, PERCENT, CLEAR    },
            {SEVEN, EIGHT,  NINE,    DIVIDE   },
            {FOUR,  FIVE,   SIX,     MULTIPLY },
            {ONE,   TWO,    THREE,   MINUS    },
            {ZERO,  DOT,    EQUAL,   PLUS     }
    };

    private class KeyButton extends JButton implements Command {

        private BiConsumer<Calculadora, String> consumer;

        KeyButton(Key key) {
            super(key.toString());
            this.addActionListener(calculadora);
            this.consumer = key.getAction();
            setFont(new Font("Consolas", Font.BOLD, 30));
            setFocusable(false);
        }

        @Override
        public void execute() {
            consumer.accept(calculadora, getText());
        }
    }
}