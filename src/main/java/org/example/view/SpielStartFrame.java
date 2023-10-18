package org.example.view;

import javax.swing.*;

public class SpielStartFrame extends JFrame {
    public SpielStartFrame(SpielStartPanel spielStartPanel) {
        this.setSize(300, 200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.add(spielStartPanel);
        this.setVisible(true);
    }
}