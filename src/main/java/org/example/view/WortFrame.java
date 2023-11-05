package org.example.view;

import javax.swing.*;

public class WortFrame extends JFrame {
    public WortFrame(WortPanel panel) {
        super("Worttrainer");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setBounds(100, 100, 600, 500);
        this.setLocationRelativeTo(null);
        this.add(panel);
        this.setVisible(true);
    }



}
