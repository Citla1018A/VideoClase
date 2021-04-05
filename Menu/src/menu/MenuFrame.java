/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menu;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
/**
 *
 * @author Citlalli
 */
public class MenuFrame extends JFrame  {
     private MenuOpc menusito;

    public MenuFrame() {
        this.setTitle("Menu");
        this.setSize(500, 500);
        this.getContentPane().setBackground(Color.BLACK);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        menusito = new MenuOpc();
        menusito.setListener(new MenuListener() {
            @Override
            public void miNuevoButtonClick() {
                JOptionPane.showMessageDialog(MenuFrame.this,
                        "Crear Nuevo Archivo",
                        "Nuevo",
                        JOptionPane.INFORMATION_MESSAGE
                );
            }

            @Override
            public void miAbrirButtonClick() {
                JOptionPane.showMessageDialog(MenuFrame.this,
                        "Abrir Archivo",
                        "Abrir",
                        JOptionPane.INFORMATION_MESSAGE
                );
            }

            @Override
            public void miSalirButtonClick() {
                System.exit(0);
            }

            @Override
            public void miAcercaDeButtonClick() {
                JOptionPane.showMessageDialog(MenuFrame.this,
                        "INFORMACIÓN",
                        "Acerca de",
                        JOptionPane.ERROR_MESSAGE
                );
            }
        });
        this.add(menusito, BorderLayout.NORTH);

        this.setVisible(true);
    }
}
