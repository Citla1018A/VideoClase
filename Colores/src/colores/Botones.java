/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colores;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 *
 * @author Citlalli
 */
public class Botones extends JPanel {
    private JButton btnGenerar;

    private Interface listener;


    public Botones() {
        super.setLayout(new GridLayout(2,1, 10, 20));

        btnGenerar = new JButton("Generar");
        btnGenerar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                listener.generar();
            }
        });

        super.add(btnGenerar);
    }


    public void setListener(Interface listener) {
        this.listener = listener;
    }
}
