package org.example.view;

import org.example.controller.AuswahlIndex;
import org.example.controller.AuswahlRandom;
import org.example.controller.RechtschreibTrainer;

import javax.swing.*;

public class SpielStartPanel extends JPanel {


    public SpielStartPanel() {

        // Erstellen des Auswahl-Dialogs
        String[] options = {"Indexbasiert", "Zufallsbasiert"};
        int choice = JOptionPane.showOptionDialog(null, "Bitte wählen Sie die Spielweise:", "Spielstart",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);


        // Abhängig von der Auswahl des Benutzers
        if (choice == 0) {
            // Beenden der Auswahlanzeige

            // Indexbasiertes Spiel - öffne das Hauptfenster für indexbasiertes Spiel
            new RechtschreibTrainer(new AuswahlIndex());

        } else if (choice == 1) {
            // Beenden der Auswahlanzeige
            new RechtschreibTrainer(new AuswahlRandom());
        } else {
            // Der Benutzer hat abgebrochen oder ein unerwartetes Ereignis ist aufgetreten
            System.exit(0);
        };
    }
}
